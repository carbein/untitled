package com.sercan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int month,day;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Doğduğunuz ay .....:");
        month=scanner.nextInt();
        System.out.println("Doğduğunuz gün ...:");
        day=scanner.nextInt();
        if (month==1 && day> 0 && day<=21 || month==12 && day>=22 && day<=31) {
            System.out.println("Oğlak burcusunuz.");
        }else if (month==2 && day>0 && day<=19 || month==1 && day>=22 && day<=31) {
            System.out.println("Kova burcusunuz.");
        }else if (month==3 && day>0 && day<=20 || month==2 && day>= 20 && day<=31) {
            System.out.println("Balık burcusunuz.");
        }else if (month==3 && day>=21 && day<=31 || month==4 && day>0 && day<=22){
            System.out.println("Koç burcusunuz.");
        } else if (month==4 && day>=21 && day<=31 || month==5 && day>0 && day<=22) {
            System.out.println("Boğa burcusunuz.");
        } else if (month==5 && day>=22 && day<=31 || month==6 && day>0 && day<=22) {
            System.out.println("İkizler burcusunuz");
        } else if (month==6 && day>=23 && day<=31 || month==7 && day>0 && day<=22) {
            System.out.println("Yengeç burcusunuz.");
        } else if (month==7 && day>=23 && day<=31 || month==8 && day>0 && day<=22) {
            System.out.println("Aslan burcusunuz.");
        } else if (month==8 && day>=23 && day<=31 || month==9 && day>0 && day<=22) {
            System.out.println("Başak burcusunuz");
        } else if (month == 9 && day>=23 && day<=31 || month==10 && day>0 && day<=22) {
            System.out.println("Terazi burcusunuz");
        }else if (month==10 && day>=23 && day<=31 || month==11 && day>0 && day<=21) {
            System.out.println("Akrep burcusunuz");
        } else if (month==11 && day>=22 && day<=31 || month==12 && day>0 && day<=21) {
            System.out.println("Yay burcusunuz");
        }

    }
}