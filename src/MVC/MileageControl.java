//  Used code from http://www.newthinktank.com/2013/02/mvc-java-tutorial/ as a base and edited to fit my program.

package MVC;

import java.awt.event.*;

public class MileageControl {

    private MileageView theView;
    private MileageModel theModel;

    public MileageControl(MileageView theView, MileageModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class

        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered

            try{

                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.calculateMileage(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getMilesPerGallon());

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter the Miles and Gallons used!");

            }

        }

    }
}
