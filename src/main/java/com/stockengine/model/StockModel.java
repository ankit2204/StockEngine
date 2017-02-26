package com.stockengine.model;

import com.stockengine.rules.*;
import java.util.List;
import java.util.Map;

public class StockModel {
	
	private class StockIdentifier{
		
		private String stockName;
		private String stockExchange;
		
		public String getStockName() {
			return stockName;
		}
		public void setStockName(String stockName) {
			this.stockName = stockName;
		}
		public String getStockExchange() {
			return stockExchange;
		}
		public void setStockExchange(String stockExchange) {
			this.stockExchange = stockExchange;
		}
		
		
	}
	
	private Map<StockIdentifier,List<StockRules>> stock;

}
