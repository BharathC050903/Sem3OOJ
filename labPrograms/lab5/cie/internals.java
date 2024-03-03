// File: labPrograms/lab5/cie/internals.java
package labPrograms.lab5.cie;

public class internals extends student {
    public int[] internalMarks;

    public internals(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        this.internalMarks = marks;
    }
}
