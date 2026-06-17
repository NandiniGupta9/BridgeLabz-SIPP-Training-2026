import java.util.*;

public class FactorsOperations {

    static int[] factors(int n){

        int count=0;

        for(int i=1;i<=n;i++)
            if(n%i==0)
                count++;

        int[] arr=new int[count];
        int index=0;

        for(int i=1;i<=n;i++)
            if(n%i==0)
                arr[index++]=i;

        return arr;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=factors(n);

        int greatest=arr[arr.length-1];
        int sum=0;
        long product=1;
        double cubeProduct=1;

        for(int f:arr){
            sum+=f;
            product*=f;
            cubeProduct*=Math.pow(f,3);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Greatest = "+greatest);
        System.out.println("Sum = "+sum);
        System.out.println("Product = "+product);
        System.out.println("Cube Product = "+cubeProduct);
    }
}