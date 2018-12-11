import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  //Add the following fields to Product
  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;

  static int currentProductionNumber = 1;

  public Product(String name) {

    this.manufacturer = Item.manufacturer;
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
  }

  public void setProductionNumber(int productionNumber) {
    serialNumber = productionNumber;

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufacuredOn() {
    return manufacuredOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  //test output
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacuredOn + "\n"
        + "Name : " + name;
  }

  @Override
  public int compareTo(Product product) {
    return name.compareTo(product.getName());
  }
}
