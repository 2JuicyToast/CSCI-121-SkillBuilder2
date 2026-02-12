public class GameSession {
    public static void main(String[] args) {
        // 1) Add 500 XP via quest
        GameMaster.gainExperience(500);

        // 2) Apply a Potion of 100 XP
        GameMaster.applyPowerUp(100);

        // 3) Apply an Artifact multiplier of 2.5
        GameMaster.applyPowerUp(2.5);

        // 4) Print final XP
        System.out.println(GameMaster.getTeamXP());
        }
    }

