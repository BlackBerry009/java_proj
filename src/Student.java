import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String userName;
    private String password;

    public Student(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String[] exam(ArrayList<Question> paper) {
        String[] answers = new String[paper.size()];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < paper.size(); i++) {
            System.out.println(i + 1 + ". " + paper.get(i).getTitle());
            System.out.println("请输入答案");
            String an = input.nextLine();
            answers[i] = an;
        }
        return answers;
    }
}
