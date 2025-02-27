package com.git;

public class Sample {
	private void ind() {
		System.out.println("India");
	}
	private void aus() {
		System.out.println("Australia");
	}
	private void eng() {
		System.out.println("England");
	}
	private void sa() {
		System.out.println("South Affrica");	
	}
	private void pak() {
		System.out.println("Pakisthan");
	}
	private void ban() {
		System.out.println("Bangaladesh");
	}	
	public static void main(String[] args) {
		Sample sample= new Sample();
		sample.ind();
		sample.aus();
		sample.pak();
		sample.eng();
		sample.ban();
		sample.sa();
	}
}
