package com.example.wunderland.utils;

public class Castle {
	
	private static boolean doors = false;
	private static String lock = "6437eaa51cdcf39e8b5322074b7d886a" +
								 "a019555b731f49d8aaf96475f1fc518d" +
								 "bd69528558119a03ad65c5606d59de61" +
								 "b18e8f5fe924d1626d675417bd76b007" +
								 "1f82ec016ebb60941c6c9108d09f102c" +
								 "c73950dabb60af0602f3c6ba8e95d9a6" +
								 "c4cb08d8731f49d8aaf96475f1fc518d" +
								 "bd69528558119a03ad65c5606d59de61" +
								 "b18e8f5fe924d1626d6754175cfad9d7" +
								 "0f6400741583399bfe5f9c54fb14818c" +
								 "ad65c5606d59de61b18e8f5fe924d162" +
								 "6d675417";
	
	public static boolean open(boolean state){
		doors = state;
		return doors;
	}
	
	public static boolean getState(boolean doors){
		return doors;
	}

	public static String getLock() {
		return lock;
	}
}
