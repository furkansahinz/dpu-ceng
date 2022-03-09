package ndk06;

public class Sirket {

	public static void main(String[] args) {
		Calisan[] calisanlar = new Calisan[0];
		Yonetici mudur = new Yonetici( "Oktay Sinanoðlu", 10000 );
		mudur.setBonus( 2500 );
		calisanlar[0] = mudur;
		calisanlar[1] = new Calisan( "Attila Ýlhan", 7500 );
		calisanlar[2] = new Calisan( "Ümit Zileli", 6000 );
		for( Calisan calisan : calisanlar ) {
			System.out.println( calisan.getIsim() + " " + calisan.getMaas( ) );
		}
		for( int i=0; i<calisanlar.length;i++ )
			System.out.println(calisanlar[i].getIsim() + " " 
						+ calisanlar[i].getMaas( ));
	}

}
