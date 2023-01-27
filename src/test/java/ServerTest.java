import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {

    Server server;
    Guest anna;
    Guest john;

    @BeforeEach
    public void setUp(){
        server = new Server();
        anna = new Guest ("Anna",20,5,50,false,'£',"Vodka");
        john = new Guest("John",15,4,49,true,'$',"Water");
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeAge_true(){

        assertThat(server.canServeGuest(anna)).isEqualTo(true);
    }
    @Test
    public void canServeAge_false(){
        assertThat(server.canServeGuest(john)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canServeMoney_true(){
        assertThat(server.canServeGuest(anna)).isEqualTo(true);
    }
   @Test
    public void canServeMoney_false(){
        assertThat(server.canServeGuest(john)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canServeSober_true(){
        assertThat(server.canServeGuest(anna)).isEqualTo(true);
    }
    @Test
    public void canServeSober_false(){
        assertThat(server.canServeGuest(john)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void canServeNotBanned_true(){
        assertThat(server.canServeGuest(anna)).isEqualTo(true);
    }
    @Test
    public void canServeNotBanned_false(){
        assertThat(server.canServeGuest(john)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void canServeCurrency_true(){
        assertThat(server.canServeGuest(anna)).isEqualTo(true);
    }
    @Test
    public void canServeCurrency_false(){
        assertThat(server.canServeGuest(john)).isEqualTo(false);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    @Test
    public void canServeFavourite_true(){
        assertThat(server.canServeGuest(anna)).isEqualTo(true);
    }
    @Test
    public void canServeFavourite_false(){
        assertThat(server.canServeGuest(john)).isEqualTo(false);
    }
    //  (give server a list of drinks (strings) it can make)

}
