import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {{
    Scanner sc = new Scanner(System.in);
    String password = sc.nextLine();

    boolean hasUppercase = false;
    boolean hasLowercase = false;
    boolean hasDigit = false;
    boolean hasSpecialChar = false;
    
    if (password.length() >=8)  {     
      for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);       
        if (ch >= 'A' && ch <= 'Z') {
          hasUppercase = true;
        }
        else if (ch >= 'a' && ch <= 'z') {
          hasLowercase = true;
        }        
        else if (ch >= '0' && ch <= '9') {
          hasDigit = true;
        }        
        else if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z') && !(ch >= '0' && ch <= '9') && ch != ' ') {
          hasSpecialChar = true;
        }
      }
    }
    if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
      System.out.println("True");
    }
    else {
      System.out.println("False");
    }
    }
    }
}
