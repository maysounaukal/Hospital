package hospitaal;

import java.time.LocalDate;
import java.util.Arrays;

public class Gynocologist extends Doctor{

	public Gynocologist(Gender gender, String name, LocalDate joined, Departement departement) {
		super(gender,name,joined,departement);
	}

	@Override
	public String toString() {
		return "Gynocologist [speciality=" + Arrays.toString(speciality) + ", joined=" + joined + ", birthDate="
				+ birthDate + ", departement=" + departement + ", title=" + title + ", name=" + name + ", homeAddress="
				+ homeAddress + ", gender=" + gender + ", name1=" + name1 + "]";
	}

}
