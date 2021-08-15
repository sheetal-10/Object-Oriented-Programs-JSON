package com.oops;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Program for reading the stock details from json file and
 * calculating total value of each stock
 * @author sheetal
 * @since 2021-08-15
 */
public class StockControll {
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		try {
				// Java Object variable(MAIN OBJ which includes JSONParser, JSONObject, JSONArray)
				//Reading the inventoryDetails.json file
				Object obj = parser.parse(new FileReader(".//StockData/stockDetails.json"));
				// creating jsonObject for JsonObject(here JSON File parses object to JSONObject)
				JSONObject jsonObject = (JSONObject) obj;
				// here we change JSON Object to JSON Array.
				JSONArray stock = (JSONArray) jsonObject.get("stock");
	
				
				System.out.println("\n Details of Jio Shares are:");
				JSONObject jsobj1 = (JSONObject) stock.get(0);
				System.out.println(jsobj1);
				Double sharePrice1 = (double) jsobj1.get("sharePrice");
				Double numShare1 = (double) jsobj1.get("numShare");
				Double jioStockPrice = sharePrice1 * numShare1;
				System.out.println("Total value of Jio stock : " +jioStockPrice);
				
				System.out.println("\n Details of Airtel Shares are:");
				JSONObject jsobj2 = (JSONObject) stock.get(1);
				System.out.println(jsobj2);
				Double sharePrice2 = (double) jsobj2.get("sharePrice");
				Double numShare2 = (double) jsobj2.get("numShare");
				Double AirtelStockPrice = sharePrice2 * numShare2;
				System.out.println("Total value of Airtel stock : " +AirtelStockPrice);
				
				System.out.println("\n Details of Bsnl Shares are:");
				JSONObject jsobj3 = (JSONObject) stock.get(2);
				System.out.println(jsobj3);
				Double sharePrice3 = (double) jsobj3.get("sharePrice");
				Double numShare3 = (double) jsobj3.get("numShare");
				Double bsnlStockPrice = sharePrice3 * numShare3;
				System.out.println("Total value of BSNL stock : " +bsnlStockPrice);
				
				Double totalValue = jioStockPrice + AirtelStockPrice + bsnlStockPrice;
				System.out.println("\n Total Value of all stocks : " +totalValue);
	
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
