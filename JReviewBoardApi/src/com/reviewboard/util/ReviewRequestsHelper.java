package com.reviewboard.util;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import com.reviewboard.api.model.ReviewRequest;
import com.reviewboard.api.model.reviewrequests.Changenum;
import com.reviewboard.api.model.reviewrequests.Item;
import com.reviewboard.api.model.reviewrequests.Links;

public class ReviewRequestsHelper {
	private static Logger logger = Logger.getLogger(ReviewRequestsHelper.class);

	private static final String SUMMARY="summary";
	private static final String ID="id";
	private static final String TIME_ADDED="time_added";
	private static final String BRANCH="branch";
	private static final String STATUS="status";
	private static final String DESCRIPTION="description";

	public static ReviewRequest decode(Item item) throws Exception {
		ReviewRequest reviewItem=null;
		
			if (item == null) {
				throw new Exception("Item is invalid");

			}
			if(item.getContent()==null){
				throw new Exception("Item Content is empty");
			}
			reviewItem = new ReviewRequest();
			
			List<Object> content = item.getContent();

			for (Object object : content) {
				
				if (object instanceof JAXBElement) {
					JAXBElement poElement = (JAXBElement) object;
					//logger.info(poElement.getValue());
					//logger.info("Name :" + poElement.getName() + " - "+ poElement.getValue());
										
					if(SUMMARY.equals(poElement.getName().toString().trim())){
						String summary = (String)poElement.getValue();
						reviewItem.setSummary(summary);
					}
					else if(ID.equals(poElement.getName().toString().trim())){
						BigInteger id = (BigInteger)poElement.getValue();
						reviewItem.setId(new Long(id.longValue()));
					}
					else if(TIME_ADDED.equals(poElement.getName().toString().trim())){
						String date = (String)poElement.getValue();
						reviewItem.setTimeAdded(DateUtil.toDate(date));
					}
					else if(STATUS.equals(poElement.getName().toString().trim())){
						String status = (String)poElement.getValue();
						reviewItem.setStatus(status);
					}
					else if(BRANCH.equals(poElement.getName().toString().trim())){
						String branch = (String)poElement.getValue();
						reviewItem.setBranch(branch);
					}
					else if(DESCRIPTION.equals(poElement.getName().toString().trim())){
						String desc = (String)poElement.getValue();
						reviewItem.setDescription(desc);
					}
					

				} else if (object instanceof Changenum) {
					Changenum chagenNum = (Changenum) object;
					//logger.info(chagenNum);
				} else if (object instanceof Links) {
					Links links = (Links) object;
					//logger.info(links);
				}
			}
		
		return reviewItem;
	}
}
