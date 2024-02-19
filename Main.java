import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        String[] dictionary = {"cat", "dog", "red", "is", "am"};
//
//        ArrayList<String> result = new ArrayList<>();
//        String temp = dictionary[0];
//        for(String d: dictionary){
//
//            if(temp.length()==d.length()) {
//                result.add(d);
//                temp = d;
//            }else if(d.length()>temp.length()){
//                result.clear();
//                result.add(d);
//            }
//
//
//        }
//        System.out.println(result);


//----------------------------------------------------------------------------------------------------------------------

//        //Q2
//        int[] numbers = {1, 1, 1, 3, 3, 5};
//
//        System.out.println("enter a number");
//        int num = s.nextInt();
//
//        int count = 0;
//        for(int n:numbers){
//            if(num==n)
//            count++;
//        }
//
//        if(count==0){
//        System.out.println(num + " occurs " + count + " time");
//        }else System.out.println(num + " occurs " + count + " times");


//----------------------------------------------------------------------------------------------------------------------


//        //Q3
//        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
//
//        System.out.println("enter k value");
//        int k = s.nextInt();
//
//        ArrayList<Integer> largestThree = new ArrayList<>();
//
//        int count = 0;
//
//        for(int i = numbers.length-1; i>k; i--){
//            Arrays.sort(numbers);
//
//            largestThree.add(numbers[i]);
//
//            System.out.print(largestThree.get(count) + " ");
//
//            count++;
//        };





//----------------------------------------------------------------------------------------------------------------------


//        //Q4
//        ArrayList<Integer> reverse = new ArrayList<Integer>();
//
//        reverse.add(5);
//        reverse.add(4);
//        reverse.add(3);
//        reverse.add(2);
//        reverse.add(1);
//
//        reverseArray(reverse);
//
//        System.out.println("reversed array: " + reverse);


//----------------------------------------------------------------------------------------------------------------------

//        //Q5
//        System.out.println("enter the size of an array");
//        int size = s.nextInt();
//
//        int[] array = new int[size];
//
//        int exit = 0;
//        do{
//            System.out.println("1. accept an array " +
//                    "\n2. display elements of an array\n" +
//                    "3. search the element of an array\n" +
//                    "4. sort the array\n" +
//                    "5. to stop");
//            int choice = s.nextInt();
//
//            switch(choice){
//                case 1:
//                    System.out.println("enter the index");
//                    int index = s.nextInt();
//                    System.out.println("enter the value");
//                    int value = s.nextInt();
//                    array[index] = value;
//                    break;
//                case 2:
//                    System.out.println(Arrays.toString(array));
//                    break;
//                case 3:
//                    System.out.println("enter the element");
//                    int element = s.nextInt();
//                    for(int i=0; i<array.length;i++){
//                        if(array[i]==element){
//                            System.out.println(element + " element exists at index: " + i);
//                        }else System.out.println("element does npt exists");
//                    }
//
//                    break;
//                case 4:
//                    Arrays.sort(array);
//                    System.out.println(Arrays.toString(array));
//
//                    break;
//                case 5:
//                    exit = 5;
//                    break;
//            }
//
//        }while(exit!=5);

//----------------------------------------------------------------------------------------------------------------------


//        //Q6
//        int minValue=0;
//        int maxValue=0;
//        do {
//            System.out.println("Enter the minimum value of the range: ");
//            minValue = s.nextInt();
//
//            System.out.println("Enter the maximum value of the range: ");
//            maxValue = s.nextInt();
//
//            if(minValue>maxValue){
//                System.out.println("minimum value can only be lesser or equal to maximum");
//                System.out.println("---------------------------------------------------------------------");
//            }
//
//        }while(maxValue<minValue);
//
//        System.out.println("Enter the number of random numbers to generate: ");
//        int genNum = s.nextInt();
//
//        random(minValue, maxValue, genNum);


//----------------------------------------------------------------------------------------------------------------------


//        //Q7
//        System.out.println("input password");
//        StringBuilder password = new StringBuilder(s.nextLine());
//
//        passwordStrength(password);


//----------------------------------------------------------------------------------------------------------------------

//        //Q8
//        System.out.println("enter the number of fibonacci number to generate: ");
//        int num = s.nextInt();
//        fibonacci(num);



    }


    public static ArrayList<Integer> reverseArray(ArrayList array){


        for(int i=0; i<array.size(); i++){
            array.add(i, array.getLast());
            array.removeLast();
        }
        return array;
    }

    public static void random(int minValue, int maxValue, int genNum){

        Random rand = new Random();

        for(int i = 0; i<genNum; i++){
            System.out.print(rand.nextInt(minValue,maxValue+1));
            if(i!=genNum-1)
                System.out.print(" - ");
        }

    }

    public static void passwordStrength(StringBuilder password){
        int points = 0;

        points += checkSpecial(password);
        points += isUpperCaseLowerCase(password);
        points += checkLength(password);

        if(points>=8){
            System.out.println("password is Strong");
        }else if(points>=5){
            System.out.println("password is moderately Strong");
        }else System.out.println("password is weak");


    }

    public static int checkLength(StringBuilder password){
        int points = 0;

        if(password.length()>=8){
            points = 3;
        }else if(password.length()==7 || password.length()==6){
            points = 2;
        }
        return points;
    }
    public static int checkSpecial(StringBuilder password) {
        int points = 0;

        boolean isLettersNumbers = true;

        for (int i = 0; i < password.length(); i++) {
            char temp = password.charAt(i);

            isLettersNumbers = Character.isAlphabetic(temp) || Character.isDigit(temp);

            if (!isLettersNumbers) {
                points = 2;
                break;
            }

        }

        return points;
    }

    public static int isUpperCaseLowerCase(StringBuilder password){
        int points = 0;
        String str = password.toString();
        boolean isUpLow =  str.matches(".*[A-Z].*") && str.matches(".*[a-z].*");

        if(isUpLow){
            points = 3;
        }

        return points;
    }

    public static void fibonacci(int num){

        int start = 1;
        int fibonacci = 0;
        int result = 0;
        System.out.println("fibonacci sequence with " + num + " terms:");
        for(int i = 0; i<num; i++){

            System.out.print(fibonacci+" ");

            result = fibonacci + start;
            fibonacci = start;
            start = result;

        }

    }


}