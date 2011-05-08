/**
 * 
 */
package com.casehistoryweb.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author abhinav
 */
public class RelevantNewsItems implements Serializable {

	private List<NewsItem> newsItems = new ArrayList<NewsItem>();
	private List<String> strings = new ArrayList<String>();

	public List<NewsItem> getNewsItems() {
		return newsItems;
	}

	public void setNewsItems(List<NewsItem> newsItems) {
		this.newsItems = newsItems;
	}

	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}

}
