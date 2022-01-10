package kutuphane;

public class Kitap extends KitapManager {
	private int durum;
	private int id;
	private String ad;
	private String yazar;
	private String yayinevi;
	private String sayfa;

	public Kitap(int id, String ad, String yazar, String yayinevi, String sayfa) {
		this.id = id;
		this.ad = ad;
		this.yazar = yazar;
		this.yayinevi = yayinevi;
		this.sayfa = sayfa;
		this.durum = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getYayinevi() {
		return yayinevi;
	}

	public void setYayinevi(String yayinevi) {
		this.yayinevi = yayinevi;
	}

	public String getSayfa() {
		return sayfa;
	}

	public void setSayfa(String sayfa) {
		this.sayfa = sayfa;
	}

	public int getDurum() {
		return durum;
	}

	public void setDurum(int durum) {
		this.durum = durum;
	}

}
