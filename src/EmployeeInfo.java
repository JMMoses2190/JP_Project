import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  //The class will have 2 fields
  private StringBuilder name;
  private String code;
  public String deptId;
  private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
  Scanner scanner = new Scanner(System.in);

  public EmployeeInfo() {
    setName();
    setDeptId();
  }

  //The class will have the following methods defined:
  public StringBuilder getName() {

    return name;
  }

  public String getCode() {

    return code;
  }

  private void setName() {

    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {

    if (checkName(name)) {   //valid=includes space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "guest";
    }

  }

  private String inputName() {
    String nameString;
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter your first and last name: ");
    nameString = scan.nextLine();

    return nameString;

  }

  private boolean checkName(StringBuilder name) {

    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }

  }


  public void setDeptId(){
    String temp;
    System.out.println("Please enter the department ID: ");
    temp = scanner.nextLine();
    if(validID(temp)){
      this.deptId = temp;
    } else{
      this.deptId = "None01";
    }
  }

  private String getDeptID(){
    if (validID(this.deptId)){
      return deptId;
    } else {
      return "None01";
    }
  }


  private boolean validID(String id){
    Matcher m = p.matcher(id);
    if(m.matches()){
      return true;
    } else {
      return false;
    }
  }

  public String toString(){
    return "Employee Code : " + code
        + "\nDepartment Number : " + deptId;
  }

  public String reverseString(String id){
    String temp = "";
    for (int i = id.length(); i > 0; i-- ) {
      temp = temp + id.charAt(i - 1);
    }
    id = temp;

    return id;
  }
}
