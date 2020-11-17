public class Person {
	protected String name;
	protected String address;


public void person(){
	System.out.println("Inside person:constructor");
	
	name="";
	
	address="";
	
}

public void person(String name, String address){
	this.name = name;
	this.address = address;
}

public String getName(){
	return name;
}

public String getAddress(){
	return address;
}
public void setName(String name){
	this.name=name;
}
public void setAddress(String add){
	this.address = add;
}
}