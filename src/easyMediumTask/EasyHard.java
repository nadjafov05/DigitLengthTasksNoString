package easyMediumTask;

public class EasyHard {

    //11. Ən uzun rəqəmli ədədi tap.
    //➡ Rəqəm sayını tap, maxLength ilə müqayisə et.
    public static void findNumberWithMaxDigits(){
        int[] numbers = {5, 12, 345, 23, 1, 7896, 88};

        int maxLength = 0;
        int longestNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int length = 0;

            // 0 üçün ayrıca yoxlama
            if (number == 0) {
                length = 1;
            } else {
                int temp = number;
                while (temp > 0) {
                    temp = temp / 10;
                    length++;
                }
            }

            if (length > maxLength) {
                maxLength = length;
                longestNumber = number;
            }
        }

        System.out.println("Ən uzun rəqəmli ədəd: " + longestNumber);
    }


    //12. Ən qısa rəqəmli ədədi tap.
    //➡ Eyni üsulla minLength və shortestNumber saxla.
    public static void findNumberWithMinDigits(){
        int[] numbers = {3,584,96,85,7,56,9};
        int minLenght = 100;
        int shortesNumbers = 0;

        for (int i=0;i<numbers.length;i++){
            int number = numbers[i];
            int lenght = 0;

            if (number == 0){
                lenght = 1;
            }else {
                int temp = number;
                while (temp > 0){
                    temp = temp / 10;
                    lenght++;
                }
            }
            if (lenght < minLenght){
                minLenght = lenght;
                shortesNumbers = number;
            }
        }
        System.out.println("en qisa reqemli ede = " + shortesNumbers);
    }

    //13. Ən uzun ədədin rəqəm sayını yaz.
    //➡ Əvvəl maxLength, sonra çap et.
    public static void findMaxDigitCount(){
        int[] numbers = {5,12,345,23,1,7896,88,88888,958547,8596547};

        int maxLength = 0;
        int longestNumbers = 0;


        //en uzun reqemin sayi
        int massivdeOlanUzun = 0;


        for (int i=0;i<numbers.length;i++){
            int number = numbers[i];
            int lengt = 0;

            if (number == 0){
                lengt = 1;
            }else {
                int temp = number;
                while (temp > 0){
                    temp = temp / 10;
                    lengt++;
                }
            }
            if (lengt > maxLength){
                maxLength = lengt;
                longestNumbers = number;
            }
        }
        while (longestNumbers != 0){
            longestNumbers = longestNumbers / 10;
            massivdeOlanUzun++;
        }
        System.out.println("massivde olanb ededin uzunlugu: " + massivdeOlanUzun);
    }

    //14. Ən qısa ədədin rəqəm sayını yaz.
    //➡ Əvvəl minLength, sonra çap et.
    public static void findMinDigitCount(){
        int[] numbers = {214,1,896,89,66,32,1105,2345,2551};
        int minLenght = 100;
        int shortesNumbers = 0;

        //massivde olan qisa reqemli ededlerin sayi
        int qisaReqemli = 0;

        for (int i=0;i<numbers.length;i++){
            int number = numbers[i];
            int lenght = 0;

            if (number == 0){
                lenght = 1;
            }else {
                int temp = number;
                while (temp!=0){
                    temp = temp / 10;
                    lenght++;
                }
            }
            if (lenght < minLenght){
                minLenght = lenght;
                shortesNumbers = number;
            }
        }
        System.out.println("minumum eded: " + shortesNumbers);
        while (shortesNumbers !=0){
            shortesNumbers = shortesNumbers / 10;
            qisaReqemli++;
        }
        System.out.println("minimum reqemin icindeki ededler: " + qisaReqemli);
    }

    //15. Rəqəm sayı 3-dən çox olan ədədləri çap et.
    //➡ length > 3 olanları çap et.
    public static void threenumbersprints(){
        int[] numbers = {1,22,333,4444,55555,444,858,696,365,125,123,447,858,91205,41256,4585};

        for (int i=0;i<numbers.length;i++){
            int count = 0; // 5 eded olanlari her defe artirir

            int reqemYoxlama = numbers[i]; // i de olan reqemleri saxlayir

            int temp = reqemYoxlama;

            while (temp!=0){
                temp = temp / 10;
                count++;
            }
            if (count >3){
                System.out.println(reqemYoxlama);
            }
        }
    }

    //16. Rəqəm sayı 4-dən az olan neçə ədəd var?
    //➡ length < 4 olanların sayını hesabla.
    public static void countNumbersWithLessThan4Digits(){
        int[] numbers = {1,22,333,4444,55555,444,858,696,365,125,123,447,858,91205,41256,4585};
        int dorddenazolan = 0;
        for (int i=0;i<numbers.length;i++){
            int count = 0; // 5 eded olanlari her defe artirir

            int reqemYoxlama = numbers[i]; // i de olan reqemleri saxlayir

            int temp = reqemYoxlama;

            while (temp!=0){
                temp = temp / 10;
                count++;
            }
            if (count < 4){
                dorddenazolan++;
            }
        }
        System.out.println(dorddenazolan);
    }

    //17. Ən uzun və ən qısa ədədin fərqini çap et.
    //➡ Əvvəl hər ikisini tap, sonra fərqini yaz.
    public static void printDifferenceOfLongestAndShortestNumber(){
        int[] massivReqemi = {5,12,345,23,1,7896,88};
        int MaxUzunlug = 0;
        int reqemlerinUzunluSeviyesi = 0;

        //kicikEded

        int minimumReqem = 100;
        int reqemlerinUzunluguSeviyesiKicik = 0;


        //max ededler
        for (int i=0;i<massivReqemi.length;i++){
            int indexReqemi = massivReqemi[i];
            int indexdeOlanReqemSayi = 0;

            if (indexReqemi == 0){
                indexdeOlanReqemSayi = 1;
            }else {
                int bolunenEdedler = indexReqemi;
                while (bolunenEdedler != 0){
                    bolunenEdedler = bolunenEdedler / 10;
                    indexdeOlanReqemSayi++;
                }
            }

            if (indexdeOlanReqemSayi > MaxUzunlug){
                MaxUzunlug = indexdeOlanReqemSayi;
                reqemlerinUzunluSeviyesi = indexReqemi;
            }
        }

        //minimum ededler

        for (int i=0;i<massivReqemi.length;i++){
            int indexReqemi = massivReqemi[i];
            int indexUzunlug = 0;

            if (indexReqemi == 0){
                indexUzunlug = 1;
            }else {
                int bolmeIndex = indexReqemi;
                while (bolmeIndex != 0){
                    bolmeIndex = bolmeIndex / 10;
                    indexUzunlug++;
                }
            }
            if (indexUzunlug < minimumReqem){
                minimumReqem = indexUzunlug;
                reqemlerinUzunluguSeviyesiKicik = indexReqemi;
            }
        }
        int ferq = MaxUzunlug - minimumReqem;
        System.out.println("uzunlug ferqi :"+ferq);

        int ferq2 = reqemlerinUzunluSeviyesi - reqemlerinUzunluguSeviyesiKicik;
        System.out.println("reqemlerin ferqi = :"+ferq2);
    }

}
