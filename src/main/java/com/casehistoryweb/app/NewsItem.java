/**
 * 
 */
package com.casehistoryweb.app;

import java.io.Serializable;

/**
 * @author abhinav
 * 
 */
public class NewsItem implements Serializable {

	private String title;
	private String content;

	/**
	 * @param title
	 * @param content
	 */
	public NewsItem(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "NewsItem [title=" + title + ", content=" + content + "]";
	}

}
