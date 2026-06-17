import java.util.*;

public class NumberChecker1 {

    static int countDigits(int n){
        return String.valueOf(n).length();
    }

    static int[] storeDigits(int n){
        String s=String.valueOf(n);
        int[] digits=new int[s.length()];

        for(int i=0;i<s.length();i++)
            digits[i]=s.charAt(i)-'0';

        return digits;
    }

    static boolean isDuckNumber(int[] digits){
        for(int d:digits)
            if(d==0) return true;
        return false;
    }

    static boolean isArmstrong(int n,int[] digits){
        int power=digits.length;
        int sum=0;

        for(int d:digits)
            sum+=Math.pow(d,power);

        return sum==n;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] digits=storeDigits(n);

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int d:digits){

            if(d>largest){
                secondLargest=largest;
                largest=d;
            }else if(d>secondLargest && d!=largest){
                secondLargest=d;
            }

            if(d<smallest){
                secondSmallest=smallest;
                smallest=d;
            }else if(d<secondSmallest && d!=smallest){
                secondSmallest=d;
            }
        }

        System.out.println("Duck = "+isDuckNumber(digits));
        System.out.println("Armstrong = "+isArmstrong(n,digits));
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondLargest);
        System.out.println("Smallest = "+smallest);
        System.out.println("Second Smallest = "+secondSmallest);
    }
}