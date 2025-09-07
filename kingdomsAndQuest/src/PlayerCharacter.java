import java.util.HashSet;
import java.util.Set;

public class PlayerCharacter
{
    private int totalXPEarned;
    private String name;
    private Set<Item> inventory;
    private Class playerClass;
    private Quest currentQuest;

    public PlayerCharacter(int totalXPEarned, String name, Class playerClass)
    {
        this.totalXPEarned = totalXPEarned;
        this.name = name;
        this.playerClass = playerClass;

        this.currentQuest = null;
        this.inventory = new HashSet<>();
    }

    public int getTotalXPEarned()
    {
        return this.totalXPEarned;
    }

    public void setTotalXPEarned(int totalXPEarned)
    {
        this.totalXPEarned = totalXPEarned;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<Item> getInventory()
    {
        return this.inventory;
    }

    public void setInventory(Set<Item> inventory)
    {
        this.inventory = inventory;
    }

    public Class getPlayerClass()
    {
        return this.playerClass;
    }

    public void setPlayerClass(Class playerClass)
    {
        this.playerClass = playerClass;
    }

    public Quest getCurrentQuest()
    {
        return this.currentQuest;
    }

    public void setCurrentQuest(Quest currentQuest)
    {
        this.currentQuest = currentQuest;
    }

    public void attack()
    {
        System.out.println("attack");
    }

    public void defend()
    {
        System.out.println("defend");
    }

    public void addXP(int xp)
    {
        this.totalXPEarned += xp;
    }

    public int getLevel()
    {
        int xpToLevel = 200;
        return this.totalXPEarned / xpToLevel;
    }

    public void play()
    {
        if (this.currentQuest != null) {
            System.out.println("easy win");
            this.addXP(this.currentQuest.getAmountOfEPEarnedOnCompletion());
            System.out.println("Your current XP = " + this.totalXPEarned);
            this.currentQuest = null;
        } else {
            System.out.println("No quest found");
        }
    }

    public void startQuest(Quest quest)
    {
        if (quest.canPlayerStartQuest(this.totalXPEarned))
        {
            System.out.println("Quest Started");
            this.currentQuest = quest;
        } else
        {
            System.out.println("Quest could not be started");
            this.currentQuest = null;
        }
    }
}
