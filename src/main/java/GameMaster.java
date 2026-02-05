public class GameMaster {
    // Static variable shared by all players/instances
    private static int totalExperiencePoints = 0;

    /**
     * Standard method to gain XP.
     * Illustrates a static method modifying a static variable.
     */
    public static void gainExperience(int xp) {
        totalExperiencePoints += xp;
        System.out.println("Team gained " + xp + " points!");
    }

    /**
     * Getter for the static variable.
     */
    public static int getTeamXP() {
        return totalExperiencePoints;
    }

    /**
     * Overloaded Method (Version A): Potion Power-Up
     * Accepts an int to add a flat bonus.
     */
    public static void applyPowerUp(int bonusXP) {
        totalExperiencePoints += bonusXP;
        System.out.println("Potion consumed! + " + bonusXP + " XP.");
    }

    /**
     * Overloaded Method (Version B): Artifact Power-Up
     * Accepts a double to multiply the existing XP.
     * Demonstrates type casting (double to int).
     */
    public static void applyPowerUp(double multiplier) {
        totalExperiencePoints = (int) (totalExperiencePoints * multiplier);
        System.out.println("Artifact activated! XP multiplied by " + multiplier + ".");
    }

    /**
     * Resets the game (useful for testing purposes).
     */
    public static void resetGame() {
        totalExperiencePoints = 0;
    }
}
