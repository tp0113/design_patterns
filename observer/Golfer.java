package observer;

import java.util.ArrayList;

class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Creates a new Golfer with a given name.
     *
     * @param name The golfer's name.
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    /**
     * Retrieves the golfer's name.
     *
     * @return The name of the golfer.
     */
    public String getName() {
        return name;
    }

    /**
     * Records the golfer's score for a game and notifies interested observers.
     *
     * @param strokes The number of strokes taken by the golfer in the game.
     * @param par     The expected number of strokes (par) for the game.
     */
    public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
    }

    /**
     * Registers an observer to receive updates when the golfer enters a score.
     *
     * @param observer The observer to be registered.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of registered observers.
     *
     * @param observer The observer to be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers with the golfer's score and par value.
     *
     * @param strokes The number of strokes taken by the golfer in the game.
     * @param par     The expected number of strokes (par) for the game.
     */
    @Override
    public void notifyObservers(int strokes, int par) {
        for (Observer observer : observers) {
            observer.update(strokes, par);
        }
    }
}