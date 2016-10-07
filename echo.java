/* ECHO in Java. Why? Why not? Well, I can think of a reason why not. It usually works properly, but not always. 
 * Do yourself a favor and use the regular ECHO from your command line. */

class echo { public
    /* pirate */ static void main (String[] arrrgs) { // joke from https://redd.it/4dn8pb
        if (arrrgs.length==0)
            System.out.println("ECHO is on.");
        else {
            for (int i=0; i<arrrgs.length; i++)
                System.out.print(arrrgs[i]+" ");
            System.out.println();
        }
    }
}