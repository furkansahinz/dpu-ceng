package ndk02;

public class AnaProgram01 {
	
	public static void main(String[] args) {
		Insan oktay;
		oktay = new Insan( "Oktay Sinanoðlu" );
		Araba rover = new Araba( "34 OS 1934" );
		oktay.setAraba(rover);
		System.out.println( oktay.kendiniTanit() );
		Insan aziz = new Insan( "Aziz Sencer" );
		Araba honda = new Araba("06 AZ 123");
		aziz.setAraba( honda );
		System.out.println( aziz.kendiniTanit() );
	}

}
