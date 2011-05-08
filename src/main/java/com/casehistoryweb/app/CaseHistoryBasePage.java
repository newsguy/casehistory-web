/**
 * 
 */
package com.casehistoryweb.app;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;

/**
 * @author abhinav
 * 
 */
public abstract class CaseHistoryBasePage extends WebPage {

	public CaseHistorySession getCaseHistorySession() {
		return (CaseHistorySession) getSession();
	}

	public List<NewsItem> getNewsItems() {
		List<NewsItem> newsItems = CaseHistory.get().getNewsItems();
		System.out.println("news items in base page = " + newsItems);

		return newsItems;
	}

	public RelevantNewsItems getRelevantNewsItems() {
		return getCaseHistorySession().getRelevantNewsItems();
	}
}
