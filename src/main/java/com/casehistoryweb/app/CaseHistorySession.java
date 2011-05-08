/**
 * 
 */
package com.casehistoryweb.app;

import org.apache.wicket.Request;
import org.apache.wicket.protocol.http.WebSession;

/**
 * @author abhinav
 */
public class CaseHistorySession extends WebSession {

	private RelevantNewsItems relevantNewsItems = new RelevantNewsItems();

	public CaseHistorySession(Request request) {
		super(request);
	}

	public RelevantNewsItems getRelevantNewsItems() {
		return relevantNewsItems;
	}

}
