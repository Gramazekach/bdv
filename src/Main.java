import java.net.URLConnection;
import java.util.Scanner;
import java.util.Currency;
import java.util.*;
import java.sql.*;
@SpringBootApplication
@RestController

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        int rate;
        profile:
        {
            int id_1 = id;
            String soapAction = "http://www.cbr.ru/scripts/XML_daily.asp";
            URLConnection connection = null;
            connection.setRequestProperty("SOAPAction", soapAction);
        }

        public static Set<Currency> getAllCurrencies() {
            Set<Currency> toret = new HashSet<Currency>();
            Locale[] locs = Locale.getAvailableLocales();

            for(Locale loc : locs) {
                try {
                    Currency currency = Currency.getInstance( loc );

                    if ( currency != null ) {
                        toret.add( currency );
                    }
                } catch(Exception exc)
                {
                    // Locale not found
                }
            }

            return toret;
        }
    }
}