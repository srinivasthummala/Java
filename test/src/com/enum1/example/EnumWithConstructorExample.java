package com.enum1.example;

public class EnumWithConstructorExample {
	public static void main(String[] args) {

		for (TrafficSignal action : TrafficSignal.values()) {
			System.out.println("action name: '" + action.name() + "' action value: '" + action.getAction()+"'");
		}
		
		System.out.println(TrafficSignal.GREEN);
		System.out.println(TrafficSignal.GREEN.name());

		System.out.println(TrafficSignal.YELLOW.getAction());

	}

	public enum TrafficSignal {
		RED("Stop"), YELLOW("Slow Down"), GREEN("Go");

		private String action;

		private TrafficSignal(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}

	}
}
