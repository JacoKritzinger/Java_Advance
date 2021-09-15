package academy.javaprogramming;

public class Main {

    public static void main(String[] args) {


//        // a mile is equal to 1.609344 kilometers
//        double kilometers = (100 * 1.609344);
//        int highScore = 50;
//        if(highScore == 50) {
//            System.out.println("this is an expression");


//        int score = 100;
//        if (score > 99) {
//            System.out.println("you got the high score!");
//            score = 0;
//        }

//        int myVariable = 50;
//        if (myVariable == 50) {
//            System.out.println("Printed");
//        }
//
//        myVariable++;
//        myVariable--;
//        System.out.println("this is a test");
//
//        System.out.println("This is" +
//                "another" +
//                "still more.");
//
//        int anotherVariable = 50;

//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 and greater than 1000");
//        }else if(score < 1000) {
//            System.out.println("Your score is less than 1000");
//        }else{
//            System.out.println("Got here");
//        }
//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score was " + finalScore);
//
//        }
//        boolean gameOver2 = true;
//        int score2 = 10000;
//        int levelCompleted2 = 8;
//        int bonus2 = 200;
//
//        if(gameOver2 == true); {
//            int finalScore2 = score2 =(levelCompleted2 *bonus2);
//        System.out.println("your second final score was " + finalScore2);
//    }
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        calculateScore(gameOver, score, levelCompleted, bonus);
//
//         score = 10000;
//         levelCompleted = 8;
//         bonus = 200;
//
//        calculateScore(gameOver, score, levelCompleted, bonus);
//
//    }
//
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("your second final score was " + finalScore);
//            return finalScore;
//        }
//        return -1;
//        }
//    }
//            boolean gameOver = true;
//            int score = 800;
//            int levelCompleted = 5;
//            int bonus = 100;
//
//            calculateScore(gameOver, score, levelCompleted, bonus);
//
//            score = 10000;
//            levelCompleted = 8;
//            bonus = 200;
//
//            calculateScore(gameOver, score, levelCompleted, bonus);
//
//            displayHighScorePosition("Bob", calcHighScorePosition(1500));
//            displayHighScorePosition("Rob", calcHighScorePosition(900));
//            displayHighScorePosition("Bobert", calcHighScorePosition(400));
//            displayHighScorePosition("Bobby", calcHighScorePosition(50));
//
//
//        }
//
//
//        public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus){
//
//
//            if (gameOver) {
//                int finalScore = score + (levelCompleted * bonus);
//                finalScore += 2000;
//                System.out.println("your second final score was " + finalScore);
//                return finalScore;
//            }
//            return -1;
//        }
//
//        public static void displayHighScorePosition (String playerName,int HighScorePosition){
//            System.out.println(playerName + "Managed to get into position " + HighScorePosition + " on the High Score Table");
//        }
//
//        public static int calcHighScorePosition ( int playerScore){
//            if (playerScore >= 1000) {
//                return 1;
//            } else if (playerScore >= 500) {
//                return 2;
//            } else if (playerScore >= 100) {
//                return 3;
//            }
//            return 4;
//        }

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
////            return 1;
////        } else if(playerScore >= 500) {
////            return 2;
////        } else if(playerScore >= 100) {
////            return 3;
////        }
////
////        return 4;
        int position = 4;  // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100); {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

}