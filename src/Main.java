import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到考试系统 Welcome !");
        System.out.println("请输入你的姓名");
        String userName = input.nextLine();
        System.out.println("请输入你的密码");
        String password = input.nextLine();
        Student student = new Student(userName, password);

        ExamMachine machine = new ExamMachine();
        machine.login(student.getUserName(), student.getPassword());

        ArrayList<Question> paper = machine.generatePaper();
        String[] answers = student.exam(paper);

        Teacher teacher = new Teacher();
        int score = teacher.checkPaper(paper, answers);
        System.out.println("考试结束  最后获得 分数" + score);
    }
}
