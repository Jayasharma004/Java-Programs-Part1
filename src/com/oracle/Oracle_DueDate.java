package com.oracle;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Oracle_DueDate {
	
	public void dueDateCalculation() throws ParseException {
		List<String> listOfDueDateFilters = new ArrayList<>();
		listOfDueDateFilters.add("Last 5 Years");
		listOfDueDateFilters.add("Last 2 Years");
		listOfDueDateFilters.add("Last Year");
		listOfDueDateFilters.add("Last Month");
		listOfDueDateFilters.add("Last Week");
		listOfDueDateFilters.add("Last 12 Hours");
		listOfDueDateFilters.add("Last Day");
		listOfDueDateFilters.add("Last 2 Hours");
		listOfDueDateFilters.add("Last Hour");
		listOfDueDateFilters.add("Next Hour");
		listOfDueDateFilters.add("Next 12 Hours");
		listOfDueDateFilters.add("Next Day");
		listOfDueDateFilters.add("Next 2 Days");
		listOfDueDateFilters.add("Next Week");
		listOfDueDateFilters.add("Next Month");
		listOfDueDateFilters.add("Next Year");
		listOfDueDateFilters.add("Next 2 Years");
		listOfDueDateFilters.add("Next 5 Years");
		String dueDate = "03/09/2024";
		
		//Get date filter on Column
		Random num = new Random();
		int randomIteration = num.nextInt(listOfDueDateFilters.size());
		String dateFilter = listOfDueDateFilters.get(12);
		String[] filterWords = dateFilter.split(" ");
		
		//Local Date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		int multiplier = filterWords[0].equals("Next") ? 1 : -1;
		LocalDateTime modifiedDateTime = null;
		switch (filterWords.length) {
			case 3:
				int numberSizeThree = Integer.parseInt(filterWords[1]);
				String unitSizeThree = filterWords[2];
				switch (unitSizeThree) {
					case "Years":
						modifiedDateTime = currentDateTime.plusYears(multiplier * numberSizeThree);
						break;
					case "Days":
						modifiedDateTime = currentDateTime.plusDays(multiplier * numberSizeThree);
						break;
					case "Hours":
						modifiedDateTime = currentDateTime.plusHours(multiplier * numberSizeThree);
						break;
				}
				break;
			case 2:
				int numberSizeTwo = 1;
				String unitSizeTwo = filterWords[1];
				switch (unitSizeTwo) {
					case "Year":
						modifiedDateTime = currentDateTime.plusYears(multiplier * numberSizeTwo);
						break;
					case "Month":
						modifiedDateTime = currentDateTime.plusMonths(multiplier * numberSizeTwo);
						break;
					case "Week":
						modifiedDateTime = currentDateTime.plusWeeks(multiplier * numberSizeTwo);
						break;
					case "Day":
						modifiedDateTime = currentDateTime.plusDays(multiplier * numberSizeTwo);
						break;
					case "Hour":
						modifiedDateTime = currentDateTime.plusHours(multiplier * numberSizeTwo);
						break;
				}
				break;
		}
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate dueDateTime = LocalDate.parse(dueDate, formatter);
		System.out.println("modifiedDateTime : " + modifiedDateTime.format(formatter));
		System.out.println("input due date : " + dueDateTime);
		
		if (multiplier == 1) {
			if (dueDateTime.isAfter(currentDateTime.toLocalDate()) && dueDateTime.isBefore(modifiedDateTime.toLocalDate())) {
				System.out.println("PASS : dueDateTime : "+dueDateTime+" is after currentDateTime " +
				 "&& dueDateTime is before modifiedDateTime : "+modifiedDateTime);
			} else {
				System.out.println("FAIL");
			}
		} else {
			if (dueDateTime.isBefore(currentDateTime.toLocalDate()) && dueDateTime.isAfter(modifiedDateTime.toLocalDate())) {
				System.out.println("PASS : dueDateTime : "+dueDateTime+" is before currentDateTime " +
				 "&& dueDateTime is after modifiedDateTime : "+modifiedDateTime);
			} else {
				System.out.println("FAIL");
			}
		}
		
	}
	
	public static void main(String[] args) throws ParseException {
		new Oracle_DueDate().dueDateCalculation();
	}
}
