import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String userName = input.nextLine();
        System.out.println("请输入你的密码");
        String password = input.nextLine();
        Student student = new Student(userName, password);

        ExamMachine machine = new ExamMachine();
        machine.login(student.getUserName(), student.getPassword());
//        ArrayList<Question> paper = machine.generatePaper();
//
//        Student student = new Student("Egg");
//        student.exam(paper);


    }
}
