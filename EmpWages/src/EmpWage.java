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
                System.out.println("Employee is Present and His/Her Monthly Salary is " + EmployeeSalary);
                }
        else if(check ==2){
                workingHr = 4;
                System.out.println("Employee is Present and His/Her Monthly Salary is " + EmployeeSalary);
                }
        else {
                workingHr=0;
                }
                System.out.println("Employee is Absent");
        EmployeeSalary =((workingHr*EmployeeWage)*workingDays);

        }
        public static void switchCase(){
                switch(check){
                        case 1: workingHr =8;
                                EmployeeSalary =((workingHr*EmployeeWage)*workingDays);
                        System.out.println("S/C Employee is Present and His/Her Monthly Salary is " + EmployeeSalary);
                        break;
                        case 2: workingHr = 4;
                                EmployeeSalary =((workingHr*EmployeeWage)*workingDays);
                                System.out.println("S/C Employee is Present and His/Her Monthly Salary is " + EmployeeSalary);
                        break;
                        default: workingHr=0;
                                System.out.println("S/C Employee is Absent");
                        break;
                        }
                }
        public static void Conditional(){
                workingHr=8; workingDays=20;
                for(int i = 1; i<= workingDays; i++) {
                        int wages = ((EmployeeWage * workingHr) * i);
                        System.out.println("Day :" + i + " Salary is :" + wages);
                }
                System.out.println("");
                workingHr=4;
                int workingHrs =100;
                for(int j = 1; j <= workingHrs; j++){
                        int wages2 = ((EmployeeWage*workingHr)*j);
                        System.out.println( + j +" Hour" + "Salary is :" + wages2);
                }
        }
        public static void main(String[] args) {
        System.out.println("Welcome To The Employee Wages Salary Stimulator");
        EmployeeWages.Attendance();
        EmployeeWages.dailyWages();
        EmployeeWages.monthlyWages();
        EmployeeWages.switchCase();
        EmployeeWages.Conditional();
        }
        }