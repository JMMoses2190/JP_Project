/**
 * Step two of JP_Project
 * By Jordan Moses
 */

public enum ItemType {

  //Step 2
  Audio("AU"),
  Visual("VI"),
  Audio_Mobile("AM"),
  Visual_Mobile("VM");

  private final String code;

  ItemType(String code){
    this.code = code;
  }

  private String getCode(){
    return code;
  }
}
