/**
 * 
 */
package com.casehistoryweb.app;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.PropertyModel;

/**
 * @author abhinav
 */
public class Index extends CaseHistoryBasePage {

	public Index() {
		add(new ListView<NewsItem>("newsitems", getNewsItems()) {
			@Override
			protected void populateItem(ListItem<NewsItem> item) {
				NewsItem newsItem = (NewsItem) item.getModelObject();
				item.add(new Label("title", newsItem.getTitle()));
				item.add(new Label("content", newsItem.getContent()));
				item.add(new Link<NewsItem>("add", item.getModel()) {
					private static final long serialVersionUID = 1L;

					@Override
					public void onClick() {
						NewsItem selected = (NewsItem) getModelObject();
						getRelevantNewsItems().getNewsItems().add(selected);
					}
				});
			}
		});

		add(new ListView("relevantNewsItems", new PropertyModel(this, "relevantNewsItems.newsItems")) {
			@Override
			protected void populateItem(ListItem item) {
				NewsItem newsItem = (NewsItem) item.getModelObject();
				item.add(new Label("title", newsItem.getTitle()));
				item.add(new Link<NewsItem>("remove", item.getModel()) {
					@Override
					public void onClick() {
						NewsItem selected = (NewsItem) getModelObject();
						getRelevantNewsItems().getNewsItems().remove(selected);
					}
				});
			}
		});
	}

}
