class Triangle {
  public int sideOne;
  public int sideTwo;
  public int sideThree;

  public Triangle(int sideOne1, int sideTwo2, int sideThree3){
    sideOne = sideOne1;
    sideTwo = sideTwo2;
    sideThree = sideThree3;

  }

  public void data() {
    if (sideOne<=0||sideTwo<=0||sideThree<=0){
      System.out.println("Don't use zeros, you jackass.");
    } else if (sideOne > sideTwo + sideThree || sideTwo > sideThree + sideOne || sideThree > sideTwo + sideOne) {
      System.out.println("These numbers cannot make a triangle, genius.");
    } else if (sideOne == sideTwo && sideTwo == sideThree && sideOne == sideThree ) {
      System.out.println("You have an equilateral triangle.");
    } else if (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree ) {
      System.out.println("You have an isosceles triangle.");
    } else if (sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree ) {
      System.out.println("You have an scalene triangle.");
    }
  }
}
