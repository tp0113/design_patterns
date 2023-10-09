package iterator;

import java.util.Stack;

/**
 * Represents a document with undo and redo functionality.
 * This class allows you to make changes to the document, undo and redo those changes, and iterate over undo and redo stacks.
 */
public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * Constructs a new document with the given title.
     *
     * @param title the title of the document
     */
    public Document(String title) {
        this.title = title;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    /**
     * Makes a change to the document and adds it to the undo stack.
     *
     * @param change the change to be made to the document
     * @return a message indicating that the change has been applied
     */
    public String makeChange(String change) {
        undoStack.push(change);
        redoStack.clear();
        return "Making Change: " + change;
    }

    /**
     * Undoes the most recent change made to the document.
     *
     * @return a message indicating that the last change has been undone, or "No changes to undo" if there are no changes to revert
     */
    public String undoChange() {
        if (canUndo()) {
            String undoneChange = undoStack.pop();
            redoStack.push(undoneChange);
            return "Undoing: " + undoneChange;
        }
        return "No changes to undo";
    }

    /**
     * Checks if there are any changes that can be undone.
     *
     * @return true if there are changes that can be undone, false otherwise
     */
    public boolean canUndo() {
        return !undoStack.isEmpty();
    }

    /**
     * Redoes the most recently undone change in the document.
     *
     * @return a message indicating that the last change has been redone, or "No changes to redo" if there are no changes to reapply
     */
    public String redoChange() {
        if (canRedo()) {
            String redoneChange = redoStack.pop();
            undoStack.push(redoneChange);
            return "Redoing: " + redoneChange;
        }
        return "No changes to redo";
    }

    /**
     * Checks if there are any changes that can be redone.
     *
     * @return true if there are changes that can be redone, false otherwise
     */
    public boolean canRedo() {
        return !redoStack.isEmpty();
    }

    /**
     * Retrieves an iterator for the undo stack.
     *
     * @return an iterator for the undo stack
     */
    public StackIterator getUndoIterator() {
        return new StackIterator(undoStack);
    }

    /**
     * Retrieves an iterator for the redo stack.
     *
     * @return an iterator for the redo stack
     */
    public StackIterator getRedoIterator() {
        return new StackIterator(redoStack);
    }
}