public class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 23;
        boolean currentlyRaining = true;

        if (temperature>25  && currentlyRaining){
            System.out.println("Wear light but take a raincoat");


        } else if (((25<=temperature) && (temperature>=20)) && currentlyRaining){
            System.out.println("Wear light waterproof jacket");

        } else if (temperature<20 && currentlyRaining){
            System.out.println("Wear a proper waterproof coat");

        } else if (temperature>25 && !currentlyRaining){
            System.out.println("Wear a fantastic dress");

        } else if (temperature<20 && !currentlyRaining){
            System.out.println("Cover yourself with a blanket");

        } else System.out.println("wear whatever you want, I don't care");

    }
}

// Reference https://web.stanford.edu/class/archive/cs/cs108/cs108.1082/106a-java-handouts/HO32IfBoolean.pdf