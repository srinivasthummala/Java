package com.enum1.example;

public enum InstanceFieldEnum {

	/**
	 * Enumeration elements are constructed once upon class loading.
	 * 
	 * public static final InstanceFieldEnum ONE = new InstanceFieldEnum (1);
	 * public static final InstanceFieldEnum TWO = new InstanceFieldEnum (2);
	 * public static final InstanceFieldEnum THREE = new InstanceFieldEnum (3);
	 * public static final InstanceFieldEnum FOUR = new InstanceFieldEnum (4);
	 * public static final InstanceFieldEnum FIVE = new InstanceFieldEnum (5);
	 */

	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

	int num;

	private InstanceFieldEnum(int num) {
		System.out.println("InstanceFieldEnum invoked : " + this.toString());
		this.num = num;
	}

	public int getNum() {
		return num;
	}

}
