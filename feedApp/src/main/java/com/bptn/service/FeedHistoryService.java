package com.bptn.service;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bptn.exceptions.InvalidHistoryException;
import com.bptn.exceptions.InvalidUserNameException;
import com.bptn.models.History;
import com.bptn.repository.FeedHistoryRepository;

@Service
public class FeedHistoryService {

		private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
		
		
		@Autowired
		private FeedHistoryRepository feedHistoryRepository;
		
		@Autowired
		private UserService userService;
		
		
		public List <History> getPostsByUsername(String username) throws InvalidUserNameException{
			
			LOGGER.info("retrieving History from DB by username");
			
			userService.validateUserId(username);
			
			List <History> history = feedHistoryRepository.findByUsername(username);
			
			history = removeEmptyHistory(history);
			
			LOGGER.debug("Feels History()",history);
			
			return history;
		}
		
		public History getPostsByPostID(String postID) throws InvalidHistoryException{
			
			LOGGER.info("retreiving History from DB by postID");
			
			History history = feedHistoryRepository.findByPostID(postID);
		
			if(history==null) {
				throw new InvalidHistoryException("History data doesn't exist");
				
			}
			
			LOGGER.debug("Feeds History = {}", history);
			
			return history;
		
		}
		
		public List <History> getPostsByPostType(String postType) throws InvalidHistoryException{
			
			LOGGER.info("retrieving History from DB by postType");
			
			List <History> history = feedHistoryRepository.findByPostType(postType);
			
			if(history==null) {
				throw new InvalidHistoryException("Hisotry data doesn't exist");
			}
			
			LOGGER.debug("Feeds History = {}",history);
			
			return history;
			
		}
		
		public void deleteHistoryByPostType(String postType)throws InvalidHistoryException{
			
			try {
				feedHistoryRepository.deleteByPostType(postType);
				LOGGER.info("Deleted History from DB by postType");
			}catch(Exception e) {
				throw new InvalidHistoryException("History doesn't exist");
			}
		}
		
		
		private List <History> removeEmptyHistory(List <History> history){
			
			List <History> resultHistory = new LinkedList<>();
			
			for(History historyData:history) {
				if(historyData.getPostID()!=null && !historyData.getPostID().isEmpty()) {
					resultHistory.add(historyData);
				}
			}
			
			return resultHistory;
			
		}
}
