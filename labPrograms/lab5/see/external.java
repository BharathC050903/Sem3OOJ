// File: labPrograms/lab5/see/external.java
package labPrograms.lab5.see;

import labPrograms.lab5.cie.student;

public class external extends student {
    public int[] seeMarks;

    public external(String usn, String name, int sem, int[] seeMarks) {
        super(usn, name, sem);
        this.seeMarks = seeMarks;
    }
}