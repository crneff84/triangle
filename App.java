import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is the length of the first side?");
    String stringSideOne = myConsole.readLine();

    System.out.println("What is the length of the second side?");
    String stringSideTwo = myConsole.readLine();

    System.out.println("What is the length of the third side?");
    String stringSideThree = myConsole.readLine();

    Triangle name = new Triangle(Integer.parseInt(stringSideOne), Integer.parseInt(stringSideTwo), Integer.parseInt(stringSideThree));

    name.data();
  }
}
