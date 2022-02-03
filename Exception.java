package com.myfirstprogram;

//Demostrate throw.
class ThrowDemo
{
    static void demoproc()
    {
        try
        {
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside deomproc....");
            throw e; //rethrow the ecception

        }
    }

    public static void main(String args[])
    {
        try
        {
            demoproc();
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught:  "+e);
        }
    }
}



