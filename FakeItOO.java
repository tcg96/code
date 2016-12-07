/* The song "Fake It" by Bastille from their album "Wild World" has a line
 * that says "Show me joy, flower through disarray", but it sounds like
 * "Show me joy, flower through this array". An array is a programming
 * thing I've heard of. So here's an awful, awful programming joke about
 * it. It may not even be correct. And it is a shame. Heaven, help me. I
 * should kill myself like the person talked about in the song "Blame"
 * from the same album. */

class Flower {
    final String flower = "flower";

    public Flower() {
        // nothing, just the String previously defined
    }

    public String toString() { // this method is optional, but you'll see why I included it
        return flower;
    }
}

class FakeItOO { // an object-oriented version of FakeIt. This one uses an actual "Flower" instead of a String!
    public static void main (String[] args) {
    	  Flower flowerIn = new Flower();           // get the flower
        Object[] disarray = new Object[1];        // create a new array called "disarray" with only one position (pointless, but doable). it's an Object array instead of a Flower array, because who says this array called "disarray" only has Flowers?
        disarray[0] = flowerIn;                   // take the Flower and put it in the array at index 0 (the only array position there is in this case)
        Object flowerOut = disarray[0];           // then get it out of the array. what you've done: Flower through this array (called disarray)
        System.out.println(flowerOut.toString()); // this line is optional, but I added it so there's written proof that the Flower has been through its journey in and out of disarray
    }
}
