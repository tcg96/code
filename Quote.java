/* This program can combine two Strings from an array.
 * Create new quotes and maybe you'll have fun! Or not. This is shit. [Ethan Klein Cough™] */

 class Quote {
    private int part1;
    private int part2;

    public String[] part1quotes = {"Wow, Ethan! Great moves!",  // this is 0
                                   "Chub",                      // 1
                                   "VAPE"};                     // 2

    public String[] part2quotes = {"Keep it up! Proud of you!", // 0
                                   "and Tuck",                  // 1
                                   "NATION",                    // 2
                                   "NAYSH, Y'ALL"};             // 3
                                   // you can always add more ;)

    public Quote (int part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public String toString (Quote q) {
        return part1quotes[q.part1] + " " + part2quotes[q.part2];
    }
}

class QuoteMaker {
    public static void main (String[] args) {
        if (args.length==0)
            System.out.println("Shame! Bad moves! Stop it! Disappointed in you!\n\n"+
            "While referring to the source code, most notably the two String arrays in the Quote class, \n"+
            "you need to invoke this program with the code of the first part of the quote, and then the \n"+
            "second part of the quote. e.g. to get 'VAPE NATION', where 'VAPE' is part 1 quote 2 and \n"+
            "'NATION' is part 2 quote 2, you need to type in your command line: java QuoteMaker 2 2");
        else {
            int part1 = Integer.parseInt(args[0]); // I probably need a "try/catch" exception thing that shows the error above if you type something that throws an exception (not a String, too small or too big int), but I don't know how to do it
            int part2 = Integer.parseInt(args[1]);
            Quote quote = new Quote(part1, part2);
            System.out.println(quote.toString(quote));
        }
    }
}
