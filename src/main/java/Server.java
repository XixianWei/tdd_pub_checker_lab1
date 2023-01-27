import java.util.ArrayList;

public class Server {

    //property
    private ArrayList<String>drinks;

    //constructor
    public Server(){

        drinks = new ArrayList<>();
    }

    //methods
    public void addDrink(String drink){
        drinks.add(drink);
    }





    //Can Serve
    public boolean canServe(Guest guest){
        return drinks.contains(guest.getFavouriteDrink());
    }

    public boolean canServeGuest(Guest guest){
        if(guest.getAge() < 18){
        return false;
        } else if (guest.getMoney()<5) {
            return false;
        } else if(guest.getSober() <50){
            return false;
        }else if (guest.isBanned()){
            return false;
        }else if (guest.getCurrency() != '£'){
            return false;
        }

        else{
            return true;
        }

    }

}
