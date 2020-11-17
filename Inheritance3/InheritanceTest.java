class InheritanceTest{
	public static void main(String [] args){
		A a = new A();
		B b = new B();
		System.out.println("superclass");
		
		a.setX(10);
		a.setY(20);a.getNilai();
		System.out.println("sub class");
		b.setX(5);
		b.setY(4);
		b.getNilai();
		b.setZ(50);
		b.getJumlah();
	}
}