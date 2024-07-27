import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestBuffer {

	List <Employee> list;
	public static void main(String[] args) 
	{
		List<Employee> employeeList =new ArrayList<Employee>();
		
		createEmployeeList(employeeList);
		//two number swap without using third variable
		int a=10, b=20 ;
		System.out.println("Before swapping a & b");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("After swapping a & b");
		methodSwap(a,b);
		
		Optional<Employee> highSalEmp= 
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highSalEmp);

		Map<String , Optional<Employee>> highsalbyDept=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
	
		highsalbyDept.forEach((key,value) -> System.out.println(key+" "+value));
	
		Map<String, Long>  empCountbyGen=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
				Collectors.counting()));
		empCountbyGen.forEach((key,value) -> System.out.println(key+" "+value));

		Map<String, Long>  empCountbyDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.counting()));
		empCountbyDept.forEach((key,value) -> System.out.println(key+" "+value));
		System.out.println(empCountbyDept);
	}
	
	
	
	
	private static void createEmployeeList(List<Employee> employeeList)
	{
		employeeList.add(new Employee(001,"Parag","Male",31,"ADM",2020,30000.0));
		employeeList.add(new Employee(002,"Sidd","Male",33,"APS",2019,10000.0));
		employeeList.add(new Employee(003,"Ankita","Female",33,"BA",2022,40000.0));
		employeeList.add(new Employee(004,"Rafid","Male",35,"ADM",2017,100000.0));
		employeeList.add(new Employee(005,"Mukesh","Male",45,"HPM",2012,200000.0));
		employeeList.add(new Employee(006,"Amith","Male",36,"TCOE",2020,25000.0));
		employeeList.add(new Employee(007,"Aayushi","Female",32,"PM",2020,40000.0));
		employeeList.add(new Employee(017,"Stephen","Male",40,"HOD",2010,300000.0));
	}

	private static void methodSwap(int a, int b) 
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}

}
