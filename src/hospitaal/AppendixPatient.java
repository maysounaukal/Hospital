package hospitaal;

import java.time.LocalDate;

public class AppendixPatient extends Patient{

	public AppendixPatient(Gender gender, String name, LocalDate dateOfAddmission) {
		super(gender, name, dateOfAddmission);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AppendixPatient [id=" + id + ", name=" + name + ", bloodType=" + bloodType + ", birthDate=" + birthDate
				+ ", DateOfAddmission=" + DateOfAddmission + ", departement=" + departement + ", title=" + title
				+ ", homeAddress=" + homeAddress + ", gender=" + gender + ", name1=" + name1 + "]";
	}

}
