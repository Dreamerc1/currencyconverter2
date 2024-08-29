public interface Currencyconverter {

        double convertCurrency(String sourceCurrency, String destinationCurrency, double amount);
      
        String[] getSupportedCurrencies();
      
        double getExchangeRate(String sourceCurrency, String destinationCurrency);
      }

