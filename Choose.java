import java.util.Scanner;

public class Choose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("JUNGLE ESCAPE");
        System.out.println("You're running from a tiger in the jungle!\n");
        
        int location = 0;
        boolean alive = true;
        
        while (alive && location < 3) {
            if (location == 0) {
                System.out.println("You hear a roar behind you!");
                System.out.println("1. Run left toward the river");
                System.out.println("2. Run right toward the trees");
                System.out.print("Choose (1-2): ");
                
                int choice = scanner.nextInt();
                for (int i = 1; i <= 2; i++) {
                    if (choice == i) {
                        if (i == 1) {
                            System.out.println("You sprint toward the river!\n");
                            location = 1;
                        } else {
                            System.out.println("You dash into the thick trees!\n");
                            location = 2;
                        }
                        break;
                    }
                }
            }
            else if (location == 1) {
                System.out.println("You reach the river. The tiger is still chasing!");
                System.out.println("1. Swim across the river");
                System.out.println("2. Hide behind the rocks");
                System.out.print("Choose (1-2): ");
                
                int choice = scanner.nextInt();
                for (int i = 1; i <= 2; i++) {
                    if (choice == i) {
                        if (i == 1) {
                            System.out.println("You swim across safely. The tiger stops at the edge!\n");
                            location = 3;
                        } else {
                            System.out.println("The tiger finds you! Game Over!\n");
                            alive = false;
                        }
                        break;
                    }
                }
            }
            else if (location == 2) {
                System.out.println("The dense trees slow you down. The tiger is catching up!");
                System.out.println("1. Climb up a tall tree");
                System.out.println("2. Run through a cave");
                System.out.print("Choose (1-2): ");
                
                int choice = scanner.nextInt();
                for (int i = 1; i <= 2; i++) {
                    if (choice == i) {
                        if (i == 1) {
                            System.out.println("You climb too slowly. The tiger catches you! Game Over!\n");
                            alive = false;
                        } else {
                            System.out.println("You run through the cave and emerge on the other side free!\n");
                            location = 3;
                        }
                        break;
                    }
                }
            }
        }
        
        if (location == 3) {
            System.out.println("YOU ESCAPED!");
            System.out.println("You made it out of the jungle alive!");
        } else if (!alive) {
            System.out.println("GAME OVER");
            System.out.println("The tiger caught you!");
        }
        
        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
