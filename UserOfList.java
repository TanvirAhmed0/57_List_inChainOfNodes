/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() +System.lineSeparator() + list );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
                          
        //Testing set
        System.out.println( "Before: "
                          + list );
        list.set(2, "hey!");
        System.out.println( "After: "
                          + list );
                          
        list.set(0, "wow!");
        System.out.println( "After: "
                          + list );
                          
        list.set(3, "nose!");
        System.out.println( "After: "
                          + list );
                          
        // Testing get
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.get(3));
    }
}
