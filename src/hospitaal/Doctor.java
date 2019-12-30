package hospitaal;

import java.time.LocalDate;

public class Doctor extends OperationStaff{
public Doctor(Gender gender, String name, LocalDate joined, Departement departement) {
		super(gender,name,joined,departement);
	}

public String[] speciality;
}
