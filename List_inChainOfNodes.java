/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
    public int size() {
        int sizeHolder = 0;
        Node nodeReference = headReference;
        while (nodeReference != null) {
            nodeReference = nodeReference.getReferenceToNextNode();
            sizeHolder ++;
        }
        return sizeHolder;
    }
    

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String result = size() + " elements [" ;
        if (headReference != null) {
            Node nodeReference = headReference;
            while (nodeReference != null) {
                result += nodeReference.getCargoReference() + ", ";
                nodeReference = nodeReference.getReferenceToNextNode();
            }
        }
        result += "]";
        return result;
               
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        if (size() == 0) { headReference = new Node( val );}
        else {
            headReference = new Node( val, headReference);
        }
        return true;
     }
}