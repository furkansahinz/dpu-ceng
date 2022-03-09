package ndk06;

public class Yonetici extends Calisan {
	private int bonus;

	public Yonetici( String name, int maas ) {
		super( name, maas );
		bonus = 0;
	}

	public Yonetici( String name, int maas, int bonus ) {
		super( name, maas );
		this.bonus = bonus;
	}

	public void setBonus( int bonus ) {
		this.bonus = bonus;
	}

	public int getMaas( ) {
		return super.getMaas( ) + bonus;
	}
	
}
