package ndk01;

public class Insan {
	private String isim;
	private int yas;
	public Insan(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}
	public String getIsim() {
		return isim;
	}
	public int getYas() {
		return yas;
	}
	public int compareTo( Insan diger ) {
			return yas-diger.yas;
	}
	public static void main(String[] args) {
		Insan yunus = new Insan("Yunus",42);
		Insan olcan = new Insan("Olcan",5);
		System.out.println(yunus.compareTo(olcan));
	}

}
