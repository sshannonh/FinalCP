package War;

public class WarCard {
	private String name;
	private int value;
	 
	// WarCard() {
		// this.name = name;
		// this.value = value;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		System.out.println(this.name + " - - - " + this.value);
	}
		
		
		
		
	

} //****************************************END*OF*MAIN*********************************
