/*
2. Write a java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
* * * #
* * # @
* # @ @ 
# @ @ @
 */
import java.util.*;

import javax.lang.model.util.ElementScanner14;
class program40_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1=0,iValue2=0;
        System.out.println("Enter the Rows : ");
        iValue1=sobj.nextInt();
        System.out.println("Enter the Column : ");
        iValue2=sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.pattern(iValue1,iValue2);
    }
}
class Pattern
{
    public void pattern(int iRow,int iCol)
    {
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if((i+j)==(iRow+1))
                {
                    System.out.print("# ");
                }
                else if((i+j)<=iRow)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }
    }
}