import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    public interface List<E> extends Collection<E> ;
    Scanner in = new Scanner(System.in);
    int times = in.nextint();
    List<int> list = new ArrayList<int> (); 
    for (int i =0; i<times; i++)
      {
        int number= in.nextint();
        list.add(number)        
      }
    for(int i =0; i<(list.length-1);i++)
      {
        int element = list.get(i)

        
      }

    
    
  }
}
