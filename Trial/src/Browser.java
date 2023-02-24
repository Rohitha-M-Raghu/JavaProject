class A {
	private String name;
	
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class B extends A{
	private String trial;
	
	B() {
//		trial = "sample sentence";
	}
	
	public void setTrial(String trial) {
		this.trial = trial;
	}

	public String getTrial() {
		return trial;
	}
	
}

class Browser{
	public static void main(String[] args) {
		A objectA = new A();
		B objectB = new B();
		A upcasting = new B();
		objectA.setName("Rohitha");
		objectA.getname();
		objectB.setName("Po");
		System.out.println(objectB.getname());
		upcasting.setName("KAT");
		System.out.println(upcasting.getname());
		B downcasting = new B();
		downcasting.getTrial();
		System.out.println(downcasting.getname());
	}
}