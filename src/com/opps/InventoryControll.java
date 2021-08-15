package com.opps;

import java.io.FileReader;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

/**
 * Program for reading the inventory details from json file and
 * calculating total value of each innventory
 * @author sheetal
 * @since 2021-08-15
 */
public class InventoryControll {
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		try {
				// Java Object variable(MAIN OBJ which includes JSONParser, JSONObject, JSONArray)
				//Reading the inventoryDetails.json file
				Object obj = parser.parse(new FileReader(".//Data/inventoryDetails.json"));
				// creating jsonObject for JsonObject(here JSON File parses object to JSONObject)
				JSONObject jsonObject = (JSONObject) obj;
				// here we change JSON Object to JSON Array.
				JSONArray inventory = (JSONArray) jsonObject.get("inventory");
	
				
				System.out.println("\n Details of rice are:");
				JSONObject jsobj1 = (JSONObject) inventory.get(0);
				System.out.println(jsobj1);
				Double weight1 = (double) jsobj1.get("weight");
				Double price1 = (double) jsobj1.get("pricePerKg");
				Double ricePrice = weight1 * price1;
				System.out.println("Total value of rice : " +ricePrice);
				
				System.out.println("\n Details of wheat are:");
				JSONObject jsobj2 = (JSONObject) inventory.get(1);
				System.out.println(jsobj2);
				Double weight2 = (double) jsobj1.get("weight");
				Double price2 = (double) jsobj2.get("pricePerKg");
				Double wheatPrice = weight2 * price2;
				System.out.println("Total value of wheat : " +wheatPrice);
								
				System.out.println("\nDetails of pulses are:");
				JSONObject jsobj3 = (JSONObject) inventory.get(2);
				System.out.println(jsobj3);
				Double weight3 = (double) jsobj1.get("weight");
				Double price3 = (double) jsobj3.get("pricePerKg");
				Double pulsesPrice = weight3 * price3;
				System.out.println("Total value of pulses : " +pulsesPrice);
				
	
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
