package ch07.ex01;

import config.Configuration;

public class Main {
	public static void msin(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		mapper.selectUsers().forEach(System.out::println);
	}
}
