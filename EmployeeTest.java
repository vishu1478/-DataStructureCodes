
public class EmployeeTest {
	public static void main(String args[]){

        Employee original = new Employee("RAM");

        Employee a = new Employee("RAM");
        Employee b = new Employee("MAR");
        Employee c = new Employee("AMR");
        Employee d = new Employee("LAXMAN");

        runTestCase(1,original,a,true);
        runTestCase(2,original,b,true);
        runTestCase(3,original,c,false);
        runTestCase(4,original,d,false);
    }

    public static void runTestCase(int testcaseNum, Employee original, Employee duplicate, boolean expected){
        boolean result = expected == original.equals(duplicate);
        if(result){
            System.out.println("Testcase "+testcaseNum+" : SUCCESS");
        }else{
            System.out.println("Testcase "+testcaseNum+" : FAILURE"+" <<---");
        }
    }

}
