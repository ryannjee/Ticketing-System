package cw1;
public class Price {
    public double priceone;
    
    public double ticket1(int askP1,int askP2,int askP3) //To count ticket for 60 and above for theme park 
    {
        double price=0;
            if(askP1>=1 && askP1<=3)
            {
                price = (50 * askP1); //Formula if quantity is lesser than 3
            }
            if(askP1>3)
            {
                price = ((50 * 3) + (45 * (askP1 - 3))); //Formula if quantity is more than 3
            }
        return price;
    }
    
    public double ticket2(int askP1,int askP2,int askP3) //To count ticket for 17-59 for theme park
    {
        double price=0;
            if(askP2>=1 && askP2<=3)
            {
                price = (80 * askP2); //Formula if lesser than 3
            }
            if(askP2>3)
            {
                price = ((80 * 3) + (75 * (askP2 - 3))); //Formula if more than 3
            }
        return price;
    }
    
    public double ticket3(int askP1,int askP2,int askP3) //To count ticket for below 17 for theme park
    {
        double price=0;
            if(askP3>=1 && askP3<=3)
            {
                price = (30 * askP3); //Formula if lesser than 3
            }
            if(askP3>3)
            {
                price = ((30 * 3) + (25 * (askP3 - 3))); //Formula if more than 3
            } 
        return price;
    }     
    
    public double ticket4(int askP1,int askP2,int askP3) //To count ticket for 60 and above for water park
    {
        double price=0;
            if(askP1>=1 && askP1<=3)
            {
                price = (60 * askP1); //Formula if lesser than 3
            }
            if(askP1>3)
            {
                price = ((60 * 3) + (55 * (askP1 - 3))); //Formula if more than 3
            }
        return price;
    }
    
    public double ticket5(int askP1,int askP2,int askP3) //To count ticket for 17-59 for water park
    {
        double price=0;
            if(askP2>=1 && askP2<=3)
            {
                price = (90 * askP2); //Formula if lesser than 3
            }
            if(askP2>3)
            {
                price = ((90 * 3) + (85 * (askP2 - 3))); //Formula if more than 3
            }
        return price;
    }
    
    public double ticket6(int askP1,int askP2,int askP3) //To count ticket for below 17 for water park
    {
        double price=0;
            if(askP3>=1&&askP3<=3)
            {
                price = (50 * askP3); //Formula if lesser than 3
            }
            if(askP3>3)
            {
                price = ((50 * 3) + (45 * (askP3 - 3))); //Formula if more than 3
            } 
        return price;
    }    
    
    public double ticket7(int askP1,int askP2,int askP3) //To count ticket for 60 and above for all park
    {
        double price=0;
            if(askP1>=1 && askP1<=3)
            {
                price = (120 * askP1); //Formula if lesser than 3
            }
            if(askP1>3)
            {
                price = (120 * 3) + (110 * (askP1 - 3)); //Formula if more than 3
            }
        return price;
    }
    public double ticket8(int askP1,int askP2,int askP3) //To count ticket for 17-59 for all park
    {
        double price=0;
            if(askP2>=1 && askP2<=3)
            {
                price = (160 * askP2); //Formula if lesser than 3
            }
            if(askP2>3)
            {
                price = (160 * 3) + (150 * (askP2 - 3)); //Formula if more than 3
            }
        return price;
    } 
    
    public double ticket9(int askP1,int askP2,int askP3) //To count ticket for below 17 for all park
    {
        double price=0;
            if(askP3>=1 && askP3<=3)
            {
                price = (70 * askP3); //Formula if lesser than 3
            }
            if(askP3>3)
            {
                price = (70 * 3) + (60 * (askP3 - 3)); //Formula if more than 3
            } 
        return price;
    }     
    
    public double taxrate(double priceone) 
    {
        return priceone*1.06; //To count price with taxrate
    }
    
}

