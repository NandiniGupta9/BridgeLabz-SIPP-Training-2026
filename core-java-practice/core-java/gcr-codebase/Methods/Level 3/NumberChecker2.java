import java.util.*;

public class NumberChecker2 {

    static int[] digits(int n){

        String s=String.valueOf(n);
        int[] arr=new int[s.length()];

        for(int i=0;i<s.length();i++)
            arr[i]=s.charAt(i)-'0';

        return arr;
    }

    static int sumDigits(int[] arr){
        int sum=0;
        for(int d:arr) sum+=d;
        return sum;
    }

    static double sumSquareDigits(int[] arr){
        double sum=0;
        for(int d:arr)
            sum+=Math.pow(d,2);
        return sum;
    }

    static boolean isHarshad(int n,int[] arr){
        return n%sumDigits(arr)==0;
    }

    static int[][] frequency(int[] arr){

        int[][] freq=new int[10][2];

        for(int i=0;i<10;i++)
            freq[i][0]=i;

        for(int d:arr)
            freq[d][1]++;

        return freq;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=digits(n);

        System.out.println("Sum = "+sumDigits(arr));
        System.out.println("Square Sum = "+sumSquareDigits(arr));
        System.out.println("Harshad = "+isHarshad(n,arr));
    }
}