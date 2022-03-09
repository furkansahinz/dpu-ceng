package ndk04;
public class Araba {
	private String plaka;
	private Insan sahip;

	public Araba( String plakaNo ) { plaka = plakaNo; }
	public Araba(String plaka, Insan sahip) {
		this.plaka = plaka;
		setSahip(sahip);
	}
	public void setSahip( Insan sahip ) { 
		this.sahip = sahip;
		if( sahip.getAraba() != this )
			sahip.setAraba(this);
	}
	public Insan getSahip() { return sahip; }
	public String getPlaka( ) { return plaka; }
	public void setPlaka( String plaka ) { this.plaka = plaka; }
	public String kendiniTanit( ) {
		String tanitim;
		tanitim = "[ARABA] Plakam: " + getPlaka() +
			" Sahibimin adý: " + sahip.getIsim();
		return tanitim;
	}
}
