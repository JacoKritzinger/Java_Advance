package section_7;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

        //	    Player player = new Player();
//        player.name = "Tim";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Jaco", 150, "Gun");
//        System.out.println("Initial health is " + player.getHealth());
//    }


//97
//    class Movie {
//        private String name;
//
//        public Movie(String name) {
//            this.name = name;
//        }
//
//        public String plot() {
//            return "No plot here";
//        }
//
//        public String getName() {
//            return name;
//        }
//    }
//
//    class Jaws extends Movie {
//        public Jaws() {
//            super("Jaws");
//        }
//
//        public String plot() {
//            return "A shark eats lots of people";
//        }
//    }
//
//    class IndependenceDay extends Movie {
//
//        public IndependenceDay() {
//            super("Independence Day");
//        }
//
//        @Override
//        public String plot() {
//            return "Aliens attempt to take over planet earth";
//        }
//    }
//
//    class MazeRunner extends Movie {
//
//        public MazeRunner() {
//            super("Maze Runner");
//        }
//
//        @Override
//        public String plot() {
//            return "Kids try and escape a maze";
//        }
//    }
//
//    class StarWars extends Movie {
//        public StarWars() {
//            super("Star Wars");
//        }
//
//        @Override
//        public String plot() {
//            return "Imperial Forces try to take over the universe";
//        }
//    }
//
//    class Forgetable extends Movie {
//        public Forgetable() {
//            super("Forgetable");
//        }
//
//        // No plot method
//    }
//
//
//    public class Main {
//
//        public static void main(String[] args) {
//            for(int i=1; i<11; i++) {
//                Movie movie = randomMovie();
//                System.out.println("Movie #" + i +
//                        " : " + movie.getName() + "\n" +
//                        "Plot: " + movie.plot() + "\n");
//            }
//        }
//
//        public static Movie randomMovie() {
//            int randomNumber = (int) (Math.random() * 5) +1;
//            System.out.println("Random number generated was: " + randomNumber);
//            switch (randomNumber) {
//                case 1:
//                    return new Jaws();
//                case 2:
//                    return new IndependenceDay();
//                case 3:
//                    return new MazeRunner();
//                case 4:
//                    return new StarWars();
//                case 5:
//                    return new Forgetable();
//            }
//
//            return null;
//        }
//    }

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}




