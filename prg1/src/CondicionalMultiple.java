public class CondicionalMultiple {
   
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;

        if (num2 > num1) {
            System.out.println( num2 + " es mayor que " + num1);
        }else{
            if (num2 == num1) {
              System.out.println(num1 + " es igual que " + num2);  
            }else{
                System.out.println( num1 + " es mayor que " + num2);
            }
        }

        if (num2 > num1) {
            System.out.println( num2 + " es mayor que " + num1);
        }else if (num2 == num1){
            System.out.println(num1 + " es igual que " + num2);  
        }else{
            System.out.println( num1 + " es mayor que " + num2);
        }

    }
}
