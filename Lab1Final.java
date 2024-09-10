public class Lab1Final {

            public static void main(String[] args) {
            //Task 1 -Range

            int[] numbers = {93, 67, 3, 7, 86, 45};

            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            for (int number : numbers) {
                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }
            }

            int difference = largest - smallest;


            System.out.println("Task 1. Solution The smallest number is: " + smallest);
            System.out.println("The largest number is: " + largest);
            System.out.println("The difference between the largest and smallest numbers is: " + difference);


            //Task 2

            int firstBiggest = Integer.MIN_VALUE;
            int secondBiggest = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > firstBiggest) {
                    secondBiggest = firstBiggest;
                    firstBiggest = number;
                } else if (number > secondBiggest && number != firstBiggest) {
                    secondBiggest = number;
                }
            }

            System.out.println("The first biggest number is: " + firstBiggest);
            System.out.println("The second biggest number is: " + secondBiggest);

            //Task 3- calculate

            double x = 3;
            double y = -4;

            double xSquared = Math.pow(x, 2);

            double term = (4 * y / 5) - x;
            double termSquared = Math.pow(term, 2);


            double result;
            result = xSquared + termSquared;

            System.out.println("The result of the expression x^2 + ((4y/5) - x)^2 is: " + result);

        }
    }
