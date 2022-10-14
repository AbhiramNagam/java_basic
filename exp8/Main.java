package exp8;

import java.io.*;
import java.util.*;
interface cal_{
    int SumOfDivisiors(int n);
}

class Calculator implements cal_{
    public int SumOfDivisiors(int n){
        int sum=1;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0)
                sum+=i;
        }
        if(n!=1)
            return sum+n;
        else
            return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cal_ myCalculator = new Calculator();
        int sum = myCalculator.SumOfDivisiors(n);
        System.out.println("sum : " + sum);
    }
}
