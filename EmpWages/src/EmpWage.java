import java.util.Random;

class EmployeeWages{
    static Random random = new Random();
    static int check;
    public static void Attendance(){
        check = random.nextInt(3);
        if(check == 1){
            System.out.println("The Employee Is Present ");
        }else{
            System.out.println("The Employee Is Absent");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To The Employee Wages Salary Stimulator");
        EmployeeWages.Attendance();

    }
    }