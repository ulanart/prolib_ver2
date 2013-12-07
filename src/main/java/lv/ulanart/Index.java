package lv.ulanart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class Index extends WebPage {
	private static final long serialVersionUID = 1L;

	public Index(final PageParameters parameters) {
		super(parameters);
		Form index = new Form("index");
		//Sign Up Button
		index.add(new Button("button")
		{
			@Override
			public void onSubmit()
			{
				setResponsePage(SignUp.class);
			}
		});
		index.add(new Button("confirm")
		{
			@Override
			public void onSubmit()
			{
				setResponsePage(SignIn.class);
			}
		});
		add(index);
		add(new Label("greetings","Hello! We're happy to see You!"));
    }
}
