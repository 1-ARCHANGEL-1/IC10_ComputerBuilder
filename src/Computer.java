import java.text.NumberFormat;

public class Computer
{
    //Instance Variables (Fields)
    private CPU mCPU;
    private RAM mRAM;
    private Storage mStorage;
    private VideoCard mVideoCard;
    private NumberFormat currency = NumberFormat.getCurrencyInstance();
    public CPU getCPU() {
        return mCPU;
    }


    public RAM getRAM() {
        return mRAM;
    }


    public Storage getStorage() {
        return mStorage;
    }


    public VideoCard getVideoCard() {
        return mVideoCard;
    }
    public double calculateCost()
    {
        // Add up all prices of all parts
        return mCPU.mPrice;// +mRAM.mPrice + mStorage.mPrice + mVideoCard.mPrice;
    }

    @Override
    public String toString()
    {
        String output = String.format(" ~~~~~~~~~Computer Specifications~~~~~~~~~~\n"
                + mCPU + "\n"
                + mRAM + "\n"
                + mStorage + "\n"
                + mVideoCard + "\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "Total Cost as Configured: " + currency.format(calculateCost()))+"]";
        return output;
    }

    class CPU
    {

        private String mManufacturer;
        private String mCore;
        private double mSpeed;
        private double mPrice;


        public CPU(String manufacturer, String core, double speed, double price)
        {
            mManufacturer = manufacturer;
            mCore = core;
            mSpeed = speed;
            mPrice = price;
            mCPU = this;
        }

        @Override
        public String toString()
        {
            return "CPU ["+ mManufacturer + " " + mCore + " "+ mSpeed + "GHz"+ currency.format(mPrice);
        }

    }

    class RAM
    {
        //TODO: Complete inner class
    }
    class Storage
    {
        //
    }
    class VideoCard
    {

    }
}
