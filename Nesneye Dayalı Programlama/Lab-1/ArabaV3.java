package ndk01;
import java.util.Scanner;
public class ArabaV3 {
	private String plaka;
	private final String sasiNo;

	public ArabaV3( String plakaNo, String sasiNo ) {
		plaka = plakaNo; this.sasiNo = sasiNo;
	}
	public String getPlaka( ) {
		return plaka;
	}
	public void setPlaka( String plaka ) {
		this.plaka = plaka;
	}
	public String getSasiNo() {
		return sasiNo;
	}
	public void kendiniTanit( ) {
		System.out.println( "Plakam: " + getPlaka() );
		System.out.println( "Þasi no:" + getSasiNo());
	}

	public static void main( String[] args ) {
		ArabaV3 birAraba, ikiAraba;
		Scanner input = new Scanner( System.in );
		System.out.print("Enter a license plate: ");
		String plaka = input.nextLine( ); 
		System.out.print("Enter chassis nr: ");
		String sasi = input.nextLine( ); 
		birAraba = new ArabaV3( plaka, sasi  );

		/*System.out.print("Enter a license plate: ");
		plaka = input.nextLine( ); 
		System.out.print("Enter chassis nr: ");
		sasi = input.nextLine( ); 
		ikiAraba = new ArabaV3( plaka, sasi  );*/
		System.out.println(birAraba);
		birAraba.kendiniTanit();
		
		System.out.println("1. araba için yeni þasi no girin:");
		sasi = input.nextLine();
		birAraba = new ArabaV3(birAraba.getPlaka(),sasi);

		System.out.println(birAraba);
		birAraba.kendiniTanit();
		//ikiAraba.kendiniTanit();
		
		/*System.out.println("2. araba için yeni þasi no girin:");
		sasi = input.nextLine();
		ikiAraba = new ArabaV3(ikiAraba.getPlaka(),sasi);
		ikiAraba.kendiniTanit();*/
		input.close();
	}

}
