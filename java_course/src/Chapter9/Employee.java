package Chapter9;

public class Employee extends Person
{

    private String employeeId;
    private String title;

    public Employee(){
        super("Spencer");
        System.out.println("In Employee default contrsuctor");
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(String employeeId)
    {
        employeeId = employeeId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}
