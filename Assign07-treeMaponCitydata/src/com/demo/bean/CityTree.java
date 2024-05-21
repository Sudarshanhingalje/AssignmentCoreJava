package com.demo.bean;

public class CityTree {


	String city;
	String[] trees;

	public CityTree(String city, String[] trees) {
		this.city = city;
		this.trees = trees;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("City: ").append(city).append("\n");
		sb.append("Trees: ");
		for (String tree : trees) {
			sb.append(tree).append(" ");
		}
		return sb.toString();
	}
}


