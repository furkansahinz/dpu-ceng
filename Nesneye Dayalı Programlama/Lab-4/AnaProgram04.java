package ndk04;

public class AnaProgram04 {

	public static void main(String[] args) {
		Insan oktay = new Insan("Oktay Sinanoðlu");
		Araba rover = new Araba("06 OS 1934");
		oktay.setAraba(rover);
		//rover.setSahip(oktay);
		System.out.println( oktay.kendiniTanit() );
		System.out.println( rover.kendiniTanit() );

		Insan aziz = new Insan("Aziz Sancar");
		Araba honda = new Araba("47 JA 46");
		//aziz.setAraba(honda);
		honda.setSahip(aziz);
		System.out.println( aziz.kendiniTanit() );
		System.out.println( honda.kendiniTanit() );
	}

}
