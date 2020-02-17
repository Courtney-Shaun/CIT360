package MVC;

public class MileageCalculator {


    public static void main(String[] args) {

        MileageView theView = new MileageView();

        MileageModel theModel = new MileageModel();

        MileageControl theControl = new MileageControl(theView,theModel);

        theView.setVisible(true);


    }
}