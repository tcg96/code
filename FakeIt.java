/* The song "Fake It" by Bastille from their album "Wild World" has a line
 * that says "Show me joy, flower through disarray", but it sounds like
 * "Show me joy, flower through this array". An array is a programming
 * thing I've heard of. So here's an awful, awful programming joke about
 * it. It may not even be correct. And it is a shame. Heaven, help me. I
 * should kill myself like the person talked about in the song "Blame"
 * from the same album. */

class FakeIt { // this is very much not fake
    public static void main (String[] args) {
    	String flowerIn = "flower"; // get the flower
        String[] thisArray = new String[1]; // create a new array called "thisArray" with only one position (pointless, but doable)
        thisArray[0] = flowerIn; // take the flower and put it in the array at position 0 (the only array position there is in this case)
        String flowerOut = thisArray[0]; // then get it out of the array. what you've done: "flower" through thisArray
    }
}

/* This program won't output anything when run. If you want, you can add 
   the line System.out.println(flowerOut); at the end of the main method
   to make sure the flower has been through its journey in and out of 
   thisArray, or whatever else you want. You've got the source code right
   here, dude. */