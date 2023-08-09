public class Employee{
    private String name;
    private String position;
    private double basicSalary;
    private int experience;
    private String educationLevel;

    public Employee( String name, String position, double basicSalary, int experience, String educationLevel){
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.educationLevel = educationLevel
    }

}
class FullTimeEmployees extends Employee{
    public FullTimeEmployees(String name, String position, double basicSalary, int experience, String educationLevel){
        super(name,  position, basicSalary, experience, educationLevel);
    }
    @Override
    public double calculateSalary(){
        double salary = basicSalary+(basicSalary*0.05*experience);

        double bonus = salary*0.03;

        if(educationLevel.equalsIgnoreCase("Bachelor Degree")){
            salary+= 500;
        }else if (educationLevel.equalsIgnoreCase("Diploma")){
            salary+= 250;
        }else
        return salary+bonus;
    }
}
class PartTimeEmployees extends Employee{
    public FullTimeEmployees(String name, String position, double basicSalary, int experience, String educationLevel){
        super(name,  position, basicSalary, experience, educationLevel);
    }
    @Override
    public double calculateSalary(){
        double salary = basicSalary+(basicSalary*0.05*experience);

        double bonus = salary*0.015;

        if(educationLevel.equalsIgnoreCase("Bachelor Degree")){
            salary+= 500;
        }else if (educationLevel.equalsIgnoreCase("Diploma")){
            salary+= 250;
        }else
        return salary+bonus;
    }
}
