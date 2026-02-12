public class GameMaster {
    private static int totalExperiencePoints;

    public static void gainExperience(int xp){
        totalExperiencePoints += xp;
    }

    public static int getTeamXP(){
        return totalExperiencePoints;
    }

    public static void applyPowerUp(int xp){
        totalExperiencePoints += xp;
    }

    public static void applyPowerUp(double multiplier){
        int xPBoost = (int)(totalExperiencePoints * multiplier);
        totalExperiencePoints = xPBoost;
    }
}
