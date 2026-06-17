import java.util.*;

public class BMIProgram {

    public static double calculateBMI(double weight,double heightCm){

        double height=heightCm/100;

        return weight/(height*height);
    }

    public static String getStatus(double bmi){

        if(bmi<18.5)
            return "Underweight";
        else if(bmi<25)
            return "Normal";
        else if(bmi<30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++){

            double weight=sc.nextDouble();
            double height=sc.nextDouble();

            double bmi=calculateBMI(weight,height);

            System.out.printf("%.2f %s%n",bmi,getStatus(bmi));
        }
    }
}