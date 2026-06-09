// code 2 : The class that uses the custom exception

class Voting {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

}
