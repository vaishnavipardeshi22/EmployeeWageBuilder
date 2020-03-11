public class EmployeeWageBuilder
{
    public static void main(String[] args)
    {
        System.out.println("******************** WELCOME TO EMPLOYEE WAGE COMPUTATION ********************");

        //CONSTANT
        int IS_PRESENT=1;

        //COMPUTING EMPLOYEE ATTENDANCE
        double empCheck=Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT)
            System.out.println("Employee is present.");
        else
            System.out.println("Employee is absent.");
    }
}
