package hospitaal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PregnantWomen extends Patient{
public LocalDate dateOfExpectedDelivery;
public PregnantWomen(Gender gender, String name, LocalDate dateOfExpectedDelivery, LocalDate DateOfAddmission) {
super(gender,name,DateOfAddmission);
this.dateOfExpectedDelivery = dateOfExpectedDelivery;
}

public void GetDaysToBirth() {
	LocalDate date = LocalDate.now();
	//heel belangrijk... om hetanntal dagen te berekenen, moeten wij de chronounit gebruiken 
	double daysToBirth = ChronoUnit.DAYS.between(LocalDate.now(), dateOfExpectedDelivery);
	System.out.println(daysToBirth + " voor de bevalling van" + " " + getName());

}

public FullName getName() {
	return super.getName();
}
public void setName(FullName name) {
	super.setName(name);
}

@Override
public String toString() {
	return "PregnantWomen [dateOfExpectedDelivery=" + dateOfExpectedDelivery + ", name=" + name
			+ ", bloodType=" + bloodType + ", birthDate=" + birthDate + ", DateOfAddmission=" + DateOfAddmission
			+ ", departement=" + departement + ", title=" + title + ", gender="
			+ gender + ", name1=" + name1 + "]";
}

}
