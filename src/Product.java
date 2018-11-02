import java.util.Date;

public abstract class Product implements Item {

  //Add the following fields to Product
  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;

  static int currentProductionNumber;

  public Product(String name){

    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
  }

  public int setProductionNumber(int productionNumber){
    serialNumber = productionNumber;
    return productionNumber;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public Date getManufacuredOn(){
    return manufacuredOn;
  }

  public int getSerialNumber(){
    return serialNumber;
  }

  //test output
  public String toString(){
    return "Manufacturer : " + manufacturer + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date : " + manufacuredOn + "\n" +
        "Name : " + name + "\n";
  }
}
