import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//EX1
//        String[] st={ "cat", "dog", "red", "is", "am" };
//        String longestWord = findLongestWord(st);
//
//        System.out.println("Longest word: " + longestWord);
//
//    }
//    public static String findLongestWord(String[] words) {
//        if (words == null || words.length == 0) {
//            return null; // اذا كانت المصفوفه فارغه او لا
//        }
//        String longestWord = words[0];
//
//        for (String word:words) {
//            if (word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//        }
//
//        return longestWord;}}


    //EX2

//        int[] array = {1, 1, 1, 3, 3, 5};
//
//        countOccurrences(array);
//    }
//    public static void countOccurrences(int[] array) {
//        HashMap<Integer, Integer> occurrences = new HashMap<>();//زي مخزن يحفظ فيه عناصر المصفوفة
//
//        for (int num : array) {
//            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1); // يزيد عد مرات تكرار كل عنصر+1 ,, ,getDefault يرجع قيمه عدد تكرار العنصر
//        }
//
//        for (int num : occurrences.keySet()) {
//            System.out.println(num + " occurs " + occurrences.get(num) + " times");
//        }}}


        //EX3

//        int[] array = {1, 4, 17, 7, 25, 3, 100};
//        int k = 3;
//
//        findKLargestElements(array, k);
//    }
//    public static void findKLargestElements(int[] array, int k) {
//        Arrays.sort(array);
//
//        System.out.println(k + " largest elements of the said array are:");
//        for (int i = array.length - 1; i >= array.length - k; i--) {
//            System.out.print(array[i] + " ");}}}


//EX4
//        int[] array = {5, 4, 3, 2, 1};
//        reverseArray(array); //لعكس المصفوفه
//
//        System.out.println("Reversed Array:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }
//    public static void reverseArray(int[] array) {
//        int start = 0;
//        int end = array.length - 1;
//
//        while (start < end) {//
//            int temp = array[start]; // متغير مؤقت
//            array[start] = array[end];//نغير قيمه العنصر
//            array[end] = temp;// القيمه ستارت وصارت اند واند صارت تيمب عدنا القيمه الاصليه
//
//            start++;
//            end--;
//        }}}

      //EX5

//        Scanner scanner = new Scanner(System.in);
//        int[] array = null;
//        int size = 0;
//
//        while (true) { //  تعمل بشكل دائم حتى يتم اختيار الخيار رقم 5 الذي يوقف تشغيل
//            System.out.println("\nMenu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search for an element within the array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. Stop");
//
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {//لتحديد الخيار المناسب وتنفذ العمليه
//                case 1:
//                    System.out.print("Enter the size of the array: ");
//                    size = scanner.nextInt();//يقرا الحجم المدخل
//                    array = new int[size];//ينشئ مصفوفه جديده بحجم المدخل
//                    System.out.println("Enter the elements of the array:");// يطلب ادخال العناصر
//                    for (int i = 0; i < size; i++) {//يتم التكرار حتى يتم تخزين جميع العناصر
//                        array[i] = scanner.nextInt();//العدد المدخل
//                    }
//                    break;
//                case 2:
//                    if (array != null) {
//                        System.out.println("Elements of the array: " + Arrays.toString(array));//الى سلسله نصيه تحتوي ع عناصر المصفوفه
//                    } else {
//                        System.out.println("Array is not initialized yet!");// اذا لم يتم تهيئة المصفوفه
//                    }
//                    break;
//                case 3:
//                    if (array != null) {
//                        System.out.print("Enter the element to search: ");
//                        int searchElement = scanner.nextInt();
//                        boolean found = false;// يتحقق اذا العنصر تم العثور عليه ام لا
//                        for (int num : array) {
//                            if (num == searchElement) {
//                                found = true;
//                                break;
//                            }
//                        }
//                        if (found) {
//                            System.out.println("Element found in the array.");
//                        } else {
//                            System.out.println("Element not found in the array.");
//                        }
//                    } else {
//                        System.out.println("Array is not initialized yet!");
//                    }
//                    break;
//                case 4:
//                    if (array != null) {
//                        Arrays.sort(array);//فرز المصفوفه
//                        System.out.println("Array sorted successfully.");
//                    } else {
//                        System.out.println("Array is not initialized yet!");
//                    }
//                    break;
//                case 5:
//                    System.out.println("Program stopped.");
//
//                    return;
//                default://اذا اخترنا خيار غير صالح
//                    System.out.println("Invalid choice! Please enter a valid option.");
//            }}}}



       //EX6

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the minimum value of the range: ");
//        int min = scanner.nextInt(); // الحد الادنى
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = scanner.nextInt();// الحد الاعلى
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int count = scanner.nextInt();// عدد الارقام العشوائيه
//
//        System.out.println("Random numbers within the specified range:");
//        for (int i = 0; i < count; i++) {// تكرار
//            int randomNumber = generateRandomNumber(min, max);// لانشاء رقم عشوائي في الحدود
//            System.out.print(randomNumber);
//            if (i < count - 1) {// يتحقق اذا الرقم الي تم طباعته في الحلقه مو الاخير واذا الرقم الحالي اقل من عدد الارقام -1 ف نضيف - عشان افصله عن الرقم التالي
//                System.out.print(" - ");
//            }
//        }
//    }
//    public static int generateRandomNumber(int min, int max) {// لانشاء العدد العشوائي بين الحدود
//        Random random = new Random();
//        return random.nextInt((max - min) + 1) + min;}}// لضمان ان النطاق يشمل الحد الادنى مثل لو الحد الاعلى 7والادنى3 فبيكون 5 ارقام عشوائيه ممكنه لان العشوائي يبدا من 0نتاكد ان الحد الادنى تضمن


    //EX7
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a password: ");
//        String password = scanner.nextLine();
//        int score = 0; // مؤشر قوه الباسوورد النقاط
//
//
//        if (password.length() >= 8) score += 3; // الطول وثلاث نقاط
//        else if (password.length() >= 6) score += 2;// نقطتين اذا اكبر ويساوي 6
//
//
//        if (password.matches(".*[^a-zA-Z0-9].*")) score += 2;//يتاكد اذا فيه حروف خاصه ولها نقطتين
//
//
//        if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")) score += 3;// اذا فيه حروف كبيره وصغيره ثلاث نقاط
//
//
//        if (score >= 8) System.out.println("Password is strong");
//        else if (score >= 5) System.out.println("Password is moderately strong");
//        else System.out.println("Password is weak");}}


       //EX8
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int numTerms = scanner.nextInt();
//        generateFibonacci(numTerms);}
//    public static void generateFibonacci(int numTerms) {
//        int a = 0, b = 1;
//        System.out.println("Fibonacci sequence with " + numTerms + " terms:");
//        for (int i = 0; i < numTerms; i++) {
//            System.out.print(a + " ");
//            int temp = a + b;
//            a = b;
//            b = temp;}}}