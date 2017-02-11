/* This program can combine two Strings from two String arrays.
* Create new quotes and maybe you'll have fun! Or not. [Ethan Klein Cough™]
*
* Side note (February 2017): I don't enjoy h3h3Productions' videos as much as I used to.
* I discovered that channel in September 2016, and binge watched their older and funnier videos.
* Now I'm enjoying their videos less, but that's still the only very popular (>3 million subscribers)
* youtube channel whose videos I can stand. I never watch the other very popular youtubers.*/

import java.awt.*; // AWT is obsolete? Well, that's all I was taught when I learned the basics of making a program with a GUI, and remember I'm still a beginner
import java.awt.event.*;
import java.util.*;

class QuoteMakerGUI {
    public static void main (String[] args) { // when I started learning programming, I had no idea the "main" part of programs would be so short compared to the rest
        QMGUI m = new QMGUI();
    }
}

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
        //    "kissing pranks, grabbing boobs, sex, kissing strangers, gone sexual, cum pranks ",      Uncomment (remove the slashes from) these lines if you like maximum vulgarity
        "Best kissing pranks ",
        //    "Kissing sex tutorial blowjob sex for couples ",
        "An unoriginal, hee hee! Productions ... ",
        //    "Kissing pranks fuck sex blowjob cum shit fuck my ass fuck granny ",
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
        //    "and SoFlo's stick'n' ting-dong, kissing pranks online, sex? With strangers?",
        "is at Venice Beach!",
        "gone sexy gone outrageous gone wrong",
        "And I'm ready to crunch.",
        //    "granny with fuckin' flabby tits in my mouth shit in a baby's asshole",
        //    "sex? With strangers?",
        "Being outraged isn't a hobby.",
        "BIIIIIIIIITCH!!!"
    }; // you can always add more ;)

    public Quote(int part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public String toString() {
        return part1quotes[part1] + part2quotes[part2];
    }
}

class QuoteHelp extends Frame {
    int part1quotes = Quote.part1quotes.length; // people over here struggle at writing "length" correctly instead of something like "lenght", I don't
    int part2quotes = Quote.part2quotes.length;
    TextArea help = new TextArea("Welcome to QuoteMaker, a shit GUI program.\n\n\n"+
    "While referring to the source code, most notably the two String arrays in the "+
    "Quote class, you can combine different quotes. \n\nThere are two groups of quotes, "+
    "part 1 and part 2.\nE.G. to get 'VAPE NATION', "+
    "where 'VAPE' is part 1 quote 2 and 'NATION' is part 2 quote 3, you need to type "+
    "'2' in the Part 1 text box and '3' in the Part 2 text box.\n\n"+
    "Quotes start from the number 0. \nFor this configuration, part 1 quotes go up to "+
    --part1quotes + " and part 2 quotes go up to " + --part2quotes + ".\n\n"+
    "You can add more Strings in the arrays of the Quote class for more quotes.\n\n"+
    "Tip: you can press Enter instead of clicking the Go button", 18, 65, TextArea.SCROLLBARS_VERTICAL_ONLY);
    public QuoteHelp() {
        super("Hey what up peeps");
        help.setEditable(false);
        add(help, BorderLayout.CENTER);
        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) { // without this window listener, the X button wouldn't work
                dispose(); // close the window without quitting the program, unlike System.exit(0);
            }
        });
    }
}

class HelpListener implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        QuoteHelp q = new QuoteHelp();
    }
}

class QMListener implements ActionListener {
    Button b; // we have a Button here only for the "Surprise Me" feature
    TextField t1, t2;
    TextArea results;
    public QMListener(Button b, TextField t1, TextField t2, TextArea results) {
        this.b = b;
        this.t1 = t1;
        this.t2 = t2;
        this.results = results;
    }

    public void actionPerformed(ActionEvent a) {
        if (b.getLabel() == "   Surprise Me   ") { // i.e. if you clicked the Surprise Me button
            Random r = new Random();
            int random1 = r.nextInt(Quote.part1quotes.length);
            int random2 = r.nextInt(Quote.part2quotes.length);
            Quote quote = new Quote(random1, random2);
            t1.setText(Integer.toString(random1));
            t2.setText(Integer.toString(random2));
            results.append(quote.toString() + "\n");
        } else { // if you clicked any other button
            try {
                int part1 = Integer.parseInt(t1.getText());
                int part2 = Integer.parseInt(t2.getText());
                Quote quote = new Quote(part1, part2); // here's making a new Quote. e.g. Quote(3, 0); makes a Quote with part 1 quote 3 and part 2 quote 0 (zero is included too)
                results.append(quote.toString() + "\n");
            } catch (java.lang.ArrayIndexOutOfBoundsException dumbass) {
                System.out.println("Error! (" + t1.getText() + " + " + t2.getText() + "). At least one of the numbers you typed is too small or too large");
            } catch (java.lang.NumberFormatException bradberry) {
                System.out.println("Error! (" + t1.getText() + " + " + t2.getText() + "). Please type integer numbers in both text fields");
            }
        }
    }
}

class QMGUI extends Frame { // I know you're not supposed to use abbreviations (like QM for QuoteMaker) in java name variables, but I don't care
    Label p1 = new Label("Part 1:");
    Label p2 = new Label("Part 2:");
    TextField t1 = new TextField(3);
    TextField t2 = new TextField(3);
    TextArea results = new TextArea("", 20, 80, TextArea.SCROLLBARS_VERTICAL_ONLY);
    Button help = new Button("Help");
    Button go = new Button("      Go!      ");
    Button surpriseme = new Button("   Surprise Me   ");
    Panel pp1 = new Panel();
    Panel pp2 = new Panel();
    Panel ppp = new Panel();
    Panel pppp = new Panel();
    ActionListener goOrEnter = new QMListener(new Button(), t1, t2, results); // when you don't click Surprise Me, it doesn't matter what button it is
    public QMGUI() {
        super("Quote Maker");
        pp1.add(p1, BorderLayout.WEST);
        pp1.add(t1, BorderLayout.EAST);
        pp2.add(p2, BorderLayout.WEST);
        pp2.add(t2, BorderLayout.EAST);
        ppp.add(pp1, BorderLayout.WEST);
        ppp.add(pp2, BorderLayout.EAST);
        pppp.add(ppp, BorderLayout.WEST);
        pppp.add(go, BorderLayout.CENTER);
        pppp.add(surpriseme, BorderLayout.SOUTH);
        pppp.add(help, BorderLayout.EAST);
        add(pppp, BorderLayout.CENTER);
        add(results, BorderLayout.SOUTH); // these layouts are a mess, but who cares, it works (if my programming professor reads this, he'll kill me)
        help.addActionListener(new HelpListener());
        go.addActionListener(goOrEnter);
        surpriseme.addActionListener(new QMListener(surpriseme, t1, t2, results));
        t1.addActionListener(goOrEnter);
        t2.addActionListener(goOrEnter);
        pppp.setBackground(Color.GRAY); // I wonder if "Colour" works for non-American people
        results.setBackground(Color.LIGHT_GRAY);
        p1.setForeground(Color.WHITE);
        p2.setForeground(Color.WHITE);
        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() { // without this window listener, the X button wouldn't work
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
    }
}
