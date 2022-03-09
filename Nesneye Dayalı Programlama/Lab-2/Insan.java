package ndk02;

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
		String tanitim;
		tanitim = "Merhaba, benim adım " + getIsim() + ".";
		if( araba != null )
			tanitim += "\n" + araba.getPlaka()+" plakalı bir arabam var.";
		return tanitim;
	}

}
