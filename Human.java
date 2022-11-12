public class Human {

    public void pickUp(){
        int min = 1;
        int max = 6;
        int humanA;
        int humanB;
        int humanC;

        humanA = ((int)(Math.random()*(max-min)))+min;
        humanB = ((int)(Math.random()*(max-min)))+min;
        humanC = ((int)(Math.random()*(max-min)))+min;

        if (humanA>humanB && humanA > humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanA with "+humanA+" points is winner!");
        }else if (humanA>=humanB && humanA < humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanC with "+humanC+" points is winner!");
        }else if (humanA>=humanC && humanA < humanB){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanB with "+humanB+" points is winner!");
        }else if (humanA<=humanB && humanB < humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanC with "+humanC+" points is winner!");
        }else if (humanA<=humanB && humanB > humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanB with "+humanB+" points is winner!");
        }else if (humanB==humanC && humanB < humanA){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanA with "+humanA+" points is winner!");
        }else{
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("No winner.");
        }
    }
}
