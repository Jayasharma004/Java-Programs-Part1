package com.problems.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PositionsCount {
	private int position;
	private int count;

	public PositionsCount(int position, int count) {
		this.position = position;
		this.count = count;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "PositionsCount{" +
				"position=" + position +
				", count=" + count +
				'}';
	}
}

public class P11_FirstUniqueChar {


	public int firstUniqChar(String s) {

		char[] c = s.toCharArray();
		int leastPos = Integer.MAX_VALUE;
		Map<Character, PositionsCount> map = new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			if (!map.containsKey(c[i])) {
				map.put(c[i], new PositionsCount(i, 1));
			} else {
				PositionsCount existingCountObject = map.get(c[i]);
				existingCountObject.setCount(existingCountObject.getCount() + 1);
				map.put(c[i], existingCountObject);
			}
		}
		System.out.println("map : " + map);

		for (char ch : map.keySet()) {
			PositionsCount positionsCountObj = map.get(ch);
			if (positionsCountObj.getCount() == 1) {
				leastPos = Math.min(positionsCountObj.getPosition(), leastPos);
			}
		}

		return leastPos;
	}

	public int firstUniqueChar_ThruMap(String s) {
		char[] c = s.toCharArray();
		Map<Character, Map<String, Integer>> outerMap = new HashMap<>();
		int leastPosition = Integer.MAX_VALUE;

		for (int i = 0; i < c.length; i++) {
			if (outerMap.containsKey(c[i])) {
				Map<String, Integer> positionCountMap = outerMap.get(c[i]);
				int count = positionCountMap.get("count");
				int newCount = count + 1;
				positionCountMap.put("count", newCount);
				outerMap.put(c[i], positionCountMap);
			} else {
				Map<String, Integer> postionCountMap = new HashMap<>();
				postionCountMap.put("position", i);
				postionCountMap.put("count", 1);
				outerMap.put(c[i], postionCountMap);
			}
		}

		for (Character ch : outerMap.keySet()) {
			Map<String, Integer> positionCountMap = outerMap.get(ch);
			int count = positionCountMap.get("count");
			int position = positionCountMap.get("position");
			if (count == 1) {
				leastPosition = Math.min(leastPosition, position);
			}
		}
		return leastPosition;
	}

	public int firstUniqueChar_ThruList(String s) {
		char[] c = s.toCharArray();
		int leastPosition = Integer.MAX_VALUE;
		Map<Character, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			if (!map.containsKey(c[i])) {
				List<Integer> positionCountList = new ArrayList<>();
				positionCountList.add(i);
				positionCountList.add(1);
				map.put(c[i], positionCountList);
			} else {
				List<Integer> positionCountList = map.get(c[i]);
				int count = positionCountList.get(1) + 1;
				positionCountList.set(1, count);
				map.put(c[i], positionCountList);
			}
		}
		System.out.println(map);
		for (char key : map.keySet()) {
			System.out.println(key);
			List<Integer> positionCountList = map.get(key);
			if (positionCountList.get(1) == 1) {
				leastPosition = Math.min(leastPosition, positionCountList.get(0));
			}
		}
		if(leastPosition == Integer.MAX_VALUE)
		{
			return -1;
		}
		return leastPosition;
	}

	public static void main(String[] args) {
		String s = "loveleetcode";
//		int result = new P11_FirstUniqueChar().firstUniqChar(s);
//		int result = new P11_FirstUniqueChar().firstUniqueChar_ThruMap(s);
		int result = new P11_FirstUniqueChar().firstUniqueChar_ThruList(s);
		System.out.println("result : " + result);
	}
}
