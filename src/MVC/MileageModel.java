// The Model will perform the calculations needed for the application.
//  It does not have any knowledge of the View or that it even exists.
//  In this case it will take two integers and

package MVC;

public class MileageModel {

    private int milesPerGallon;

    public void calculateMileage(int milesDriven, int gallonsUsed) {

        milesPerGallon = milesDriven / gallonsUsed;

    }

    public int getMilesPerGallon() {

        return milesPerGallon;
    }

}
