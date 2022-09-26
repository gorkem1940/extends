package com.arslaner.kalıtım;

import java.util.Scanner;

public class EmployeeBasvuru {
    Scanner sc = new Scanner(System.in);

    public void basvuru() {

        System.out.println("Adınızı giriniz.");
        String ad = sc.next();
        System.out.println("Soyadınızı giriniz.");
        String sad = sc.next();
        System.out.println("Başvurunuz için yaşınızı giriniz.");
        int yas = sc.nextInt();
        while (yas > 40 || yas < 20) {
            System.out.println("yaşınızı lütfen 20 veya 40 arasında giriniz. Yaş ortalamanız uymuyorsa başvurunuz değerlendirilmeyecektik. Reddelicektir.");
            yas = sc.nextInt();
        }
        System.out.println("Bizim şirketimize yapabileceğiniz katkıları yazınız.");
        String departmanForm = sc.next();
        System.out.println("Girdiğiniz bilgiler için teşekkürler. En yakın sürede değerlendireceğiz.");

        System.out.println("------------------------------------------------------");
        System.out.println("BAŞVURU BİLGİLERİ");
        System.out.println("Ad: " + ad);
        System.out.println("Soyadı: " + sad);
        System.out.println("Yaş: " + yas);
        System.out.println("Departman Form: " + departmanForm);

    }
}
