package com.oracle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oracle_TableCount {
	
	public void tablecounts() throws IOException {
//		File file = new File("C:/Users/jayasha/Downloads/stageTables.txt");
//		File file = new File("C:\\Users\\jayasha\\Documents\\ECM\\CLOUD SERVICE\\DR Testing Release wise\\OLD Queries\\Migration_Queries_BusinessTableCount.txt");
		File file = new File("C:\\Users\\jayasha\\Documents\\ECM\\CLOUD SERVICE\\DR Testing Release wise\\OLD Queries\\Migration_Queries_StageTableCount.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			List<String> queryLinesList = new ArrayList<>();
			
			String str = st.replace(";", "");
			String[] queryLinesSplit = str.split(" ");
			
			Collections.addAll(queryLinesList, queryLinesSplit);
			String resultOfEachQuery = queryLinesList.remove(2);
			
			queryLinesList.add(")AS");
			queryLinesList.add(resultOfEachQuery);
			
			String newFormedQuery = String.join(" ", queryLinesList);
			String resultString = "(" + newFormedQuery+",";
			System.out.println(resultString);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		new Oracle_TableCount().tablecounts();
	}
}
