package hospitaal;

import java.time.LocalDate;

public class OperationStaff extends Staff{

	public OperationStaff(Gender gender, String name, LocalDate joined, Departement departement) {
		super(gender,name,joined,departement);
	}

	@Override
	public String toString() {
		return "OperationStaff [joined=" + joined + ", birthDate=" + birthDate + ", departement=" + departement
				+ ", title=" + title + ", name=" + name + ", homeAddress=" + homeAddress + ", gender=" + gender
				+ ", name1=" + name1 + "]";
	}

}
