package kutuphane;

public class KitapManager {

	public void line(Kitap kitap) {
		if (kitap.getDurum() % 2 == 1) {
			System.out.println("alındı  " + "ID:" + kitap.getId() + " --  " + kitap.getAd() + " , " + kitap.getYazar()
					+ " , " + kitap.getSayfa() + " , " + kitap.getYayinevi());
		}

		if (kitap.getDurum() % 2 == 0) {
			System.out.println("mevcut  " + "ID:" + kitap.getId() + " --  " + kitap.getAd() + " , " + kitap.getYazar()
					+ " , " + kitap.getSayfa() + " , " + kitap.getYayinevi());
		}
	}

	public void line2(Kitap kitap) {

		System.out.println("ID:" + kitap.getId() + "-  " + kitap.getAd() + " , " + kitap.getYazar() + " , "
				+ kitap.getSayfa() + " , " + kitap.getYayinevi());

	}

}
