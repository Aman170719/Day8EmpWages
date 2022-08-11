import java.util.Random;

class EmployeeWages{
    static Random random = new Random();
    static int check;
    static int EmployeeWage = 20, workingHr, workingDays=20, EmployeeSalary =0;
    public static void Attendance(){
        check = random.nextInt(3);
        if(check == 1){
            System.out.println("The Employee Is Present ");
        }else{
            System.out.println("The Employee Is Absent");
        }
    }
    public static void dailyWages() {
        check = random.nextInt(3);
        if(check == 1){
            workingHr = 8;
            }
        else{
            workingHr = 0;
        }
        EmployeeSalary =(workingHr*EmployeeWage);
        System.out.println("Employee is Present and His/Her Daily Salary is " + EmployeeSalary);
    }
    public static void monthlyWages(){
        check = random.nextInt(3);
        if(check == 1){
            workingHr = 8;
        }
        else{
            workingHr = 0;
        }
        EmployeeSalary =((workingHr*EmployeeWage)*workingDays);
        System.out.println("Employee is Present and His/Her Monthly Salary is " + EmployeeSalary);
    }
    public static void main(String[] args) {
        EmployeeWages.Attendance();
        EmployeeWages.dailyWages();
        EmployeeWages.monthlyWages();
    }
    }