package com.casehistoryweb.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

public class NavomaticApplication extends WebApplication {

	public NavomaticApplication() {
	}

	public Class<? extends WebPage> getHomePage() {
		return Page1.class;
	}

}