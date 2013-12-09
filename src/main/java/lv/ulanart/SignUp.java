package lv.ulanart;



import lv.domain.User;
import lv.utils.HibernateUtil;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SignUp extends WebPage 
{
	private Button button;
	private TextField emailField;
	private TextField userField;
	private TextField passField;
	
	public SignUp(final PageParameters parameters)
	{
		super(parameters);
		Form sign = new Form("sign");
		//creating new objects emailField , userField, passField
		//email field
		emailField = new TextField("emailField",new Model());
		sign.add(emailField);
		
		//user field
		userField = new TextField("userField",new Model());
		sign.add(userField);
		//password field
		passField = new  TextField("passField",new Model());
		sign.add(passField);
		//add Button
		sign.add(new Button("button")
		{
			@Override
			public void onSubmit()
			{
				//gets value from Email,username,password textbox
				String Eval = (String)emailField.getModelObject();
				String Uval = (String)userField.getModelObject();
				String Pval = (String)passField.getModelObject();
				
				User user = new User();
				user.setEmail(Eval);
				user.setUsername(Uval);
				user.setPassword(Pval);
				
				//save user
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction transaction = session.beginTransaction();
				session.save(user);
				transaction.commit();
				session.close();
				
				//clears all fields
				emailField.setModelObject("");
				userField.setModelObject("");
				passField.setModelObject("");
			}
		});
		add(sign);
	}
}