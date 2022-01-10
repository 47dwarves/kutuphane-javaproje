package kutuphane;

import java.util.Scanner;

public class Login {

	public void login() {

		String kAdi = "admin";
		String kSifre = "123456";

		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Kullanıcı Adı: ");
			String kAdi2 = scanner.nextLine();

			System.out.println("Şifre: ");
			String kSifre2 = scanner.nextLine();

			if (kAdi2.equals(kAdi) && kSifre2.equals(kSifre)) {

				System.out.println("Giriş yapıldı.\n");

				break;
			}

			else {
				System.out.println("Giriş bilgileri hatalı! Yeniden deneyin.\n");

			}
		}
	}

}
