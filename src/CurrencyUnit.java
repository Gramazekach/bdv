import java.net.URLConnection;
import java.util.Scanner;
import java.util.Currency;
import java.util.*;

public class CurrencyUnit {
    public void givenCurrencyCode_whenString_thanExist() {
        Scanner sc = new Scanner(System.in);
        CurrencyUnit usd = Monetary.getCurrency("USD");
        int id = sc.nextInt();
        String name = sc.next();

        private void assertNotNull(CurrencyUnit usd) {
        }
        assertNotNull(usd);
        assertEquals(usd.getCurrencyCode(name), "USD");
        assertEquals(usd.getNumericCode(id), 840);
        assertEquals(usd.getDefaultFractionDigits(), 2);
    }


}
