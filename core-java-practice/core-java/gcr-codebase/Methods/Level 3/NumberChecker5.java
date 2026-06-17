import java.util.*;

public class NumberChecker5 {

    static int divisorSum(int n){

        int sum=0;

        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;

        return sum;
    }

    static boolean perfect(int n){
        return divisorSum(n)==n;
    }

    static boolean abundant(int n){
        return divisorSum(n)>n;
    }

    static boolean deficient(int n){
        return divisorSum(n)<n;
    }

    static int factorial(int n){

        int fact=1;

        for(int i=1;i<=n;i++)
            fact*=i;

        return fact;
    }

    static boolean strong(int n){

        int temp=n,sum=0;

        while(temp>0){
            sum+=factorial(temp%10);
            temp/=10;
        }

        return sum==n;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println("Perfect = "+perfect(n));
        System.out.println("Abundant = "+abundant(n));
        System.out.println("Deficient = "+deficient(n));
        System.out.println("Strong = "+strong(n));
    }
}