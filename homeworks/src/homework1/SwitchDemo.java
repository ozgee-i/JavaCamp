package homework1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Mükkemmel: Geçtiniz");
			break;
		case 'B':

		case 'C':
			System.out.println("İyi: Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil: Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız.");
			break;
		default:
			System.out.println("Geçerli not giriniz.");

		}

	}

}
