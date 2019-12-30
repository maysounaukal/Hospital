package hospitaal;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Patient extends Person{
public double id;
protected FullName name;
protected BloodType  bloodType;
protected LocalDate birthDate;
private int age;
private String[] prescriptions;
public LocalDate DateOfAddmission;
public Departement departement;
public Patient(Gender gender, String name, LocalDate dateOfAddmission) {
	super(gender, name);
	
	this.DateOfAddmission = DateOfAddmission;
	
	
}
public int CalculateAge() {
	 LocalDate date = LocalDate.now(); //dat id de dag van vandaag
	 Period period = Period.between(getBirthDate(),date);//om de age te berekenen
	 
	 return age = period.getYears();
	 
}
public LocalDate getBirthDate() {
	return birthDate;
}
public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}
public FullName getName() {
	return name;
}
public void setName(FullName name) {
	this.name = name;
}
@Override
public String toString() {
	return "Patient [id=" + id + ", name=" + name + ", bloodType=" + bloodType + ", birthDate=" + birthDate + ", age="
			+ age + ", prescriptions=" + Arrays.toString(prescriptions) + ", DateOfAddmission=" + DateOfAddmission
			+ ", departement=" + departement + "]";
}


}
