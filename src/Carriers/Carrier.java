package Carriers;


public class Carrier {

	private String name;
	
	public Carrier(String name){
		if(name==null)
			throw new IllegalArgumentException("firstname can not be null.");
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
