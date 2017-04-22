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
      BL.incertAfter(number.nextInt(50));
      n -= 1;
    }

    BL.forwardTraverse();
    
    m = BL.getSize();
    
    while(m > 0)
    {
    n = m - 1;
    BL.findHead();
    
    while(n > 0)
    {
      int temp;
      element = BL.getCurr();
      BL.findNext();
      if(element >= BL.getCurr())
      {
        temp = BL.removeCurr();
        BL.incertBefore(temp);
        BL.findNext();
      }
      n -= 1;
     }
    m -= 1;
    }
    
    BL.forwardTraverse();
    
    }
}
    