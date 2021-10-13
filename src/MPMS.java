import controller.UserController;

import java.util.Scanner;

public class MPMS {
    private UserController userController;

    public MPMS(){
        userController = new UserController();
    }

    public static void main(String[] args) {
        MPMS mPMS = new MPMS();
        mPMS.startPageDisplay();
    }

    // initial screen
    public void startPageDisplay(){
        titleBar();
        int inputInt = -1;
        System.out.println("Please enter a number to select enter mode: ");
        System.out.println("Enter 1 to log in ");
        System.out.println("Enter 2 to sign up ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        try {
            inputInt = Integer.parseInt(input);
            if (inputInt < 1 || inputInt > 2)
                System.out.println("-Not a valid number, please try again.");
            else {
                if (inputInt == 1) {
                    boolean logInSuccess = logIn();
                    System.out.println(logInSuccess ? "Log in successfully"
                            : "Log in Failed." +
                            "\n Your log-in details are wrong. " +
                            "\n Please try again. ");
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("-Not a valid number, please try again.");
        }
    }


    // tool_display_title bar look like:
    // ===============================
    // |       Welcome to MPMS       |
    // ===============================
    public void titleBar(){
        System.out.println("===============================");
        System.out.println("|       Welcome to MPMS       |");
        System.out.println("===============================");;
    }

    public boolean logIn(){
        titleBar();
        System.out.println("Please enter your email address: \n");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println("Please enter your password: \n");
        String password = scanner.nextLine();
        return userController.matchEmailAndPassword(email, password);
    }
}

// tool_regex
//^                 # start-of-string
//(?=.*[0-9])       # a digit must occur at least once
//(?=.*[a-z])       # a lower case letter must occur at least once
//(?=.*[A-Z])       # an upper case letter must occur at least once
//(?=.*[@#$%^&+=])  # a special character must occur at least once
//(?=\S+$)          # no whitespace allowed in the entire string
//.{8,}             # anything, at least eight places though
//$                 # end-of-string
// String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$"
// System.out.println("", pattern);