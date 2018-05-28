/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BILAL
 */
public class StarPattern 
{
    
    public void pattern()
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        
        System.out.println("");
        
    }
}
public static void main(String[] args)
{
StarPattern obj=new StarPattern();
obj.pattern();
}
}