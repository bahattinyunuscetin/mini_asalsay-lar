public class Main {
    public static void main(String[] args){
        int number = 2, i;
        boolean isprime = true; // Başlangıçta true olarak ayarlanmalı

        if(number==1){
            System.out.println("sayı asal değildir");
        return;
        }
        if(number<1){
            System.out.println("geçersiz sayı");
            return;
        }

        for(i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                System.out.println("Sayı asal değildir çünkü " + i + " ile bölünüyor.");
                isprime = false; // Asal değilse a'yı false yap
               // Asal olmadığı zaten bulundu, kontrolü sonlandır
            }
        }

        if(isprime == true) {
            System.out.println("Sayı asaldır.");
        }
    }
}

