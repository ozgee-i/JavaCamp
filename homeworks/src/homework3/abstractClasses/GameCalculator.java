package homework3.abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); //override edip kendi kuralını yazmalı
	
	public final void gameOver() {   //hiçbir zaman değişmez olduğu gibi kullanılmalı
		System.out.println("Oyun bitti.");
	}

}
