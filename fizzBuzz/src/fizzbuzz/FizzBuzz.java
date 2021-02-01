//created by: Trevor Cunagin
//this program prints numbers from 1 to 100, where every multiple of 3 prints
//"Fizz" and every multiple of 5 prints "Buzz". It prints "FizzBuzz" when a 
//number is a multiple of 3 and 5
package fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) { //for loop to count from 1 to 100
            if (i % 3 == 0 && i % 5 == 0) //divisible by 3 and 5 case
                System.out.println("FizzBuzz");
            else if (i % 3 != 0 && i % 5 != 0) //divisible by neither case
                System.out.println(i);
            else if (i % 3 == 0) //divisible by only 3 case
                System.out.println("Fizz");
            else                    //divisible by only 5 case
                System.out.println("Buzz"); 
        }
    }
    
}
