//Noreen Akhtar
package findingminandmax;

import javax.swing.JOptionPane;


public class FindingMinAndMax
{

    
    public static void main(String[] args)
    {  int Minimum = Integer.MAX_VALUE; 
        int Maximum = Integer.MIN_VALUE; 
        boolean firstInput = true; 

        while (true) {
            // Prompt user for a number
            String input = JOptionPane.showInputDialog("Enter a number:");
            
            // Check if input is valid
            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                continue;
            }

            // Convert the input to an integer
            int number;
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number format. Please enter an integer.");
                continue;
            }

            // Update smallest and largest numbers
            if (firstInput) {
                Minimum = Maximum = number; 
                firstInput = false;
            } else {
                if (number < Minimum) {
                    Minimum = number;
                }
                if (number > Maximum) {
                    Maximum = number;
                }
            }

            // Ask if the user wants to continue
            int response = JOptionPane.showConfirmDialog(null, "Do you want to enter another number?", "Continue?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {
                break; // Exit the loop if the user does not want to continue
            }
        }

        // Output the results
        JOptionPane.showMessageDialog(null, "Smallest number: " + Minimum + "\nLargest number: " + Maximum );
    }
}
             
    
