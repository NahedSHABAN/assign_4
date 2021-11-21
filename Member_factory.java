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
public class Member_factory 
{
    double years_of_work;
         double salary;
    public staff get_member(String mem)
    {
        
        String str = mem.toLowerCase();
        switch(str)
        {
            case"doc":
                return new doc( years_of_work, salary);
            case"teach_asist":
                return new teach_asist(years_of_work, salary);
            default:
                return null;
                     
        }
    }
}
