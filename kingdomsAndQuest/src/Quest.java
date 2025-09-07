public class Quest
{
    private int amountOfEPEarnedOnCompletion;
    private int difficulty;
    private NonPlayerCharecter nonPlayerCharecter;

    public Quest(int difficulty, NonPlayerCharecter nonPlayerCharecter)
    {
        this.amountOfEPEarnedOnCompletion = difficulty * 100;
        this.difficulty = difficulty;
        this.nonPlayerCharecter = nonPlayerCharecter;
    }

    public int getAmountOfEPEarnedOnCompletion()
    {
        if (difficulty == 0) {
            return 100;
        } else {
            return this.amountOfEPEarnedOnCompletion;
        }
    }

    public void setAmountOfEPEarnedOnCompletion(int amountOfEPEarnedOnCompletion)
    {
        this.amountOfEPEarnedOnCompletion = amountOfEPEarnedOnCompletion;
    }

    public int getDifficulty()
    {
        return this.difficulty;
    }

    public void setDifficulty(int difficulty)
    {
        this.difficulty = difficulty;
    }

    public NonPlayerCharecter getNonPlayerCharecter()
    {
        return this.nonPlayerCharecter;
    }

    public void setNonPlayerCharecter(NonPlayerCharecter nonPlayerCharecter)
    {
        this.nonPlayerCharecter = nonPlayerCharecter;
    }

    public boolean canPlayerStartQuest(int totalPlayerXP)
    {
        return ((this.difficulty * 200) <= totalPlayerXP) || difficulty == 0;
    }
}
