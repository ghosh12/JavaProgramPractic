package PractisProgramInJava;

import org.testng.annotations.DataProvider;

public class Customdataprovider {
    @DataProvider(name="logintestdata")
    public Object[][] getdeta()
    {
        Object[][] data={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }
}


