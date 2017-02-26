package com.stockengine.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.stockengine.apiclient.GoogleFinanceClient;

@Component
public class StockFetchingTask {
	
	private GoogleFinanceClient apiClient;
	
	@Scheduled(fixedRate = 30000)
	public void queryStockData(){
		
		
		
	}

}
