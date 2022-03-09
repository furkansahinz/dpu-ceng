package ndk01;
import java.util.Scanner;
public class ArabaV2 {
	private String plaka;

	public ArabaV2( String plakaNo ) {
		plaka = plakaNo;
	}
	public String getPlaka( ) {
		return plaka;
	}
	public void setPlaka( String plaka ) {
		this.plaka = plaka;
	}
	public void kendiniTanit( ) {
		System.out.println( "Plakam: " + getPlaka() );
	}

	public static void main( String[] args ) {
		ArabaV2 birAraba; String bilgi;
		Scanner input = new Scanner( System.in );
		System.out.print("Enter a license plate: ");
		bilgi = input.nextLine( );
		birAraba = new ArabaV2( bilgi );
		
		System.out.print("Enter license plate of 2nd car: ");
		ArabaV2 digerAraba = new ArabaV2( input.nextLine() );

		String tmp = birAraba.getPlaka();
		birAraba.setPlaka(digerAraba.getPlaka());
		digerAraba.setPlaka(tmp);
		
		birAraba.kendiniTanit();
		digerAraba.kendiniTanit();
		
		input.close();
	}

}
