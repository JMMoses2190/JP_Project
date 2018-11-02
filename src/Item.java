/**
 * Step one
 * By Jordan Moses
 */

import java.util.Date;

public interface Item {

  //Step 1
  final String msnufacturer = "OracleProduction";

  int setProductionNumber(int productionNumber);
  void setName(String name);
  String getName();
  Date getManufactureDate();
  int getSerialNumber();
  void setManufacturer(String m);
}
