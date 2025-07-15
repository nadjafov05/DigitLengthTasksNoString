package easyTask;

import java.util.Scanner;

public class EasyTask {
    //1. Massivdə neçə ədəddə yalnız 1 rəqəm var?
    //➡ Hər ədəd üçün while ilə rəqəm sayını tap, 1-dirsə sayacı artır.
    public static void whatsOneNumbersInArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter to massiv numbers: ");
        int arraysNumbers = sc.nextInt();

        int[] numbers = new int[arraysNumbers];

        int oneNumbers = 0;
        for (int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] > 0 && numbers[i] < 10){
                oneNumbers++;
            }
        }
        System.out.println(oneNumbers);
    }


    //2. Massivdə neçə ədəddə 2 rəqəm var?
    //➡ Rəqəm sayı 2 olan ədədləri say.
    public static void whatsTwoNUmbersInArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enters to massiv numbers");
        int numbersScanner = sc.nextInt();

        //massivde olan 2 reqemlilerin saylari
        int numbersTwo = 0;

        //daxil etdiyimiz scanner qeder massiv doldur
        int[] numbers = new int[numbersScanner];

        //massivleri 1-1 doldur
        for (int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }

        //doldurulmus massivlere daxil ol ve
        for (int i=0;i<numbers.length;i++){
            //eger massivde olan reqemler 10 boyukdurse ve 100 kicikdirse
            if (numbers[i] > 10 && numbers[i] < 100){
                //numbersTwo deyisenini 1 vahid artir
                numbersTwo++;
            }
        }
        System.out.println(numbersTwo);
    }

    //3. Massivdə neçə ədəddə 3 rəqəm var?
    //➡ Eyni üsul, sadəcə length == 3 şərti.

    public static void whatsThreeNumbersInArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("whats enter added arrays?");
        int addArrays = sc.nextInt();
        int[] arrays = new int[addArrays];

        int count = 0;
        for (int i=0;i<arrays.length;i++){
            arrays[i] = sc.nextInt();
        }
        for (int i=0;i<arrays.length;i++){
            if (arrays[i] >= 100 && arrays[i] < 1000){
                count++;
            }
        }
        System.out.println(count);
    }

    //4. Massivdə neçə ədəddə cüt rəqəm sayı var?
    //➡ Rəqəm sayını tap, əgər length % 2 == 0 → sayacı artır.
    public static void whatsNumberHaweEvenGit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enters three numbers in arrays");
        int numbersEnter = sc.nextInt();
        int[] numbersArr = new int[numbersEnter];

        int countThree = 0;

        for (int i=0;i<numbersArr.length;i++){
            numbersArr[i] = sc.nextInt();
        }
        for (int i=0;i<numbersArr.length;i++){
            if (numbersArr[i]%2 == 0){
                countThree++;
            }
        }
        System.out.println(countThree);
    }

    //5. Massivdə neçə ədəddə tək rəqəm sayı var?
    //    //➡ Əvvəlki tapşırıqla eynidir, amma % 2 != 0.
    public static void whatsNumberHaweOddGit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enters three numbers in arrays");
        int numbersEnter = sc.nextInt();
        int[] numbersArr = new int[numbersEnter];

        int countThree = 0;

        for (int i=0;i<numbersArr.length;i++){
            numbersArr[i] = sc.nextInt();
        }
        for (int i=0;i<numbersArr.length;i++){
            if (numbersArr[i]%2 != 0){
                countThree++;
            }
        }
        System.out.println(countThree);
    }

    //6. Massivdə 1-dən 3-ə qədər rəqəmli ədədləri çap et.
    //➡ Əgər length >= 1 && length <= 3 → çap et.
    public static void onethethreenumberprint(){
        int[] numbers = {1,22,334,4444,55555};

        for (int i=0;i<numbers.length;i++){
            int count = 0;
            //index reqemini saxlayir her dovrde
            int reqemYoxlama = numbers[i]; //1,

            //index reqemini muveqqeti saxlayir,yeni bolme elemek ucun
            int temp = reqemYoxlama;

            while (temp!=0){
                temp = temp / 10;
                count++;
            }
            if (count >= 1 && count <= 3){
                System.out.println(reqemYoxlama);
            }
        }
    }

    //7. Massivdə yalnız 5 rəqəmli ədədləri çap et.
    //➡ length == 5 olanları çap et.
    public static void fivenumberprint(){
        int[] numbers = {1,22,333,4444,55555,91205,41256};

        for (int i=0;i<numbers.length;i++){
            int count = 0; // 5 eded olanlari her defe artirir

            int reqemYoxlama = numbers[i]; // i de olan reqemleri saxlayir

            int temp = reqemYoxlama;

            while (temp!=0){
                temp = temp / 10;
                count++;
            }
            if (count >4 && count <6){
                System.out.println(reqemYoxlama);
            }
        }
    }





}
