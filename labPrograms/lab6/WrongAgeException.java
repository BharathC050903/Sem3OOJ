class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    private int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age should be less than Father's age");
        }

        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return sonAge;
    }
}

class run {
    public static void main(String[] args) {
        System.out.println("Bharath C\t1BMM22CS068");
        try {
            Father father = new Father(40);
            System.out.println("Father's age: " + father.getAge());

            Son son = new Son(40, 20); // This will throw an exception
            System.out.println("Son's age: " + son.getSonAge());
        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage()); // More specific error message
            // e.printStackTrace(); // For debugging, prints the entire stack trace
        } // Added closing parenthesis
    }
}