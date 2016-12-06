/* This program can combine two Strings from two String arrays. *
 * Create new quotes and maybe you'll have fun! Or not. [Ethan Klein Cough™] */

class Quote {
    private int part1;
    private int part2;

    public static String[] part1quotes = {
        "Wow, Ethan! Great moves! ",  // this is 0, yup, it starts from 0
        "Chub ",                      // 1
        "VAPE ",                      // 2
        "Kissing prank, ",            // 3...
        "Papa ",
        "SEAN, GET MY ",
        "I'm gonna make you jizz",
        "Is that a Air? ",
        "Cover all 9000 taste buds ",
        "Aerate it ",
        "Warm it up ",
        "Drive it up ",
        "That cream ",
        "Pure vanilla ",
        "Sweetness. Mmm. ",
        "It's time ",
        "U smart. U ",
        "Go buy your ",
        "kissing pranks, grabbing boobs, sex, kissing strangers, gone sexual, cum pranks ",
        "Best kissing pranks ",
        "Kissing sex tutorial blowjob sex for couples ",
        "An unoriginal, hee hee! Productions ... ",
        "Kissing pranks fuck sex blowjob cum shit fuck my ass fuck granny ",
        "You know Cameron Carpenter doesn't use anything by Apple. ",
        "You wanna get laid? ",
        "You need a new hobby. "
    };

    public static String[] part2quotes = {
        "Keep it up! Proud of you!", // 0
        "and Tuck",                  // 1
        "NATION",                    // 2
        "NAYSH, Y'ALL",              // 3...you know the drill
        "GONE SEXUAAAAAAAAAAAAL!!!", // guess what number this is. u smart. u loyal.
        "Bless",
        "ENEMA BUCKET, DUDE",
        "cuzzi with me tonight",
        "Is that a MacBook Air?",
        "That's a 10.",
        "to STOP!",
        "loyal. U a genius!",
        "momma a house.",
        "and SoFlo's stick'n' ting-dong, kissing pranks online, sex? With strangers?",
        "is at Venice Beach!",
        "gone sexy gone outrageous gone wrong",
        "And I'm ready to crunch.",
        "granny with fuckin' flabby tits in my mouth shit in a baby's asshole",
        "sex? With strangers?",
        "Being outraged isn't a hobby.",
        "BIIIIIIIIITCH!!!"
    }; // you can always add more ;)

    public Quote (int part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public String toString () {
        return part1quotes[part1] + part2quotes[part2];
    }
}

class QuoteMaker {
    public static void main (String[] args) {
        int part1quotes = Quote.part1quotes.length;
        int part2quotes = Quote.part2quotes.length;
        if (args.length==0) {
            System.out.println("\n\n\n\n\n\n\n\nWelcome to QuoteMaker, a shit CLI program.\n\n\n"+
            "While referring to the source code, most notably the two String arrays in the \n"+
            "Quote class, you need to invoke this program with the code of the first part \n"+
            "of the quote, and then the second part of the quote. E.G. to get 'VAPE NATION',\n"+
            "where 'VAPE' is part 1 quote 2 and 'NATION' is part 2 quote 2, you need to type\n"+
            "in your command line: java QuoteMaker 2 2\n\n"+
            "For this configuration, argument numbers range from 0 0 to " + --part1quotes + " " + --part2quotes + ".\n\n"+
            "You can add more Strings in the arrays of the Quote class for more quotes.\n\n");
        } else {
            try { // the heart of the program. just 4 lines (excluding the Quote class). the rest is all error management
                int part1 = Integer.parseInt(args[0]);
                int part2 = Integer.parseInt(args[1]);
                Quote quote = new Quote(part1, part2);
                System.out.println(quote.toString());
            } catch (java.lang.ArrayIndexOutOfBoundsException dumbass) {
                System.err.println("Shame! Bad moves! Stop it! Disappointed in you!");
                System.out.println("\n"+
                "Invalid arguments. Numbers are too small or too large, or you only typed one\n"+
                "argument (you need two integer numbers as arguments).\n"+
                "For this configuration, argument numbers range from 0 0 to " + --part1quotes + " " + --part2quotes + ".\n"+
                "For more help, run with no arguments.\n");
            } catch (java.lang.NumberFormatException bradberry) {
                System.err.println("Shame! Bad moves! Stop it! Disappointed in you!");
                System.out.println("\n"+
                "Invalid arguments. Please type two integer numbers as arguments, ranging \nfrom 0 0 to " + --part1quotes + " " + --part2quotes + ".\n"+
                "For more help, run with no arguments.\n");
            }
        }
    }
}
