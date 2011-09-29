package com.reviewboard;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.reviewboard.api.ReviewBoardApi;
import com.reviewboard.api.model.ReviewRequest;
import com.reviewboard.api.model.ReviewStatus;
import com.reviewboard.util.DateUtil;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class);

	
	public static void main(String arg[]) throws Exception{

		String host = "http://demo.reviewboard.org";
		ReviewBoardApi reviewBoardApi = new ReviewBoardApi(host);
		//listAllPedingReviewRequestFull;
		
		/*List<ReviewRequest> listReviewRequest = reviewBoardApi.listAllPedingReviewRequestFull();
		for (ReviewRequest reviewItem : listReviewRequest) {
			logger.info(reviewItem);
		}*/
		
		/*ReviewRequest reviewRequest = reviewBoardApi.getReviewRequest(new Long(46));
		logger.info(reviewRequest);*/
		Date dateStart = null;//DateUtil.toDate("2010-09-12 21:47:55");
		Date dateEnd = null;//DateUtil.toDate("2011-09-12 21:47:55");
		//String user="joker.selloff@gmail.com";
		String user="joker_selloff";
		List<ReviewRequest> listAllReviewRequest = reviewBoardApi.listAllReviewRequestFull(
				dateStart, dateEnd, ReviewStatus.all.name()
				,user
				,1000);
		for (ReviewRequest reviewRequest : listAllReviewRequest) {
			logger.info(reviewRequest);			
		}
		
	}
	
	
}
