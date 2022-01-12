/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author opc
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee e1 = new Employee(230, "Fernando", 3333);
        Employee e2 = new Employee(280, "Brigitte", 9933);

       
        Department dep = new Department("Education");
        dep.addEmp(e1);
        dep.addEmp(e2);
        dep.addEmp(new Employee(5665, "Maria", 5039));

        Employee[] emps = dep.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Emp " + emp);

        }
         System.out.println("Total " + dep.getTotalSalary());
         System.out.println("Total average " + dep.getAverageSalary());
         
         System.out.println("Emp " + dep.getEmployeeByID(566));

    }

}
