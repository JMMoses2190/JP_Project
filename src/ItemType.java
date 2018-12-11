/**
 * Step two of JP_Project By Jordan Moses.
 */

public enum ItemType {

  //Step 2
  Audio("AU"),
  Visual("VI"),
  Audio_Mobile("AM"),
  Visual_Mobile("VM");

  public final String code;

  ItemType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
