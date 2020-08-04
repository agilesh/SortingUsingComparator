import java.util.*;
public class Employee

{

    public int id;
    public String name;
    public int age;
    public float salary;
    
    Employee(int id , String name ,int age , float salary)
    {
        this.id=id;
        this.name=name;
        this.age= age;
        this.salary=salary;
    }
    
    
    public int getid()
    {
        return id;
    }
    public int getage()
    {
        return age;
    }
    public float getsalary()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
    
    public String toString()
    {
        return id +":"+name+":"+salary+":"+age;
    }
    


static class myComparator implements Comparator<Employee>
{
    public int compare(Employee  e1 ,Employee  e2)
    {
        int id1 = e1.getid();
        int id2 = e2.getid();
        if(id1 == id2 )
        return 0;
        else if(id1>id2 )
        return 1;
        else 
        return -1;
    }
}

    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(9,"ajahw",21,25000));
        employee.add(new Employee(3,"bhakq",29,3828));
        employee.add(new Employee(1,"ajamq",81,250500));
        
        
        
        
        Collections.sort(employee,new Employee.myComparator());
        System.out.print(employee);
    }
}
