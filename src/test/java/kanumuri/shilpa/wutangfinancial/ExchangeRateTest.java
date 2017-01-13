package kanumuri.shilpa.wutangfinancial;

import kanumuri.shilpa.wutangfinancial.ExchangeRate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ExchangeRateTest {

    ExchangeRate exchangeRate;

    @Before
    public void setUp(){

        exchangeRate = new ExchangeRate();
    }

    @Test
    public void usdToEuro(){
        double expected = 0.9400000000000001;
        double actual = exchangeRate.currencyConverter(1,1,.94);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void euroToUsd(){
        double expected = 1.0638297872340425;
        double actual = exchangeRate.currencyConverter(1,0.94,1);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void euroToBp(){
        double expected = 0.8723404255319149;
        double actual = exchangeRate.currencyConverter(1,0.94,0.82);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void bPToIr(){
        double expected = 83.3170731707317;
        double actual = exchangeRate.currencyConverter(1,0.82, 68.32);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void irToCd(){
        double expected = 0.019320843091334895;
        double actual = exchangeRate.currencyConverter(1,68.32, 1.32);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void cdToSd(){
        double expected = 1.0227272727272727;
        double actual = exchangeRate.currencyConverter(1,1.32, 1.35);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void sDToSf(){
        double expected = 0.7481481481481481;
        double actual = exchangeRate.currencyConverter(1,1.35, 1.01);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void sfToMr(){
        double expected = 4.425742574257425;
        double actual = exchangeRate.currencyConverter(1,1.01, 4.47);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void mrToJy(){
        double expected = 25.914988814317674;
        double actual = exchangeRate.currencyConverter(1,4.47, 115.84);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void jYToCyr() {
        double expected = 0.05973756906077348;
        double actual = exchangeRate.currencyConverter(1, 115.84, 6.92);
        Assert.assertEquals(expected, actual, 0);
    }

}
