package assignment_4;
import java.util.Scanner;
/**
 *
 * @author BOODY
 */
public class Assignment_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter your type , please : ");
       String type = s.nextLine();
       Member_factory fact_mem = new Member_factory();
       staff stf = fact_mem.get_member(type);
       stf.Get_salary();
       stf.get_years_ofwork();
      
    }
    
}
