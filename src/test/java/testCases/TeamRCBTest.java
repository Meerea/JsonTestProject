package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.GetJsonData;

public class TeamRCBTest {
    @BeforeTest
    public void fileSetup(){
        GetJsonData.readJsonData("TeamRCB");
        GetJsonData.getData();
        System.out.println("before test");
    }

    @Test
    public void test1_verifyCountOfForeignPlayers() {
        Assert.assertTrue(GetJsonData.countForeignPlayers==4);
    }

    @Test
    public void test1_verifyCountOfWicketKeeper(){
        Assert.assertTrue(GetJsonData.countWicketKeeper>=1);
    }
}

