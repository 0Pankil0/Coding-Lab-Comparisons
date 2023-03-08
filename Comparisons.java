import java.util.Scanner;

class Comparisons {
  public static void main(String[] arg) {
    // Making a table of a given number...
    // Greetings.
      System.out.println("Hello, how are you ?");
      Scanner input1 = new Scanner(System.in);
      String n1 = input1.nextLine();
      System.out.println(n1 + ", That's good.");
    // Frist asking for a number.
      System.out.println("Today we are going to learn out tables...");
      System.out.print("Tell a number for which do you want to make a table : ");
      Scanner input2 = new Scanner(System.in);
      double p = input2.nextDouble();
      System.out.println("We are going to make a table of " + p + " number.");
    // Making loop to make a table.
      //By while loop...
        System.out.println("By while loop...");
        int i1 = 1;
        while(i1<=5){
          double table = p * i1; 
          System.out.println(p + " * " + i1 + " = " + table);
          i1++;
        }
      //By for loop...
        System.out.println("By for loop...");
        for(int i2=6; i2<=10; i2++){
          double table = p * i2; 
          System.out.println(p + " * " + i2 + " = " + table);
        }
      //By do-while loop...
        System.out.println("By do-while loop...");
        int i3 = 11;
        do{          
          double table = p * i3; 
          System.out.println(p + " * " + i3 + " = " + table);
          i3++;
        }while(i3<=20);
    // Closing all inputs.
      input1.close();
      input2.close();
  }
}
