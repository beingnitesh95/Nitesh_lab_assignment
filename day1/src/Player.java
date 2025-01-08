public class Player {
    private int id = 1;
    private String name = "Dhoni";
    private int rank = 7;

    private static int playercount = 0;

    //Default constructor
    public Player(){
    }

    //Parameterized constructor
    public Player(int id, String name, int rank){
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public Player(String name, int rank){
        this.id = ++playercount;
        this.name = name;
        this.rank = rank;
    }

    public static int getPlayercount(){
        return playercount;
    }


    public void displayPlayerDetails(){
        System.out.println("Id: "+ id + " name: "+ name+ " rank: "+rank);
    }

}
