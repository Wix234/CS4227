public class WeatherStation {
    public static void main(String[] args) {
        boolean canEdit = false;

        User p1 = new User(12345, "Pandas");
        User p2 = new User(2323232, "Pandas");
        User p3 = new User(67890, "Blob");

        InterceptorManager interManager = new InterceptorManager(new Target());
        interManager.addInterceptor(new AuthorisationInterceptor());
        interManager.addInterceptor(new LoggingInterceptor());

        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setFilterManager(interManager);
        canEdit = weatherData.sendUserRequest(p1);

        if(canEdit){
            weatherData.setMeasurements(80, 65, 30.4f);
            canEdit = false;
        }

        canEdit = weatherData.sendUserRequest(p2);
        if(canEdit){
            weatherData.setMeasurements(82, 70, 29.2f);
            canEdit = false;
        }
        
        canEdit = weatherData.sendUserRequest(p3);
        if(canEdit){
            weatherData.setMeasurements(78, 90, 29.2f);
            canEdit = false;
        }
       
        
    }
}
