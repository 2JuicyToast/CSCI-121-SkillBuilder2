public class GameMaster {
    private static int totalExperiencePoints;

    public static void gainExperience(int xp) {
        totalExperiencePoints += xp;
    }

    public static int getTeamXP() {
        return totalExperiencePoints;
    }

    public static void applyPowerUp(int xp) {
        totalExperiencePoints += xp;
    }

    public static void applyPowerUp(double multiplier) {
        totalExperiencePoints = (int)(totalExperiencePoints * multiplier);
    }

    public static void resetGame() {
        totalExperiencePoints = 0;
    }

    public static void main(String[] args) {
        // 1) Add 500 XP via quest
        gainExperience(500);

        // 2) Apply a Potion of 100 XP
        applyPowerUp(100);

        // 3) Apply an Artifact multiplier of 2.5
        applyPowerUp(2.5);

        // 4) Print final XP
        System.out.println(getTeamXP());
    }
}
