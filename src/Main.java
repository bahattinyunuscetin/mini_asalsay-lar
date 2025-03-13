public class Main {
    public static void main(String[] args){
        int number = 156156, i;
        boolean a = true; // Başlangıçta true olarak ayarlanmalı

        for(i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                System.out.println("Sayı asal değildir çünkü " + i + " ile bölünüyor.");
                a = false; // Asal değilse a'yı false yap
               // Asal olmadığı zaten bulundu, kontrolü sonlandır
            }
        }

        if(a == true) {
            System.out.println("Sayı asaldır.");
        }
    }
}

