public class AgeRestrictionException extends Exception {
    public AgeRestrictionException(int age) {
        super("Age restriction: Users must be 18 or older. Provided age: " + age + ".");
    }
}