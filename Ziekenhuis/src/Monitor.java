public abstract class Monitor
{
    private Status status;
    private int sirialNumber;
    private int usageInKWh;

    public Monitor(Status status, int sirialNumber, int usageInKWh)
    {
        this.status = status;
        this.sirialNumber = sirialNumber;
        this.usageInKWh = usageInKWh;
    }

    public int getSirialNumber()
    {
        return this.sirialNumber;
    }

    public void setSirialNumber(int sirialNumber)
    {
        this.sirialNumber = sirialNumber;
    }

    public Status getStatus()
    {
        return this.status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public int getUsageInKWh()
    {
        return this.usageInKWh;
    }

    public void setUsageInKWh(int usageInKWh)
    {
        this.usageInKWh = usageInKWh;
    }
}
