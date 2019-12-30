package hospitaal;

import java.time.LocalDate;

public class AdministrativeStaff extends Staff{
	public AdministrativeStaff(Gender gender, String name, LocalDate joined, Departement departement) {
		super(gender,name,joined,departement);}

	@Override
	public String toString() {
		return "AdministrativeStaff [joined=" + joined + ", birthDate=" + birthDate + ", departement=" + departement
				+ ", title=" + title + ", name=" + name + ", homeAddress=" + homeAddress + ", gender=" + gender
				+ ", name1=" + name1 + "]";
	}
	
}
