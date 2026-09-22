public class OperatorDemo {

    // Method without return
    void add( int a, int b){
    int sum = a + b;
    System.out.println("Addition: "+ sum);
    }
 // Method with return
  int multiply(int a, int b){
    return a * b;
  }
   public static void main(String[] args) {

    //Operator
    int x=10,y=3;
    System.out.println("x + y="+(x+y));
    System.out.println("x - y="+(x-y));
    System.out.println("x * y="+(x*y));
    System.out.println("x / y="+(x/y));
    System.out.println("x % y="+(x%y));
      
    //Arithmetic Promotion
    byte a= 10, b= 20;
    int result= a + b;     //Promoted to int
    System.out.println("Arithmatic Promotion Result: "+ result);

    //Method calling
    OperatorDemo obj = new OperatorDemo();
    obj.add(5,7);
    int product = obj.multiply(3,6);
    System.out.println("Multiplication:" + product);
    }
  }