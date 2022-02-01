import org.apache.log4j.Logger;
public class Calculator {
    static Logger log = Logger.getLogger(Overloading.class.getName());
    void addition(int num1, int num2) {
        log.info("addition :" +(num1 + num2));
    }
    void addition(float num3,float num4) {
        log.info("addition :" +(num3 + num4));
    }
   void addition(double num5,double num6) {
       log.info("addition :" +(num5 + num6));
    }

    void subtraction(int num1,int num2) {
        log.info("subtraction :" +(num1 - num2));
    }
    void subtraction(float num3,float num4) {
        log.info("subtraction :" +(num3 - num4));
    }
    void subtraction(double num5,double num6) {
        log.info("subtraction :" +(num5 - num6));
    }

    void multiplication(int num1,int num2) {
        log.info("multiplication :" +(num1 * num2));
    }
    void multiplication(float num3,float num4) {
        log.info("multiplication :" +(num3 * num4));
    }
    void multiplication(double num5,double num6) {
        log.info("multiplication :" +(num5 * num6));
    }

    void division(int num1,int num2) {
        log.info("division :" +(num1 / num2));
    }
    void division(float num3,float num4) {
        log.info("division :" +(num3 / num4));
    }
    void division(double num5,double num6) {
        log.info("division :" +(num5 / num6));
    }

    void modulo(int num1,int num2) {
        log.info("modulo :" +(num1 % num2));
    }
    void modulo(float num3,float num4) {
        log.info("modulo :" +(num3 % num4));
    }
    void modulo(double num5,double num6) {
        log.info("modulo :" +(num5 % num6));
    }
}

