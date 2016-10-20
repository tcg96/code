/* This program can combine two Strings from two String arrays.
 * Create new quotes and maybe you'll have fun! Or not. [Ethan Klein Cough™] */

class Quote {
    private int part1;
    private int part2;

    public String[] part1quotes = {"Wow, Ethan! Great moves! ",  // this is 0, yup, it starts from 0
                                   "Chub ",                      // 1
                                   "VAPE ",                      // 2
                                   "Kissing prank, ",            // 3...
                                   "Papa ",
                                   "SEAN, GET MY ",
                                   "I'm gonna make you jizz"
                                   };

    public String[] part2quotes = {"Keep it up! Proud of you!", // 0
                                   "and Tuck",                  // 1
                                   "NATION",                    // 2
                                   "NAYSH, Y'ALL",              // 3...you know the drill
                                   "GONE SEXUAAAAAAAAAAAAL!!!", // guess what number this is. u smart. u loyal.
                                   "Bless",
                                   "ENEMA BUCKET, DUDE",
                                   "cuzzi with me tonight"
                                   };
                                   // you can always add more ;)

    public Quote (int part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public String toString (Quote q) {
        return part1quotes[q.part1] + part2quotes[q.part2];
    }
}

class QuoteMaker {
    public static void main (String[] args) {
        if (args.length==0) {
            System.err.println("Shame! Bad moves! Stop it! Disappointed in you!");
            System.out.println("\n"+
            "While referring to the source code, most notably the two String arrays in the Quote class, \n"+
            "you need to invoke this program with the code of the first part of the quote, and then the \n"+
            "second part of the quote. e.g. to get 'VAPE NATION', where 'VAPE' is part 1 quote 2 and \n"+
            "'NATION' is part 2 quote 2, you need to type in your command line: java QuoteMaker 2 2");
        }
        else {
            int part1 = Integer.parseInt(args[0]); // I probably need a "try/catch" exception thing that shows the error above if you type something that throws an exception (String that can't be converted to int, too small or too big int), but I don't know how to do it
            int part2 = Integer.parseInt(args[1]);
            Quote quote = new Quote(part1, part2);
            System.out.println(quote.toString(quote));
        }
    }
}
