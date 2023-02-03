package PractisProgramInJava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNG {

    @Test(dataProvider = "logintestdata",dataProviderClass = Customdataprovider.class)
    public void logintest(String email, String pws) {
        System.out.println(email + " " + pws);

    }
}







