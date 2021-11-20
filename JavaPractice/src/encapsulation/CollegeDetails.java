package encapsulation;

import java.awt.*;
import java.util.ArrayList;

public class CollegeDetails {
    private String collegeName;

    private ArrayList<String> departmentNames = new ArrayList<>();

    public CollegeDetails(String collegeName) {
        this.collegeName = collegeName;
    }

    public void DisplayDepartmentName() {
        System.out.println("The name of the college is: " + collegeName);
        System.out.println("Departments are: ");
        for (int i = 0; i < departmentNames.size(); i++) {
            System.out.println(departmentNames.get(i));
        }

    }

    public void addDepartment(String departmentName) {
        departmentNames.add(departmentName);
    }


}
