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
     
      /**
      Set value at @index to @newValue
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
     public Node set( int index, Object newValue ) {
         Node nodeHolder = headReference;
         for (  int currentIndex = 0;
                currentIndex < index - 1;
                currentIndex ++
                ) {
                    nodeHolder = nodeHolder.getReferenceToNextNode();
                }
                
         Node oldHolder = nodeHolder.getReferenceToNextNode();
         if (index != 0) {
             nodeHolder.setReferenceToNextNode( new Node(newValue,
                            nodeHolder.getReferenceToNextNode().getReferenceToNextNode()));
         }
         else {
             headReference = new Node(newValue,
                            headReference.getReferenceToNextNode());
         }
         return oldHolder;
     }
     
     /**
      accessor
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
     
    public Object get( int index ) {
        Node nodeHolder = headReference;
         for (  int currentIndex = 0;
                currentIndex < index;
                currentIndex ++
                ) {
                    nodeHolder = nodeHolder.getReferenceToNextNode();
                }
                
        return nodeHolder.getCargoReference();
    }
    
    
     
}