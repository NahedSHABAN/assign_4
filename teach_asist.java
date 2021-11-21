/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

/**
 *
 * @author BOODY
 */
public class teach_asist implements staff
{
    double years_of_work;
    double salary;
    
    public teach_asist (double years_of_work,double salary)
    {
        this.salary=salary;
        this.years_of_work=years_of_work;
    }
    @Override
     public double Get_salary()
     {
         return salary;
     }
    @Override
    public double get_years_ofwork()
    {
        return years_of_work;
    }
}
