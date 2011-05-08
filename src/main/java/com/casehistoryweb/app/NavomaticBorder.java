package com.casehistoryweb.app;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.markup.html.border.BoxBorder;

public class NavomaticBorder extends Border {

	private static final long serialVersionUID = 1L;

	public NavomaticBorder(final String componentName) {
		super(componentName);

		add(new BoxBorder("navigationBorder"));
		add(new BoxBorder("bodyBorder"));
	}

}