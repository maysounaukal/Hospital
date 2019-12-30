package hospitaal;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Staff extends Person{
public LocalDate joined;
protected LocalDate birthDate;
public Departement departement;
public Staff(Gender gender, String name, LocalDate joined, Departement departement) {
	super(gender,name);
	this.joined = joined;
	this.departement = departement;
}
public void getWorkDays() {
	LocalDate date = LocalDate.now();
	long workDays = ChronoUnit.DAYS.between(getJoined(), date);
	
}
public void getWorkYears() {
	LocalDate date = LocalDate.now();
	long workYears = ChronoUnit.YEARS.between(getJoined(), date);
	
}
public void getPensionDate() {
	
	getJoined().plusYears(42);//sinds de date van wanneer hij met het werk begint
}
public LocalDate getJoined() {
	return joined;
}
public void setJoined(LocalDate joined) {
	this.joined = joined;
}
@Override
public String toString() {
	return "Staff [joined=" + joined + ", birthDate=" + birthDate + ", departement=" + departement + "]";
}

}
