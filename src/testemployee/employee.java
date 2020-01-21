
package testemployee;

public class employee {
    private String name;
    private int id;
    private double numWeek, hRate;
    
    public employee(String name, int id, double numWeek, double hRate)
    {
        this.name = name;
        this.id = id;
        this.numWeek = numWeek;
        this.hRate = hRate;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Getting and returning values ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getNumWeek()
    {
        return numWeek;
    }
    
    public double getHrate()
    {
        return hRate;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Setting Variables^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    
    public void setName(String name) //Known as mutator or write method
    {
        this.name = name;
    }
    
    public void setId(int id) //Known as mutator or write method
    {
        this.id = id;
    }
    
    public void setNumWeek(double numWeek) //Known as mutator or write method
    {
        this.numWeek = numWeek;
    }
    
    public void setHrate(double hRate) //Known as mutator or write method
    {
        this.hRate = hRate;
    }
    
    public double salary()
    {
        return numWeek * hRate;
    }
    
    public String toString()
    {
        return "name = " + name + " id = " + id + " numWeek = " + numWeek + " hRate = " + hRate + " Salary = " + salary();
    }
    
}
