package lv.ulanart;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class SignIn extends WebPage 
{
	//
	public TextField user;
	public TextField pass;
	public Button button;
	public Link recoverLnk;
	public Link register;
	//
	public SignIn(final PageParameters parameters)
	{
		super(parameters);
		Form signin = new Form("signin");
		
		user = new TextField("user", new Model());
		signin.add(user);
		
		pass = new TextField("pass",new Model());
		signin.add(pass);
		
		signin.add(new Link("recoverylnk")
		{
			@Override
			public void onClick()
			{
				setResponsePage(recovery.class);
			}
		});
		signin.add(new Link("register")
		{
			@Override
			public void onClick()
			{
				setResponsePage(SignUp.class);
			}
		});
	add(signin);
	}
}