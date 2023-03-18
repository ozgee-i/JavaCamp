package homework1;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kalın sesli harfler");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("ince sesli harfler");
			break;
		default:
			System.out.println("hatalı giriş");
		}

	}

}
