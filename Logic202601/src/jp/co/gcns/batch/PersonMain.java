package jp.co.gcns.batch;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("20","上山");
		
		String returnVal = p1.makePersonalInfo("教育担当");

		System.out.println(returnVal);
	}

}
