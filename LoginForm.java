package ProblemE8_26;

public class LoginForm {
    private String actualUserName = " ";
    private String actualPassword = " ";
    private String enteredUserName = " ";
    private String enteredPassword = " ";
    private boolean loggedIn = false;
    public LoginForm(String userName,String password){
     this.actualUserName = userName;
      this.actualPassword = password;
    }

    public void input(String text,String input){
        if(text.equals("username")){
            enteredUserName = input;
        }
        else if (text.equals("Password")) {
            enteredPassword = input;

        }
        else {
            System.out.println("something went wrong ,please try again: input");
        }
    }

    public void click(String button){
        if(button.equals("Submit")){
            if(enteredUserName.equals(actualUserName) && enteredPassword.equals(actualPassword)){
                loggedIn = true;
            }
            else {
                loggedIn = false;
            }
        }
        else if(button.equals("Reset")){
            enteredUserName = " ";
            enteredPassword = " ";
        }
        else {
            System.out.println("something went wrong: click");
        }
    }
    public boolean LoggedIn(){
        return loggedIn;
    }
}
