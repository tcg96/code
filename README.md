# code
Some of my programming shit. I use Java because that's what I was taught (and am still being) at university. Note: My programming skills suck. All programs here are ridiculously stupid; some on purpose.

Now, I had three hours to spend at university with nothing to do, so here are more details.

### Install the JDK
If you don’t know Java, you need the JDK (Java SE Development Kit) to compile and run these programs (files ending in `.java` are source code). To install it:
* On Mac, just type `javac` in the Terminal, which will prompt you to install it. If this doesn't work, google "jdk" to download the installer.
* On Linux, type `sudo apt-get install openjdk-8-jdk` in the Terminal. If this doesn’t work, you know another way to install it.
* On Windows, google “jdk” to download the installer. You’ll also have to set the proper environment variables, Google is still your friend. An easier way to install the JDK on Windows is to install the [Chocolatey](https://chocolatey.org/) package manager (which is [useful for other stuff, too](https://chocolatey.org/packages)) and then type `choco install jdk8` in an administrator command prompt. This will automatically download, install, and set the environment variables, like on Mac and Linux.

### Compile Java source code files
To compile Java files, navigate to the folder they are in using your command prompt/terminal, then type: `javac filename.java` (replace `filename` with the real file name). Or type `javac`, a space, and then drag your `.java` file in the terminal/cmd window. Then, press Enter, of course. This will create one or more `.class` files.
To run them, look at the source code, note the name of the class followed by the `public static void main(String[] args)` line, and run: `java ClassName` (**without** `.class` at the end, replacing `ClassName` with the real class name).
- - - -

## Programs

### [FakeIt.java](https://github.com/tcg96/code/blob/master/FakeIt.java)
This program shows you joy by putting a flower through this array called disarray.

### [FakeItOO.java](https://github.com/tcg96/code/blob/master/FakeItOO.java)
This program shows you joy by putting a Flower through this array called disarray. Note how Flower is capitalized this time.

### [Quote.java](https://github.com/tcg96/code/blob/master/Quote.java)
Combine h3h3Productions quotes, or customize it with your own quotes.

Welcome screen (no arguments):
![](readmeimages/QMwelcome.png)

Example quote with right arguments, and two examples with wrong arguments:
![](readmeimages/QMexamples.png)

The third, fourth, fifth…arguments are ignored.

### [TM3.java](https://github.com/tcg96/code/blob/master/TM3.java)
I’m writing this at 12:54 pm. 1+2+5+4 = 12, which is a multiple of 3. What are all the other times which are multiples of 3?

### [The.java](https://github.com/tcg96/code/blob/master/The.java)
Combination of these two dank-ass memes:
![](readmeimages/MX0wViJ.png)
![](readmeimages/The_spongebob.jpg)

### [echo.java](https://github.com/tcg96/code/blob/master/echo.java)
Because the `echo` command built into any shell isn’t good enough.
