package encapsulation;

public class CollegeDetailsMain {
    private static void addDepartmentsToCollege(CollegeDetails collegeDetails) {
        collegeDetails.addDepartment("IT");
        collegeDetails.addDepartment("CS");
        collegeDetails.addDepartment("MECH");
        collegeDetails.addDepartment("ECE");
        collegeDetails.addDepartment("EEE");
        collegeDetails.addDepartment("AERO");
        collegeDetails.addDepartment("AUTO");
        collegeDetails.addDepartment("EI");

    }

    public static void main(String[] args) {
        CollegeDetails collegeDetails = new CollegeDetails("S.A.Jain College");
        addDepartmentsToCollege(collegeDetails);
        collegeDetails.DisplayDepartmentName();
        CollegeDetails collegeDetails1 = new CollegeDetails("Hindu College");
        addDepartmentsToCollege(collegeDetails1);
        collegeDetails1.DisplayDepartmentName();
        CollegeDetails collegeDetails2 = new CollegeDetails("D A V College");
        addDepartmentsToCollege(collegeDetails2);
        collegeDetails2.DisplayDepartmentName();
        CollegeDetails collegeDetails3 = new CollegeDetails("IDP College");
        addDepartmentsToCollege(collegeDetails3);
        collegeDetails3.DisplayDepartmentName();
        CollegeDetails collegeDetails4 = new CollegeDetails("Govt Girls college");
        addDepartmentsToCollege(collegeDetails4);
        collegeDetails4.DisplayDepartmentName();
    }
}
