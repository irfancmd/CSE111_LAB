package Lab02;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
                
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}