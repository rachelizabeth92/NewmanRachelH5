
public class Node 
    {
        private int element;
        private Node next;
        private Node prev;
 
        public Node(int element) 
        {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
            
            
            public void setNext(Node node)
            {
              this.next = node;
            }
            
            public Node getNext()
            {
              return this.next;
            }
            
            public void setPrev(Node node)
            {
              this.prev = node;
            }
            
            public Node getPrev()
            {
              return this.prev;
            }
            
            public int getElem()
            {
              return this.element;
            }
}
