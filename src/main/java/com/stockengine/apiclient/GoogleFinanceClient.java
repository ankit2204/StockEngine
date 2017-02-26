package com.stockengine.apiclient;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.stockengine.model.GoogleFinanceRequest;
import com.stockengine.model.GoogleFinanceResponse;

public class GoogleFinanceClient {

	private GoogleFinanceRequest request;
	private GoogleFinanceResponse response;

	public GoogleFinanceClient(String stockExchange, String stockSymbol) {
		request = new GoogleFinanceRequest(stockExchange, stockSymbol);
	}
	
	public GoogleFinanceResponse getStockData() throws ClientProtocolException, IOException{
		String requestUrl = request.buildRequestUrl();
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(requestUrl);
		
		HttpResponse response = client.execute(request);
		return null;
		
	}
	
}
