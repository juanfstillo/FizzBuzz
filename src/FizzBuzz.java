/*Fizz Buzz is a common developer interview question; so common it’s almost cliché!

The challenge is designed to weed out 99.5% programming job candidates who cannot creatively use their coding knowledge to solve coding problems.

Want to give it a shot?

Author: Juan Stillo
*/

public class FizzBuzz {
    public static void main(String args[]) {
for(int i =0;i<=100;i++){
if (((i % 3) == 0) && ((i % 5) == 0)) {
  System.out.println("Fizz-Buzz");
  // block of code to be executed if condition1 is true
} else if (i %3 ==0 ) {
  System.out.println("Fizz");
  // block of code to be executed if the condition1 is false and condition2 is true
} else if ( i %5 ==0) {
  System.out.println("Buzz");
  // block of code to be executed if the condition1 is false and condition2 is true
}
else {
  System.out.println(i);
  // block of code to be executed if the condition1 is false and condition2 is false
}
        }
    }
}