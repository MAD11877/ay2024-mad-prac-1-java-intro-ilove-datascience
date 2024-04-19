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
    Map<int,int> map = new HashMap<int,int>();
    for (int i =0; i<times; i++)
      {
        int number= in.nextint();
        if (list.contains(number=true))
        {
          int value =map.get(number);
          map.set(number,value+1);
        }
        else 
        {
          map.put(number, 1);
        }
        list.add(number);
      }
    int repeat1 =0;
    for(int i =0; i<(list.length-1);i++)
      {
        int element = list.get(i);
        int repeat = map.get(element);
        if (repeat>repeat1)
        {
          repeat1=repeat;
        }
      }
    System.out.println(repeat1);

    
    
  }
}
