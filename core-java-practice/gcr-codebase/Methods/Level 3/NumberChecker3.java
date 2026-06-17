import java.util.*;

public class NumberChecker3 {

    static int[] digits(int n){

        String s=String.valueOf(n);
        int[] arr=new int[s.length()];

        for(int i=0;i<s.length();i++)
            arr[i]=s.charAt(i)-'0';

        return arr;
    }

    static int[] reverse(int[] arr){

        int[] rev=new int[arr.length];

        for(int i=0;i<arr.length;i++)
            rev[i]=arr[arr.length-1-i];

        return rev;
    }

    static boolean equal(int[] a,int[] b){

        return Arrays.equals(a,b);
    }

    static boolean palindrome(int[] arr){
        return equal(arr,reverse(arr));
    }

    static boolean duck(int[] arr){

        for(int d:arr)
            if(d==0) return true;

        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=digits(n);

        System.out.println("Palindrome = "+palindrome(arr));
        System.out.println("Duck = "+duck(arr));
    }
}