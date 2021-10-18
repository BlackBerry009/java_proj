import java.util.ArrayList;

public class Teacher  {
    public int checkPaper(ArrayList<Question> questions, String[] answers) {
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            boolean an = question.getAnswer().equalsIgnoreCase(answers[i]);
            int single = 100/ questions.size();
            if(an) {
                score += single;
            }
        }
        return score;
    }

}
