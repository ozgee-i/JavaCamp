package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		String ortaMetin="ilginizi çekebilir";
		String altMetin="Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade=12;
		
		double dolarDun=18.14;
		double dolarBugun=18.14;
		
		boolean dolarDustuMu=true;
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) {			
			okYonu="down.svg";
			System.out.println(okYonu);			
		} else if(dolarBugun<dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler= {"hızlı kredi","mutlu emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}

	}

}
