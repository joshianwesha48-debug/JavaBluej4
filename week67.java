
/**
 * Write a description of class week67 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week67
{
    public static void main(String[] args)
    {
        String[][] seats = {{" Ram "," Shyam "," Ham "},{"[empty]","[empty]","[empty]"}};
          System.out.println("Seating Chart:");
        for (int i=0; i<seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                System.out.print(seats[i][j]);
            }
              System.out.println();
        }
    }
    }
 

