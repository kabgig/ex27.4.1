public class Main {
    public static void main(String[] args) {
        FahrenheitAdapter fa = new FahrenheitAdapter();
        fa.showTempInFahrenheit(32);
        fa.showTempInCelcius(0);
    }
}

//old interface
interface Fahrenheit {
    void showTempInFahrenheit(int fahrenheitTemp);
}

//new interface
interface Celcius {
    void showTempInCelcius(int celciusTemp);
}

//new interface implementation
class NewCelciusStation implements Celcius {
    @Override
    public void showTempInCelcius(int celciusTemp){
        System.out.println(celciusTemp);
    }
}

class FahrenheitAdapter extends NewCelciusStation implements Fahrenheit {
    @Override
    public void showTempInFahrenheit(int fahrenheitTemp) {
        showTempInCelcius((fahrenheitTemp - 32) * 5/9);
    }
}