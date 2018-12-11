/**
 * Step one By Jordan Moses
 */

import java.util.Date;

public interface Item {

  //Step 1
  final String manufacturer = "OracleProduction";

  public void setProductionNumber(int productionNumber);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();

  public void setManufacturer(String m);
}
