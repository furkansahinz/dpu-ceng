package ndk06;

public class Calisan extends Kisi {
	private int maas; 

	public Calisan( String name, int maas ) {
		super( name );
		this.maas = maas;
	}

	public int getMaas( ) {
		return maas;
	}

	public void setMaas( int salary ) {
		this.maas = salary;
	}

}
