package hospitaal;

public enum Departement {Oncology(0),Podology(1),Gynocology(3),Radiology(4);
	
	private int floor;
	private Departement(int floor) {
		this.floor = floor;
	}
	
	private int getFloor() {
		return floor;
	}
	
	public String toString() {
		return name() + "(" + " " + floor + " " + ")";
	}

}
