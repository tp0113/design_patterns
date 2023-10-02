package singleton;

import java.util.ArrayList;

public class Anagram {
    private String question;
    private ArrayList<String> answers;

    /**
     * Constructs an Anagram object with the specified question and list of possible answers.
     * 
     * @param question The question for which an anagram needs to be solved.
     * @param answers A list of potential solutions to the anagram.
     */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /**
     * Retrieves the question associated with this anagram.
     * 
     * @return The anagram question.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Checks if the provided user answer is a correct solution to the anagram.
     * 
     * @param userAnswer The user's proposed solution to the anagram.
     * @return True if the answer is correct, false otherwise.
     */
    public boolean isCorrect(String userAnswer) {
        return answers.contains(userAnswer.trim().toLowerCase());
    }
}
