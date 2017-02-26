package com.stockengine.model;

public class GoogleFinanceRequest {

	private static final String baseUrl = "http://finance.google.com/finance/info?client=ig";

	private String stockExchangeSymbol;

	private String stockScriptSymbol;

	public GoogleFinanceRequest(String stockExchange, String stockSymbol) {
		this.stockExchangeSymbol = stockExchange;
		this.stockScriptSymbol = stockSymbol;
	}

	public String getStockExchangeSymbol() {
		return stockExchangeSymbol;
	}

	public void setStockExchangeSymbol(String stockExchangeSymbol) {
		this.stockExchangeSymbol = stockExchangeSymbol;
	}

	public String getStockScriptSymbol() {
		return stockScriptSymbol;
	}

	public void setStockScriptSymbol(String stockScriptSymbol) {
		this.stockScriptSymbol = stockScriptSymbol;
	}

	public String buildRequestUrl() {
		StringBuilder sb = new StringBuilder(baseUrl);

		sb.append("&q=");
		sb.append(this.stockExchangeSymbol);
		sb.append(":");
		sb.append(this.stockScriptSymbol);
		return sb.toString();

	}
}
