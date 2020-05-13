import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PalindromeDemo {
    public static void main(String [] args) {
        int result;
        do {
            LinkedStack<Character> stack = new LinkedStack<>();
            String input;
            JFrame frame = new JFrame("Palindrome checker");

            input = JOptionPane.showInputDialog(frame, "Enter a String to test if it is a palindrome");

            //Replacing special characters & spaces
            String fixedString = input.replaceAll("[^a-zA-Z]","");

            //Pushing characters of fixedString into stack
            for(int i = 0; i < fixedString.length(); i++) {
                stack.push(fixedString.charAt(i));
            }

            StringBuilder build = new StringBuilder();

            //Building new reversed String
            while(!stack.isEmptyStack()) {
                Character c = stack.peek();
                build.append(c);
                stack.pop();
            }

            if(fixedString.compareToIgnoreCase(build.toString())==0) {
                JOptionPane.showMessageDialog(null, "'" +  input + "' is a palindrome");
            }
            else {
                JOptionPane.showMessageDialog(null, "'" +  input + "' is not a palindrome");
            }

            int decision = JOptionPane.YES_NO_OPTION;
            result = JOptionPane.showConfirmDialog(null, "Would you like to test another String?",
                    "Continue", decision);

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Program exited");
                break;
            }
        } while(result == 0);
    }
}
