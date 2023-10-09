package iterator;

import java.util.Stack;

/**
 * StackIterator is an iterator implementation for a Stack of strings.
 */
public class StackIterator implements java.util.Iterator<String> {
    private Stack<String> items;
    private int position = 0;

    /**
     * Constructs a StackIterator with the specified Stack of strings.
     *
     * @param items the Stack of strings to be iterated
     */
    public StackIterator(Stack<String> items) {
        this.items = items;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws java.util.NoSuchElementException if the iteration has no more elements
     */
    public String next() {
        if (hasNext()) {
            String nextItem = items.get(position);
            position++;
            return nextItem;
        } else {
            throw new java.util.NoSuchElementException();
        }
    }

    /**
     * Returns true if the iteration has more elements.
     *
     * @return true if the iteration has more elements, false otherwise
     */
    public boolean hasNext() {
        return position < items.size();
    }
}
