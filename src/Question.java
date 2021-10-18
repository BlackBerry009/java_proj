import java.util.Objects;

public class Question {
    private String title;
    private String answer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(title, question.title);
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }


    public String getTitle() {
        return title;
    }

    public String getAnswer() {
        return answer;
    }
}
