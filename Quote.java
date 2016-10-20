import prog.io.ConsoleInputManager; // you need ConsoleInputManager.class in the directory prog/io, not my file

class Quote {

    private int part1;
    private int part2;

    public String[] part1quotes = {"Wow, Ethan! Great moves!", "Chub", "VAPE"}; // 0 is "Wow, Ethan...", 1 is "Chub", etc.
    public String[] part2quotes = {"Keep it up! Proud of you!", "and Tuck", "NATION", "NAYSH, Y'ALL"}; // 0 is "Keep it up...", 1 is "and Tuck", etc.

    public Quote (int part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public String toString(Quote q) {
        if (q.part1<0 || q.part2<0)
            return "Shame! Bad moves! Stop it! Disappointed in you!";
        return part1quotes[q.part1] + " " + part2quotes[q.part1];
    }
}

class QuoteMaker {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        System.out.println("Type the ID of the first part of the quote:");
        int part1 = in.readInt();
        System.out.println("Type the ID of the last part of the quote:");
        int part2 = in.readInt();
        Quote quote = new Quote(part1, part2); // e.g. "VAPE NATION" is a new Quote(2, 2)
        System.out.println(quote.toString(quote));
    }
}
