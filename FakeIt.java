class FakeIt { // this is very much not fake
    public static void main (String[] args) {
    	String flowerIn = "flower"; // get the flower
        String[] thisArray = new String[1]; // create a new array called "thisArray" with only one position (pointless, but possible)
        thisArray[0] = flowerIn; // take the flower and put it in the array
        String flowerOut = thisArray[0]; // then get it out of the array. what you've done: "flower" through thisArray
    }
}