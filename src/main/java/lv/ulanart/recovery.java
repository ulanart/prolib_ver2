package lv.ulanart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class recovery extends WebPage 
{	
	private TextField email;
	private Button button;
	
	public recovery(final PageParameters parameters)
	{
		//creating Form object > Name recovery
		Form recovery = new Form("recovery");
		
		//creating new TextField Component
		email = new TextField("lost",new Model());
		recovery.add(email);

		//Submitting email from a field
		recovery.add(new Button("button")
		{
			@Override
			public void onSubmit()
			{
				//gets string from a TextField
				String value = (String)email.getModelObject();
				email.setModelObject("");
			}
		});
	}
}
