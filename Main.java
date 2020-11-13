import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    System.out.println("What type of operation do you wish to perform?");
    System.out.println("1. add");
    System.out.println("2. subtract");
    System.out.println("3. multiply");
    System.out.println("4. divide");
    System.out.println("0. exit");

    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt(); 
    System.out.println("You selected: " + x);

    if(x == 1){ 
      System.out.println("What is the first value:");
        Double y = scan.nextDouble();
      System.out.println("What is the second value:");
        Double z = scan.nextDouble();

      System.out.println(y + "+" + z + "=" + (y+z)); 
    }
    else if (x == 2){ 
      System.out.println("What is the first value:");
       Double y = scan.nextDouble();
      System.out.println("What is the second value:");
       Double z = scan.nextDouble();

       System.out.println(y + "-" + z + "=" + (y-z)); //this will subtract the two values
    }
    else if (x == 3){ 
      System.out.println("What is the first value:");
       Double y = scan.nextDouble();
      System.out.println("What is the second value:");
       Double z = scan.nextDouble();

     System.out.println(y + "*" + z + "=" + (y*z)); // this will multiply the two values 
    }
    else if (x == 4){
      System.out.println("What is the first value:");
       Double y = scan.nextDouble();
      System.out.println("What is the second value:");
       Double z = scan.nextDouble();

       System.out.println(y + "/" + z + "=" + (y/z)); // this will divide the two values
    }
    else if (x == 0){
      System.out.println("Goodbye");
      System.exit(0);
    }
    else { 
      System.out.println("Do you want to continue?");
      System.out.println("yes");
      System.out.println("no");

    String n = scan.nextLine();
    
      if(n == "yes"){
        System.out.println("What type of operation do you wish to perform?");
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        System.out.println("0. exit");

        int a = scan.nextInt();
         
         if(x == 1){ 
          System.out.println("What is the first value:");
            Double y = scan.nextDouble();
          System.out.println("What is the second value:");
            Double z = scan.nextDouble();

          System.out.println(y + "+" + z + "=" + (y+z)); 
    }
    else if (x == 2){ 
        System.out.println("What is the first value:");
         Double y = scan.nextDouble();
        System.out.println("What is the second value:");
         Double z = scan.nextDouble();

       System.out.println(y + "-" + z + "=" + (y-z)); //this will subtract the two values
    }
    else if (x == 3){ 
      System.out.println("What is the first value:");
       Double y = scan.nextDouble();
      System.out.println("What is the second value:");
       Double z = scan.nextDouble();

     System.out.println(y + "*" + z + "=" + (y*z)); // this will multiply the two values 
    }
    else if (x == 4){
      System.out.println("What is the first value:");
       Double y = scan.nextDouble();
      System.out.println("What is the second value:");
       Double z = scan.nextDouble();

       System.out.println(y + "/" + z + "=" + (y/z)); // this will divide the two values
    }
    else if (x == 0){
      System.out.println("Goodbye");
      System.exit(0);
    }
      }
      else{
        System.out.println("That was an invalid command");
        System.out.println("Try again later. Goodbye!");
        System.exit(0);
      }
    }

        


  }
}