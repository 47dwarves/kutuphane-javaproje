package kutuphane;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Login login = new Login();
		login.login();

		ArrayList<Kitap> kitaplar = new ArrayList<>();

		int sayac2 = 0;

		kitaplar.add(new Kitap(1, "Bir Şehir Durduğunda", "F. Hande Topbaş", "Şule", "238"));
		kitaplar.add(new Kitap(2, "Şölen", "Platon", "Şule", "111"));
		kitaplar.add(new Kitap(3, "Rubailer", "Ömer Hayyam", "İş Bankası", "202"));
		kitaplar.add(new Kitap(4, "Sineklerin Tanrısı", "William Golding", "İş Bankası", "272"));
		kitaplar.add(new Kitap(5, "Alsancak Gezisi ve Şiirleri", "Yaşar AKSOY", "Alsanacak Yayınevi", "82"));
		kitaplar.add(new Kitap(6, "Altı Ay Bir Güz", "Bilge KARASU", "Onur", "88"));
		kitaplar.add(new Kitap(7, "Türlerin Kökeni", "Charles Darwin", "Onur", "661"));

		System.out.println("******  Kütüphane Otomasyon Uygulamasına Hoşgeldiniz.  ******\t\n");
		System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:\n");
		System.out.println("-------------------------------------");
		System.out.println("1) Mevcut kitapları listele: ");
		System.out.println("2) Listeye kitap ekle: ");
		System.out.println("3) Listeden kitap çıkar: ");
		System.out.println("4) Listedeki bir kitabın bilgilerini değiştirin: ");
		System.out.println("5) Kitap ödünç verin veya teslim alın: ");
		System.out.println("6) Kitap ara:");
		System.out.println("7) Çıkış yap: ");
		System.out.println("-------------------------------------");

		menu: while (true) {
			Scanner scan = new Scanner(System.in);
			try {

				String isimGirdisi = null;
				int islemNo = Integer.parseInt(scan.nextLine());

				switch (islemNo) {

				case 1:
					for (Kitap kitap : kitaplar) {
						kitap.line(kitap);

					}
					System.out.println("\nKitaplar listelendi. Sıradaki işleminizi seçin: ");

					continue;

				case 2:
					ekle: while (true) {
						System.out.print("id:");
						int id1 = Integer.parseInt(scan.nextLine());
						for (Kitap kitap : kitaplar) {
							if (id1 == kitap.getId()) {
								System.out.println("ID mevcut, lütfen değiştirin...");
								continue ekle;
							}
						}
						System.out.println("Kitap adı: ");
						String ad2 = scan.nextLine();
						System.out.println("Yazar adı: ");
						String yazar1 = scan.nextLine();
						System.out.println("Yayınevi: ");
						String yayinevi1 = scan.nextLine();
						System.out.println("Sayfa: ");
						String sayfa1 = scan.nextLine();

						kitaplar.add(new Kitap(id1, ad2, yazar1, yayinevi1, sayfa1));
						System.out.println("Kitap eklenmiştir. Sıradaki işlemi seçiniz: ");

						continue menu;
					}
				case 3:
					cıkar: while (true) {
						int ax = 0;
						System.out.println("Çıkarmak istediğiniz kitabın ID'sini girin: ");
						int cikarilacak = Integer.parseInt(scan.nextLine());
						for (Kitap kitap1 : kitaplar) {
							if (cikarilacak == kitap1.getId()) {
								ax = kitaplar.indexOf(kitap1);
							}
						}
						if (ax == 0) {
							System.out.println("ID bulunamadı. Yeniden deneyin lütfen..");
							continue cıkar;
						}
						kitaplar.remove(ax);
						System.out.println("\nKitap çıkarıldı. Sıradaki işleminizi seçin: ");
						continue menu;
					}
				case 4:
					duzenle: while (true) {
						int ab = 0;
						System.out.println("Düzenlemek istediğiniz kitabın ID'sini girin: ");
						int odunc1 = Integer.parseInt(scan.nextLine());
						for (Kitap kitap2 : kitaplar) {
							if (odunc1 == kitap2.getId()) {
								ab = kitaplar.indexOf(kitap2);
							}
						}
						if (ab == 0) {
							System.out.println("ID bulunamadı. Yeniden deneyin lütfen..");
							continue duzenle;
						}
						System.out.print("ID:");
						int id2 = Integer.parseInt(scan.nextLine());
						if (id2 != odunc1) {
							for (Kitap kitap : kitaplar) {
								if (id2 == kitap.getId()) {
									System.out.println("ID mevcut, lütfen değiştirin: ");
									continue duzenle;
								}
							}
						}
						System.out.println("Kitap adı: ");
						String ad1 = scan.nextLine();
						System.out.println("Yazar adı: ");
						String yazar2 = scan.nextLine();
						System.out.println("Yayınevi: ");
						String yayinevi2 = scan.nextLine();
						System.out.println("Sayfa: ");
						String sayfa2 = scan.nextLine();
						kitaplar.set(ab, new Kitap(id2, ad1, yazar2, yayinevi2, sayfa2));
						System.out.println("Bilgiler güncellendi. Sıradaki işleminizi seçin: ");
						continue menu;
					}
				case 5:
					System.out.println("Ödünç verilecek veya teslim alınacak kitabın ID'sini giriniz: ");
					int c = 0;
					int oduncx = Integer.parseInt(scan.nextLine());
					for (Kitap kitap2 : kitaplar) {
						if (oduncx == kitap2.getId()) {
							c = kitaplar.indexOf(kitap2);
						}
					}
					if (c < 0) {
						System.out.println("\nID bulunamadı..");
						continue menu;
					}
					for (Kitap kitap : kitaplar) {
						if (kitap.getId() == oduncx) {
							kitap.setDurum(kitap.getDurum() + 1);

							if (kitap.getDurum() % 2 == 0) {
								System.out.println("Kitap geri alındı. Sıradaki işleminizi seçin: ");
							} else if (kitap.getDurum() % 2 == 1) {
								System.out.println("Kitap ödünç verildi. Sıradaki işleminizi seçin: ");
							}
						}
					}
					continue;

				case 6:
					System.out.print("Kitap ismi veya yayinevi giriniz: ");
					isimGirdisi = scan.nextLine();
					for (Kitap kitap : kitaplar) {

						if (kitap.getAd().equalsIgnoreCase(isimGirdisi)) {

							System.out.println("\nAradığınız kitap bulunmuştur.");
							sayac2++;
							kitap.line(kitap);

						} else if (kitap.getYayinevi().equalsIgnoreCase(isimGirdisi)) {

							System.out.println("\nAradığınız yayınevine ait kitap(lar) bulunmuştur.");
							sayac2++;
							kitap.line(kitap);

						} else if (kitap.getYazar().equalsIgnoreCase(isimGirdisi)) {

							System.out.println("\nAradığınız yazara ait kitap(lar) bulunmuştur.");
							sayac2++;
							kitap.line(kitap);
						}
					}

					if (sayac2 == 0) {

						System.out.println(
								"\nGirdiğiniz veriyle ilgili herhangi bir sonuç bulunamamıştır. Sıradaki işleminizi seçiniz: ");
					}
					continue;

				case 7:
					scan.close();
					System.out.println("Çıkış yapıldı.");
					System.exit(0);

				default:
					System.out.println("Hatalı seçim! Menüye dönüldü.");

				}
			} catch (NumberFormatException e) {
				System.out.println("Geçersiz işlem! Menüye dönüldü.");
			}

		}
	}

}
