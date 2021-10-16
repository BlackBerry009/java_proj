import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ExamMachine {
    public void login(String userName, String password) {
        Boolean isExist = this.userBox.containsKey(userName);
        if(!isExist) {
            System.out.println("账号或者密码错误");
            return;
        }
        String uPassword = this.userBox.get(userName);
        if(uPassword.equals(password)) {
            System.out.println("欢迎来到 xxx 考试");
        } else {
            System.out.println("账号或者密码错误");
            return;
        }
    }
    private HashMap<String,String> userBox = new HashMap<String, String>();

    {
        userBox.put("admin", "123456");
    }
    private HashSet<Question> questionBank = new HashSet<Question>();
    {
        questionBank.add(new Question("1+1 = ? \n\t A. one \n\t B. two \n\t C. three \n\t D.four", "A"));
        questionBank.add(new Question("1 * 1 = ? \n\t A. one \n\t B. two \n\t C. three \n\t D.four", "B"));
        questionBank.add(new Question("a+c = ? \n\t A. one \n\t B. two \n\t C. three \n\t D.four", "C"));
        questionBank.add(new Question("tset =   ? \n\t A. one \n\t B. two \n\t C. three \n\t D.four", "D"));
    }

    public ArrayList<Question> generatePaper() {
//        试卷是不重复 用 set 存储
        HashSet<Question> paper = new HashSet<Question>();
        ArrayList<Question> questionBank = new ArrayList<Question>(this.questionBank);
        while(paper.size() != 3) {
            int index = (int) (Math.random() * this.questionBank.size());
            paper.add(questionBank.get(index));
        }

        return new ArrayList<Question>(paper);
    }
}
