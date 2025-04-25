package sampleJava5_1;

public class Rekkyo_3 {

    public enum TrafficLight {
        赤("止まれ"),
        黄色("注意"),
        青("進め");

        private final String message;

        TrafficLight(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + ": " + light.getMessage());
        }
    }
}