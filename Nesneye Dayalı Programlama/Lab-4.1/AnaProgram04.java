package ndk04a;

public class AnaProgram04 {

	public static void main(String[] args) {
		Insan oktay = new Insan("Oktay Sinanoðlu");
		Araba rover = new Araba("06 OS 1934", oktay);
		System.out.println( oktay.kendiniTanit() );
		System.out.println( rover.kendiniTanit() );
	}

}
