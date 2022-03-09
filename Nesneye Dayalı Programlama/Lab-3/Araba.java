package ndk03;
public class Araba {
	private String plaka;
	private Insan sahip;

	public Araba( String plakaNo ) { plaka = plakaNo; }
	public Araba(String plaka, Insan sahip) {
		this.plaka = plaka;
		this.sahip = sahip;
	}
	public void setSahip( Insan sahip ) { this.sahip = sahip; }
	public Insan getSahip() { return sahip; }
	public String getPlaka( ) { return plaka; }
	public void setPlaka( String plaka ) { this.plaka = plaka; }
	public String kendiniTanit( ) {
		String tanitim;
		tanitim = "[ARABA] Plakam: " + getPlaka();
		if( sahip != null )
			tanitim += " Sahibimin adý: " + sahip.getIsim();
		return tanitim;
	}
}
