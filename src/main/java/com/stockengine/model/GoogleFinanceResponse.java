package com.stockengine.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class GoogleFinanceResponse {

	private double sharePrice;
	private String stockExchange;
	private String stockName;

	public double getSharePrice() {
		return sharePrice;
	}

	@JsonSetter("l")
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	@JsonSetter("e")
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getStockName() {
		return stockName;
	}

	@JsonSetter("t")
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
