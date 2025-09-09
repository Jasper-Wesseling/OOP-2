import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome");
        System.out.println("----------------");
        Class playerClass = new Warrior();
        PlayerCharacter player = new PlayerCharacter(0, "Henk", playerClass);

        NonPlayerCharecter NPCQuestOne = new NonPlayerCharecter("generic tutorial NPC");
        Quest questOne = new Quest(0, NPCQuestOne);
        Quest questTwo= new Quest(0, NPCQuestOne);

        NonPlayerCharecter EndBose = new NonPlayerCharecter("BigBoss");
        Item RustyNail = new Item("Rusty Nail Of Tetanus +1 Poison Damage");
        Quest lastQuest = new SpecialQuest(1, EndBose, RustyNail);

        player.startQuest(questOne);
        player.play();
        player.play();
        System.out.println("----------------");

        player.startQuest(lastQuest);
        player.play();
        System.out.println("----------------");

        player.startQuest(questTwo);
        player.play();
        System.out.println("----------------");

        player.startQuest(lastQuest);
        player.play();
        System.out.println("----------------");

    }
}
