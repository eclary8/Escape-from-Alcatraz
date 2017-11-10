import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class EscapeFromAlcatrazGame {

    public static void main(String[] args) {
        int levels = 0;
        String input = "";
        while (levels == 0) {
            StdOut.println("Escape from Alcatraz: The Game");
            StdOut.println("Type start to begin.");
            input = StdIn.readString();
            if (input.equals("start")) {
                StdOut.println("Introduction");
                StdOut.println("ALl great stories start with a crime. You have committed a serious crime and have been detained in Alcatraz. You have watched several other prisoners escape and have decided now is your time. Do you think you have what it takes? ");
                levels = 1;
            } else
                StdOut.println("Type start to begin.");

            if (levels == 1) {
                while (!input.equals("yes")) {
                    StdOut.println("Type yes to advance.");
                    input = StdIn.readString();
                }

                if (input.equals("yes")) {
                    StdOut.println("First, you have to escape your cell. You are on your daily permitted walk and realize that a guard left the door open to the break room. You walk in and see a uniform and keys. What will you do? (a)Put the uniform on and pretend to be a guard or (b)Take the keys and slip them into your pocket");
                    input = StdIn.readString();
                    if (input.equals("a")) {
                        StdOut.println("You took too long and were caught. Game over.");
                        levels = 0;
                    } else if (input.equals("b")) {
                        StdOut.println("CAn't touch this! You successfully stole the keys.");
                        levels = 2;
                    }
                } else
                    StdOut.println("Type yes to advance.");

            }

            if (levels == 2) {
                StdOut.println("Now that you have the keys, you can escape, but there is one problem: you have a tracker on your ankle. Outside, you see other prisoners on a boat ready to go, so you have to act fast.");
                StdOut.println("What will you do? (a)Take your chance and run or (b)Try to cut the tracker off");
                input = StdIn.readString();
                if (input.equals("a")) {
                    levels = 3;
                } else if (input.equals("b")) {
                    boolean lucky = false;
                    int count = 0;
                    StdOut.println("You could not get the tracker off. Type try again to try again.");
                    input = StdIn.readString();
                    while (!lucky && count <= 3) {
                        double flip = Math.random();
                        StdOut.println(count);
                        if (flip > 0.5) {
                            lucky = true;
                            levels = 3;
                        } else {
                            StdOut.println("You could not get the tracker off. Type try again to try again.");
                            input = StdIn.readString();
                            count++;

                        }
                    }
                    if (!lucky && count > 3) {
                        StdOut.println("Game Over");
                        levels = 0;
                    }
                }
            }

            if (levels == 3) {
                StdOut.println("TRaining yourself for this day has paid off. You made it through the door!");
                StdOut.println("Now that you are out, you must get on the boat with the other prisoners.");
                StdOut.println("You have two options: (a)Run as fast as you can and jump on the boat or (b)Scope out the prisoners and make sure they are not guards disguised as prisoners");
                input = StdIn.readString();


                if (input.equals("a")) {
                    levels = 4;
                    StdOut.println("AZ you were escaping, you got it all on tape.");
                    StdOut.println("You made it on the boat and you are almost free. You have one more task and it is do or die.");
                    StdOut.println("You may have noticed that the word 'as' was spelled wrong.");
                    StdOut.println("Each time you passed a level and on the introduction line, you received a congratulatory message.");
                    StdOut.println("Each message started with two capital letters. Put all of the letters together and what do they spell?(type your answer)");
                    input = StdIn.readString();
                    if (input.equals("ALCATRAZ")) {
                        StdOut.println("Congratulations! You have successfully escaped Alcatraz!");
                    } else {
                        StdOut.println("You failed. Game over.");
                    }

                } else if (input.equals("b")) {
                    StdOut.println("You were too slow and missed the boat.");
                    StdOut.println("With nowhere to go, the guards found you. Game over.");
                    levels = 0;


                }
            }
        }
    }

    public void printArt(String fileName){
        In reader = new In(fileName);
        while(reader.hasNextLine()){
            StdOut.println(reader.readLine());
        }

    }

}
