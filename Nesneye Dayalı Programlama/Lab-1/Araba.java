package ndk01;
public class Araba {
	private String plaka;

	public Araba( String plakaNo ) {
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
		Araba birAraba;
		birAraba = new Araba( "34 RA 440" );
		birAraba.setPlaka("35 ÝZ 35");
		Araba diger = birAraba;
		diger.kendiniTanit();
	}

}
