public class Overloading {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       calculator.addition(10,20);
       calculator.addition(30.52f,40.73f);
       calculator.addition(80.99d,60.99d);

       calculator.subtraction(10,20);
       calculator.subtraction(30.52f,40.73f);
       calculator.subtraction(80.99d,60.99d);

       calculator.multiplication(10,20);
       calculator.multiplication(30.52f,40.73f);
       calculator.multiplication(80.99d,60.99d);

       calculator.division(10,20);
       calculator.division(30.52f,40.73f);
       calculator.division(80.99d,60.99d);

       calculator.modulo(10,20);
       calculator.modulo(30.52f,40.73f);
       calculator.modulo(80.99d,60.99d);
    }
}
