package homework1;

public class ArkadasSayilar {

	public static void main(String[] args) {
		int s1 = 220;
		int s2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < s1; i++) {
			if (s1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}

		for (int i = 1; i < s2; i++) {
			if (s2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		if (s1 == toplam2 && s2 == toplam1) {
			System.out.println("arkadaş sayılardır");
		} else {
			System.out.println("arkadaş sayı değillerdir");
		}

	}

}
