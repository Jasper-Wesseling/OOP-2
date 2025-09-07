public class SpecialQuest extends Quest
{
    private Item itemEarnedOnCompletion;

    public SpecialQuest(int difficulty, NonPlayerCharecter nonPlayerCharecter, Item itemEarnedOnCompletion)
    {
        super(difficulty, nonPlayerCharecter);
        this.itemEarnedOnCompletion = itemEarnedOnCompletion;
    }

    public Item getItemEarnedOnCompletion()
    {
        return this.itemEarnedOnCompletion;
    }

    public void setItemEarnedOnCompletion(Item itemEarnedOnCompletion)
    {
        this.itemEarnedOnCompletion = itemEarnedOnCompletion;
    }
}
