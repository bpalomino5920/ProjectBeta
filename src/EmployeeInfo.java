/**
 * Author: Brandon Palomino
 * Date: 11/29/2018
 * Class: OOP JAVA
 * Filename: EmployeeInfo.java
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

    private StringBuilder name;
    private String code;
    private Scanner in = new Scanner(System.in, "UTF-8");
    private String deptId;
    private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[1-9]{2}$");


    EmployeeInfo() {
        setName();
        setDeptId();
    }

    StringBuilder getName() {
        return this.name;
    }

    private String getCode() {
        return this.code;
    }

    //The setName() method will be called from the constructor which will use inputName() to get
    //a name (firstname and surname) as a single input from the user before checkName() is used
    //to make sure that the name supplied has a space in it.
    private void setName() {
        StringBuilder testName = new StringBuilder(inputName());
        if (checkName(testName)) {
            this.name = testName;
            //System.out.println("Good name, creating employee code");
            createEmployeeCode(testName);
        } else {
            this.name = testName;
            //System.out.println("Invalid name, setting code to guest");
            this.code = "guest";
        }
    }

    //createEmployeeCode() is used to take the first initial from the first
    //name and add it to the full surname to create the code
    private void createEmployeeCode(StringBuilder name) {
        this.code = name.charAt(0)+ name.substring(name.indexOf(" ")+1);
    }

    private String inputName() {
        System.out.println("Please enter your first and last name:");
        return in.nextLine();
    }

    //check if the name has a space in it
    private boolean checkName(StringBuilder name) {
        if (name.indexOf(" ") > 0) {
            return (name.indexOf(" ", name.indexOf(" ")+1) == -1);
        } else
            return false;
    }

    private String getDeptId(){
        System.out.println("Please enter your department ID:");
        return in.nextLine();
    }

    private void setDeptId(){
        String id = getDeptId();
        if (validId(id)){
            this.deptId = id;
            //System.out.println("Department ID set.");
        }
        else{
            //System.out.println("Inadequate Department ID, setting to default.");
            this.deptId = "None01";
        }


    }
    private String getId(){
        return this.deptId;
    }

    //uses a matcher to test if the id matches the pattern
    private boolean validId(String id){
        Matcher matcher = p.matcher(id);
        return matcher.matches();
    }

    private String reverseString(String id){
        if(id.isEmpty()){
            return id;
        } else {
            return reverseString(id.substring(1))+id.charAt(0);
        }
    }
    @Override
    public String toString(){
        return "Employee Code: " + getCode() + "\n" +
                "Department Number: " + getId();
    }
}
