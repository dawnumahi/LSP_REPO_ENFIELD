package org.howard.edu.lsp.assignment2;
import java.io.*;

public class etl_pipeline {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("LSP_Spring2025/data/products.csv"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("LSP_Spring2025/data/transformed_products.csv"));
			
		//write header for output file
		writer.write("ProductID,Name,Price,Category,PriceRange\n");
		
		//Ignore column header
		reader.readLine();
		
		String record = reader.readLine();
		while(record != null) {
			if (record.isEmpty()){
				record = reader.readLine();
				continue;
			}
			String[] info = record.split(",");
			
			int productId = Integer.parseInt(info[0]);
			String name = info[1].toUpperCase(); 		//convert all product names to uppercase 
			double price = Double.parseDouble(info[2]);
			String category = info[3];
			
			//10% discount on electronics 
			if (category.equals("Electronics")){
				price = (0.9*price);
				if (price > 500.00) {
					category = "Premium Electronics";
				}
			}
	
			String pR;
			if ((0 < price) && (price <= 10)){
				pR = "Low";
			}
			else if (price <= 100){
				pR = "Medium";
			}
			else if (price <= 500){
				pR = "High";
			}
			else {
				pR = "Premium";
			}
			
			//write modified data to new file
			writer.write(String.format("%d,%s,%.2f,%s,%s\n", productId, name, price, category, pR));
			record = reader.readLine();
			}

			//Ignore the comment here.
			
		reader.close();
		writer.close();
	}
}
