package com.Revision;

import java.util.*;

/* an order to transport some containers from port A to port B.
		In this order we have received N pairs where each element in the pair is container number.
		In this order if 2 containers are in same pair they belong to same booking. Find distinct number of bookings from the order.
		Input:
		[Container123,Container246]
		[Container248,Container127]
		[Container235,Container237]
		[Container247,Container123]
		Output:
		3
		Explanation:
		Booking1 -> Container248,Container127
		Booking2-> Container235,Container237
		Booking3 -> Container123,Container247,Container246
		
		*/

public class InterviewQ7_ContainerPairProblem {
	
	private static void dfs(String container, Map<String, List<String>> graph, Set<String> visited) {
		// Mark the current container as visited
		visited.add(container);
		
		// Traverse all connected containers
		for (String neighbor : graph.get(container)) {
			if (!visited.contains(neighbor)) {
				dfs(neighbor, graph, visited);
			}
		}
	}
	
	public static int findDistinctBookings(List<String[]> containerPairs) {
		// Map to store adjacency list of the graph
		Map<String, List<String>> graph = new HashMap<>();
		
		// Build the graph from the container pairs
		for (String[] pair : containerPairs) {
			graph.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
			graph.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
		}
		
		// Set to keep track of visited containers
		Set<String> visited = new HashSet<>();
		int distinctBookings = 0;
		
		// Perform DFS to find connected components
		for (String container : graph.keySet()) {
			if (!visited.contains(container)) {
				distinctBookings++;
				dfs(container, graph, visited);
			}
		}
		
		return distinctBookings;
	}
	
	public static void main(String[] args) {
		// Input: List of container pairs
		List<String[]> containerPairs = Arrays.asList(
				new String[]{"Container123", "Container246"},
				new String[]{"Container248", "Container127"},
				new String[]{"Container235", "Container237"},
				new String[]{"Container247", "Container123"}
		);
		
		int distinctBookings = findDistinctBookings(containerPairs);
		System.out.println("Number of distinct bookings: " + distinctBookings);
	}
}
