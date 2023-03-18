package homework2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = sehirVer();
		System.out.println(mesaj);

		int sayi = topla(5, 7);
		System.out.println(sayi);

		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void güncelle() {
		System.out.println("güncellendi");
	}

	public static int topla(int s1, int s2) {
		return s1 + s2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
