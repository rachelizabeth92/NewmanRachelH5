import java.util.Random;

public class H5Main
{
  public static void main(String[] args)
  {
    int n = 20;
    int m;
    int element;
    
    CircList BL = new CircList();
    Random number = new Random();
    
    while(n > 0)
    {
      BL.incertAfter(number.nextInt(50) -25);
      n -= 1;
    }

    BL.forwardTraverse();
    
    m = BL.getSize() - 1;
    
    while(m > 0)
    {
    int swapCount = 0;
    n = m;
    BL.findHead();
    
    while(n > 0)
    {
      element = BL.getCurr();
      BL.findNext();
      if(element > BL.getCurr())
      {
        BL.incertBefore(BL.removeCurr());
        BL.findNext();
        swapCount += 1;
      }
      n -= 1;
     }
    if(swapCount == 0)
    {
      m = 0;
    }
    else
    {
      m -= 1;
    }
    
    }
    
    System.out.println("\n Sorted List: ");
    BL.forwardTraverse();
    
    }
}
    