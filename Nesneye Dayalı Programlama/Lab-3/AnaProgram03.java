package ndk03;

public class AnaProgram03 {

	public static void main(String[] args) {
		Insan oktay = new Insan("Oktay Sinano?lu");
		Araba rover = new Araba("06 OS 1934");
		oktay.setAraba(rover);
		rover.setSahip(oktay);
		System.out.println( oktay.kendiniTanit() );
		System.out.println( rover.kendiniTanit() );

		Insan aziz = new Insan("Aziz Sancar");
		Araba honda = new Araba("47 AS 1946");
		aziz.setAraba(honda);
		honda.setSahip(aziz);
		System.out.println( aziz.kendiniTanit() );
		System.out.println( honda.kendiniTanit() );
	}

}
