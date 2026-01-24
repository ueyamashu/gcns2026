package jp.co.gcns.batch;

public class Person {
	private String age;
	private String name;
	
	public Person() {
		age = "0";
		name = "GCNS";
	}
	
	public Person(String inputA, String inputB) {
		age = inputA;
		name = inputB;
	}
	
	public String makePersonalInfo(String dept) {
		String str;
		
		str = dept;
		str = str + "の" + name;
		str = str + "は" + age + "歳です。";
		
		return str;
	}
}
