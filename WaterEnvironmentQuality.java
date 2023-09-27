import java.util.Scanner;
public class WaterQuality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 System.out.println("Enter the concentration of H+ ions in the water in moles per liter: ");
        double hPlusConcentration = input.nextDouble();
        // Calculate the pH of the water
        double pH = -Math.log10(hPlusConcentration);
        boolean isPure = false;
        if (pH >= 7 && pH <= 8.5) {
            isPure = true;
        }
        // Get the carbon dioxide level in the water.
        System.out.println("Enter the carbon dioxide level in the environment (in ppm):");
        double carbonDioxideLevel = input.nextDouble();
        // Determine if the carbon dioxide level is good or bad.
        boolean isCarbonDioxideLevelGood = false;
        if (carbonDioxideLevel < 10) {
            isCarbonDioxideLevelGood = true;
        }
        // Get the oxygen level in the water.
        System.out.println("Enter the oxygen level in the environment (in ppm):");
        double oxygenLevel = input.nextDouble();
        // Determine if the oxygen level is good or bad.
        boolean isOxygenLevelGood = false;
        if (oxygenLevel > 5) {
            isOxygenLevelGood = true;
        }
        // Print the results.
        System.out.println("The pH of the water is: " + pH);
        System.out.println("The water is " + (isPure ? "pure" : "impure"));
        if(isPure){
System.out.println("It doesn't produce Odour ") ;
        }else
System.out.println("It produces Odour"); 
        System.out.println("The carbon dioxide level in the environment is: " + carbonDioxideLevel + " ppm");
        System.out.println("The carbon dioxide level is " + (isCarbonDioxideLevelGood ? "good" : "bad"));
        System.out.println("The oxygen level in the environment is: " + oxygenLevel + " ppm");
        System.out.println("The oxygen level is " + (isOxygenLevelGood ? "good" : "bad"));
    }
}