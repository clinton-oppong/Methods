public class Main {
    public static void main(String[] args) {

        calculateScore(false, 1500, 5, 100);//#calling a method

// # PRACTICE PRACTICE PRACTICE
        int calculatehighscore = calculatehighscore(1500);
        displayposition("flint", calculatehighscore);

        calculatehighscore = calculatehighscore(900);
        displayposition("square", calculatehighscore);

        calculatehighscore = calculatehighscore(400);
        displayposition("sponge", calculatehighscore);

        calculatehighscore = calculatehighscore(50);
        displayposition("bob", calculatehighscore);
    }


    //created method  in the main class
    public static int calculateScore(boolean GameOver, int Score, int LevelCompleted, int bonus) {

     /*   if (Score < 500 || Score > 200) {
            System.out.println("your is between these two conditions");
        } else if (Score < 1000) {
            System.out.println("your score was less\n");
        } else {
            System.out.println("its cool right");
        }
*/
        if (GameOver) {
            int finalScore = Score + (LevelCompleted * bonus);
            finalScore += 1500;
            System.out.println("the final game score is : " + finalScore);
            return finalScore;
        }
        return -1;
    }

    //# PRACTICE PRACTICE PRACTICE
    public static void displayposition(String player, int highscore) {
        System.out.println(player + " managed to get in position\n" + highscore + " on the high score table");
    }

    public static int calculatehighscore(int palyerscore) {
        // int position = 4;
        if (palyerscore >= 1000) {
            return 1; //# position = 1;
        } else if (palyerscore >= 500 && palyerscore < 1000) {
            return 2; //# positon = 2;
        } else if (palyerscore >= 100 && palyerscore < 500) {
            return 3; //# position = 3;
        } else {
            return 4; //# positon
        }
    }

    //# MEthod overloading is a feature that allows you to have one or more methods with
    //# with the same name but different paramemters " public satic void main(int int, string string)"


}