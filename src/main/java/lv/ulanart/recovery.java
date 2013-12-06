package lv.ulanart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class recovery extends WebPage
{
	public recovery(final PageParameters parameters)
	{
		super(parameters);
		
		add(new Label("Info","Please enter Email and press 'Confirm Button'"));
	}
}
