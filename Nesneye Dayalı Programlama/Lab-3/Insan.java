package ndk03;

public class Insan {
	private String isim;
	private Araba araba;

	public Insan( String isim ) {
		this.isim = isim;
	}

	public String getIsim( ) { return isim; }
	public Araba getAraba( ) { return araba; }
	public void setAraba( Araba araba ) { this.araba = araba; }
	
	public String kendiniTanit( ) {
		String tanitim = "[INSAN] Adım: " + isim;
		if( araba != null )
			tanitim += " Aracımın plakası: " + araba.getPlaka();
		return tanitim;
	}

}
