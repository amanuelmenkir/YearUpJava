package yearup.week2.homework;
import java.util.Scanner;

public class calculatorImplementation implements Calculator {

        private double testLength = askValue();
        private double newArea;

        public double askValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide a length value ");
        return Integer.parseInt(scan.next());
}

        public void printArea(){
            System.out.println("The area of the square is " + newArea);
        }

        public static void main(String[]args) {
        calculatorImplementation calculateArea = new calculatorImplementation();
        calculateArea.askValue();
        final double SQ_AREA = calculateArea.calculateArea(calculateArea.testLength, calculateArea.testLength);
        calculateArea.printArea();
}


        @Override
        public double calculateArea ( double length, double width){
            this.newArea = length * width;
            return this.newArea;
        }

        @Override
        public double calculateSum ( double value1, double value2){
            return 0;
        }

        @Override
        public double calculateVolume ( double length, double width, double height){
            return 0;
        }

    }







