import java.util.*;

public class NumberChecker4 {

    static boolean isPrime(int n){

        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;

        return true;
    }

    static boolean isNeon(int n){

        int square=n*n;
        int sum=0;

        while(square>0){
            sum+=square%10;
            square/=10;
        }

        return sum==n;
    }

    static boolean isSpy(int n){

        int sum=0,product=1,temp=n;

        while(temp>0){
            int d=temp%10;
            sum+=d;
            product*=d;
            temp/=10;
        }

        return sum==product;
    }

    static boolean isAutomorphic(int n){
        return String.valueOf(n*n).endsWith(String.valueOf(n));
    }

    static boolean isBuzz(int n){
        return n%7==0 || n%10==7;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println(isPrime(n));
        System.out.println(isNeon(n));
        System.out.println(isSpy(n));
        System.out.println(isAutomorphic(n));
        System.out.println(isBuzz(n));
    }
}