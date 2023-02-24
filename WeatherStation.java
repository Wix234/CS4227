public class WeatherStation {
    public static void main(String[] args) {

        User p1 = new User(12345, "Pandas");
        User p2 = new User(2323232, "Pandas");

        InterceptorManager interManager = new InterceptorManager(new Target());
        interManager.setFilter(new AuthorisationInterceptor());
        interManager.setFilter(new LoggingInterceptor());

        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setFilterManager(interManager);
        weatherData.sendUserRequest(p1);
        weatherData.sendUserRequest(p2);
        
        
        weatherData.sendRequest(" logging in\n");

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
