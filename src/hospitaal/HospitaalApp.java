package hospitaal;

import java.time.LocalDate;

public class HospitaalApp {

	public static void main(String[] args) {
		PregnantWomen women = new PregnantWomen(Gender.WOMEN,"Fien",LocalDate.of(2019, 6, 1),
				LocalDate.of(2019,3 , 1));
		Gynocologist gynocologist = new Gynocologist(Gender.MAN,"Julien",LocalDate.of(1993, 8, 19),
				Departement.Gynocology);
		
	StomachSurgeon stomachSurgeon = new StomachSurgeon(Gender.WOMEN,"Alexis",LocalDate.of(1977, 3, 9),
			Departement.Radiology);
	
	Receptionist receptionist = new Receptionist(Gender.WOMEN,"Margaritte",LocalDate.of(1997,3, 9),
			Departement.Radiology);
	
	System.out.println(women);
	System.out.println(gynocologist );
	System.out.println(stomachSurgeon);
	System.out.println(receptionist);
	
		

	}

}
