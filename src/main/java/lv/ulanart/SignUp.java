package lv.ulanart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

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
				//gets value from Email textbox
				String Eval = (String)emailField.getModelObject();
				//label.setModelObject(Eval);
				emailField.setModelObject("");
				
				//gets value from Email textbox
				String Uval = (String)userField.getModelObject();
				//label.setModelObject(Uval);
				userField.setModelObject("");
				
				//gets value from Email textbox
				String Pval = (String)passField.getModelObject();
				//label.setModelObject(Pval);
				passField.setModelObject("");
			}
		});
		add(sign);
	}
}
