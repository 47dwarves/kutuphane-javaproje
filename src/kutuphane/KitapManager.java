package kutuphane;

public class KitapManager {

	public void line(Kitap kitap) {
		if (kitap.getDurum() % 2 == 1) {
			System.out.println("Alındı  " + "ID:" + kitap.getId() + " -  " + kitap.getAd() + " , " + kitap.getYazar()
					+ " , " + kitap.getSayfa() + " , " + kitap.getYayinevi());
		}

		if (kitap.getDurum() % 2 == 0) {
			System.out.println("Mevcut  " + "ID:" + kitap.getId() + " -  " + kitap.getAd() + " , " + kitap.getYazar()
					+ " , " + kitap.getSayfa() + " , " + kitap.getYayinevi());
		}
	}

}
