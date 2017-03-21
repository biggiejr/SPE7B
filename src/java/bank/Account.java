package bank;

public class Account
{

    public Account()
    {
    }


    
    public double getInterest(double balance)
    {
        double interest = 0;
        
        if(balance >= 0 && balance <= 100)
        {
            interest = balance * 0.03;
        }
        else if(balance > 100 && balance < 1000)
        {
            interest = balance * 0.05;
        }
        else if(balance >= 1000)
        {
            interest = balance * 0.07;
        }
        
        return interest;
    }

    
}
