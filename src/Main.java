/**
 * test code
 * by Jordan Moses
 */
import java.util.Date;

public class Main {

    public static void main(String args[]) {

      Widget w1 = new Widget("Widget 1");
      System.out.println(w1.toString());
      Widget w2 = new Widget("Widget 2");
      System.out.println(w2.toString());



    }

  class Widget extends Product {
      public Widget(String name) {
        super(name);
      }

      @Override
    public Date getManufactureDate() {
        return null;
      }

      @Override
    public void setManufacturer(String manufacturer){

      }
  }
  }

