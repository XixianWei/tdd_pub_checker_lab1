import java.util.ArrayList;

public class Guest {

    private String name;
    private int age;
    private int money;
    private int sober;
    private boolean banned;
    private char currency;
    private String favouriteDrink;


    public Guest(String name,int age,int money,int sober,boolean banned,char currency,String favouriteDrink){

        this.name = name;
        this.age = age;
        this.money = money;
        this.sober = sober;
        this.banned = banned;
        this.currency = currency;
        this.favouriteDrink = favouriteDrink;

    }

    public String getName(){

        return name;
    }
    public int getAge(){
        return age;
    }

    public int getMoney(){
        return money;
    }

    public int getSober(){
        return sober;
    }

    public boolean isBanned(){
        return banned;
    }

    public char getCurrency(){
        return currency;
    }

    public String getFavouriteDrink(){
        return favouriteDrink;
    }


}

