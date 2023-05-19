package tests.MySelf;

import org.testng.annotations.Test;

public class c01 {
    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test(priority = 3)

    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }

    @Test
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }

}

