/**
 * 
 */
package com.casehistoryweb.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.wicket.Application;
import org.apache.wicket.Page;
import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * @author abhinav
 */
public class CaseHistory extends WebApplication {

	private List<NewsItem> newsItems = Arrays.asList(new NewsItem("Queensday", "Celebrations in Amsterdam!"),
			new NewsItem("World Cup", "India win world cup!"), new NewsItem("LCA", "India test new LCA!"),
			new NewsItem("Weather", "Its fuckin hot here!"), new NewsItem("Power Cuts", "Fuckin power cut!"),
			new NewsItem("AC", "waiting for power to come back!"));

	public CaseHistory() {
	}

	@Override
	protected void init() {

	}

	public static CaseHistory get() {
		return (CaseHistory) Application.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends Page> getHomePage() {
		return Index.class;
	}

	@Override
	public Session newSession(Request request, Response response) {
		return new CaseHistorySession(request);
	}

	public List<NewsItem> getNewsItems() {
		System.out.println("newsItems = "+newsItems);
		return Collections.unmodifiableList(newsItems);
	}
}
