package homework2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int ara = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == ara) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer("sayı mevcuttur: " + ara);
		} else {
			mesajVer("sayı mevcut değildir: " + ara);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
