package Chapter9;

public class InheritanceTester
{
  public static void main(String[] args)
  {
      //Employee employee = new Employee();
      Rectangle rectangle = new Rectangle();
      rectangle.print();

      Square square = new Square();
      square.print("square");
  }

  public static void testSquareOverride(){
      Rectangle rectangle = new Rectangle();
      rectangle.setLength(4);
      rectangle.setWidth(8);
      System.out.println(rectangle.calculatePermiter());

      Square square = new Square();
      square.setLength(4);
      square.setLength(8);
      System.out.println(square.calculatePermiter());
  }

}
