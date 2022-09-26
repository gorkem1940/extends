//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.arslaner.kalıtım;

import java.util.Scanner;

public class EmployeeBasvuru {
    Scanner sc;

    public EmployeeBasvuru() {
        this.sc = new Scanner(System.in);
    }

    public void basvuru() {
        System.out.println("Adınızı giriniz.");
        String ad = this.sc.next();
        System.out.println("Soyadınızı giriniz.");
        String sad = this.sc.next();
        System.out.println("Başvurunuz için yaşınızı giriniz.");

        int yas;
        for(yas = this.sc.nextInt(); yas > 40 || yas < 20; yas = this.sc.nextInt()) {
            System.out.println("yaşınızı lütfen 20 veya 40 arasında giriniz. Yaş ortalamanız uymuyorsa başvurunuz değerlendirilmeyecektik. Reddelicektir.");
        }

        System.out.println("Bizim şirketimize yapabileceğiniz katkıları yazınız.");
        String departmanForm = this.sc.next();
        System.out.println("Girdiğiniz bilgiler için teşekkürler. En yakın sürede değerlendireceğiz.");
        System.out.println("------------------------------------------------------");
        System.out.println("BAŞVURU BİLGİLERİ");
        System.out.println("Ad: " + ad);
        System.out.println("Soyadı: " + sad);
        System.out.println("Yaş: " + yas);
        System.out.println("Departman Form: " + departmanForm);
    }
}
