package com.java.example;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MyHashcodeImpl {

	@Test
	public void method1() {

		Map<Price, String> hm = new HashMap<>();
		hm.put(new Price("Banana", 20), "Banana");
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Orange", 30), "Orange");

		Price key = new Price("Banana", 20);
		System.out.println("Hashcode of the key: " + key.hashCode());
		System.out.println("Value from map: " + hm.get(key));
	}

}

class Price {
	private String item;
	private int price;

	public Price(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}

	@Override
	public int hashCode() {
		System.out.println("in hash code");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Price))
			return false;
		Price other = (Price) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	public String getItem() {
		return item;
	}

	public int getPrice() {
		return price;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
	}

}
