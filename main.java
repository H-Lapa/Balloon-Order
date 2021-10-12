import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    //Tells user what to input
    System.out.println("Please enter a positive numeric value for all questions");
    //code to be executed
    balloonOrder();
    System.exit(0);
  }
  
  //Takes question as argument, and takes in double as an answer
  public static double getDouble (String str) 
  {
    double response;
    Scanner scanner = new Scanner(System.in);
    System.out.println(str);
    response = scanner.nextDouble();
    return response;
  }

  //fetches measurements for room volume and calculates it
  public static double roomVolume () 
  {
    double length = getDouble("Length of the room (in cm)?");
    double width = getDouble("Width of the room (in cm)?");
    double height = getDouble("Height of the room (in cm)?");
    double roomVolume = (length * width * height) / 1000000;
    return roomVolume;
  }

  public static void balloonOrder () 
  {
    //returns roomvolume from function
    final double roomVolume = roomVolume();

    // balloon volume needed for final sentence
    double balloonVolume = getDouble("What is the balloon volume (in m3)?");

    //calculation to work out how many balloons fit
    double balloon = roomVolume / balloonVolume;

    //converts balloon from a double to int to round down incase of decimals
    final int balloons = (int) balloon;

    //message for the user
    System.out.println("Your room volume is " + roomVolume + " m3.");
    System.out.println("You need " + balloons + " balloons.");
  }

}
