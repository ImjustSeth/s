//Liam McNally
//January 9, 2020
//Private and public stuff
package testemployee;

public class TestEmployee {
    
    static int count = 5;

    public static void main(String[] args) {
        
        employee e1 = new employee("Bob", 1237654, 52, 15);
        
        System.out.println("------------- Set 1 ----------------");
        System.out.println("Name: " + e1.getName());
        System.out.println("Id: " + e1.getId());
        System.out.println("Weeks worked: " + e1.getNumWeek());
        System.out.println("Hourly pay: " + e1.getHrate());
        System.out.println("Salary: " + e1.salary());
        
        e1.setName("Ernie");
        e1.setId(7135);
        e1.setNumWeek(50);
        e1.setHrate(30.5);
        
        System.out.println("------------- Set 2 ----------------");
        System.out.println("Name: " + e1.getName());
        System.out.println("Id: " + e1.getId());
        System.out.println("Weeks worked: " + e1.getNumWeek());
        System.out.println("Hourly pay: " + e1.getHrate());
        System.out.println("Salary: " + e1.salary());
        
        System.out.println("------------- Set 3 ----------------");
        System.out.println(e1.toString());
        
        System.out.println(count);
        
        
    }
    
}
