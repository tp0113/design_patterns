package singleton;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * The Game class manages the state of the anagram game.
 */
public class Game {
    private static Game instance;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game() {
        rand = new Random();
        level = Difficulty.EASY;
        anagrams = new HashMap<>();
        anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
        anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
        anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
        currentAnagram = getRandomAnagram(level);
        score = 0;
    }

    /**
     * Gets the instance of the Game class. If the instance does not exist, creates one.
     * 
     * @return The Game instance.
     */
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    /**
     * Gets the current anagram question for the game.
     * 
     * @return The anagram question.
     */
    public String getQuestion() {
        return currentAnagram.getQuestion();
    }

    /**
     * Checks if the user's answer is correct for the current anagram question.
     * Updates the score and difficulty level if the answer is correct.
     * 
     * @param userAnswer The user's answer.
     * @return True if the answer is correct, false otherwise.
     */
    public boolean isCorrect(String userAnswer) {
        boolean correct = currentAnagram.isCorrect(userAnswer);
        if (correct) {
            score++;
            updateDifficultyLevel();
        }
        return correct;
    }

    /**
     * Gets the current score of the player.
     * 
     * @return The player's score.
     */
    public int getScore() {
        return score;
    }

    private void updateDifficultyLevel() {
        if (score <= 6) {
            level = Difficulty.EASY;
        } else if (score <= 10) {
            level = Difficulty.MEDIUM;
        } else {
            level = Difficulty.HARD;
        }
        currentAnagram = getRandomAnagram(level);
    }

    private Anagram getRandomAnagram(Difficulty difficulty) {
        ArrayList<Anagram> anagramList = anagrams.get(difficulty);
        int randomIndex = rand.nextInt(anagramList.size());
        return anagramList.get(randomIndex);
    }
}
