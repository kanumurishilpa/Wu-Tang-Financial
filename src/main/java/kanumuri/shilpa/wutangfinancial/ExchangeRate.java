package kanumuri.shilpa.wutangfinancial;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/12/17.
 */
public class ExchangeRate {

    public double currencyConverter(double usd, double fromCurrency , double toCurrency){

        double fromCurrencyToUSD = usd/fromCurrency;
        double toCurrencyToUSD = usd/toCurrency;

        return fromCurrencyToUSD/toCurrencyToUSD;

    }

}
