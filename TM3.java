/* This program prints out all times whose digits add up to a multiple of 3. I made this out of sheer boredom */

class TM3 { // times modulo 3
    public static void main (String[] args) {
        int h = 0;
        int m = 0;
        while (h < 24) {
            while (m < 60) {
                if ((h + m) % 3 == 0) // this uses a modulo operation and relies on the property that lets you know if a number is divisible by 3
                    System.out.print(String.format("%02d", h)+":"+String.format("%02d", m)+" "); // the String.format stuff adds leading zeros, including on the hours even if I'm not a fan of that, so everything is lined up if you have a wide enough terminal
                m++;
            }
            System.out.println();
            h++;
            m = 0;
        }
    }
}