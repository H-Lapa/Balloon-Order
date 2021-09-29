import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    balloonOrder();
    System.exit(0);
  }
  
  public static double length () 
  {
    double length;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Length of the room (in cm)?");
    length = scanner.nextDouble();
    return length;
  }

  public static double width () 
  {
    double width;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Width of the room (in cm)?");
    width = scanner.nextDouble();
    return width;
  }

  public static double height () 
  {
    double height;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Height of the room (in cm)?");
    height = scanner.nextDouble();
    return height;
  }

  public static double balloonVolume () 
  {
    double balloonVolume;
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the balloon volume (in m3)?");
    balloonVolume = scanner.nextDouble();
    return balloonVolume;
  }

  public static double roomVolume () 
  {
    double length = length();
    double width = width();
    double height = height();
    double roomVolume = (length * width * height) / 1000000;
    return roomVolume;
  }

  public static void balloonOrder () 
  {
    double roomVolume = roomVolume();
    double balloonVolume = balloonVolume();
    double balloon = roomVolume / balloonVolume;
    int balloons = (int) balloon;
    System.out.println("Your room volume is " + roomVolume + " m3.");
    System.out.println("You need " + balloons + " balloons.");
  }

}
