import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ExamMachine {
    public void login(String userName, String password) throws Exception {
        String uPassword = this.userBox.get(userName);
        if(uPassword != null && uPassword.equals(password)) {
            System.out.println("欢迎来到 xxx 考试");
        } else {
            throw new Exception("账号或者密码错误");
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
        while(paper.size() != 4) {
            int index = (int) (Math.random() * this.questionBank.size());
            paper.add(questionBank.get(index));
        }
        return new ArrayList<Question>(paper);
    }
}
