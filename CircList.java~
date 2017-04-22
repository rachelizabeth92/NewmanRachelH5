public class CircList
{
  private Node tail;
  private Node curr;
  private int size;
  
  public CircList()
  {
    curr = (tail = null);
    size = 0;
  }
  
  public boolean isEmpty()
  {
    if(size == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public boolean isFull()
  {
    return false; 
  }

  public int getSize()
  {
    return this.size;
  }
  
  public String incertBefore(String element)
  {
    Node node = new Node(element);
    
    if(isEmpty())
    {
      node.setNext(node);
      node.setPrev(node);
      tail = node;
    }
    else
    {
      node.setNext(curr);
      node.setPrev(curr.getPrev());
      curr.getPrev().setNext(node);
      curr.setPrev(node);
    }
    curr = node;
    size++;
    return element;
  }
  
  public String incertAfter(String element)
  {
    Node node = new Node(element);
    
    if(isEmpty())
    {
      node.setNext(node);
      node.setPrev(node);
      tail = node;
    }
    else
    {
      node.setPrev(curr);
      node.setNext(curr.getNext());
      curr.getNext().setPrev(node);
      curr.setNext(node);
      
      if(curr == tail)
      {
        tail = node;
      }
    }
    curr = node;
    size++;
    return element;
  }
  
  public int forwardTraverse()
  {
    Node temp;
    int n = 0;
    System.out.println("-----");
    
    if(!isEmpty())
    {
     temp = tail;
     
     do
     {
       n++;
       temp = temp.getNext();
       
       if(temp == curr)
       {
         System.out.printf("[%d] (%s) \n", n, temp.getElem());
       }
       else
       {
       System.out.printf("[%d] \"%s\" \n", n, temp.getElem());
       }
     }
     while(temp != tail);
    }
    return n;
  }
  
  public int backwardTraverse()
  {
    Node temp;
    int n = 0;
    System.out.println("-----");
    
    if(!isEmpty())
    {
     temp = tail;
     
     do
     {
       n++;
       
       if(temp == curr)
       {
         System.out.printf("[%d] (%s) \n", n, temp.getElem());
       }
       else
       {
       System.out.printf("[%d] \"%s\" \n", n, temp.getElem());
       }
       
       temp = temp.getPrev();
     }
     while(temp != tail);
    }
    return n;
  }
  
  public String removeCurr()
  {
    Node node;
    String element;
    
    if((node = curr) != null)
    {
      element = node.getElem();
      
      if(node.getNext() == node)//only node in list
      {
        tail = null;
        curr = null;
      }
      else
      {
        curr.getNext().setPrev(curr.getPrev());
        curr.getPrev().setNext(curr.getNext());
        
        if(curr == tail)
        {
          curr = curr.getPrev();
          tail = curr;
        }
        else
        {
        curr = curr.getNext();
        }
      }
      size--;
    }
    else
    {
     element = null;
     System.out.println("ERROR: Empty List");
    }
    return element;
  }
  
  public void deleteList()
  {
    while(!isEmpty())
    {
      removeCurr();
    }
    System.out.println("List has been destroyed.");
    return;
  }
  
  public int searchList(String element)
  {
    Node node;
    int n = 0;
    
    if(!isEmpty())
    {
     node = tail;
     
     do
     {
      node = node.getNext();
      n++;
      
      if(element.compareTo(node.getElem())== 0)
      {
        curr = node;
        return n;
      }
     }
     while(node != tail);
     return 0;
    }
    else
    {
      System.out.println("ERROR: Empty List.");
    }
    return -1;
  }
  
  public void findTail()
  {
    curr = tail;
    return;
  }
  public void findHead()
  {
    if(!isEmpty())
    {
    curr = tail.getNext();
    }
    return;
  }
  
  
}
      
    
    
    
    
    