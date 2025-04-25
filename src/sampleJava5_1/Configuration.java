package sampleJava5_1;

public class Configuration {

	static String appName;
    static String version;

    
    static {
        appName = "MyApp";
        version = "1.0.0";
    }

    public static void main(String[] args) {
        
        System.out.println("アプリ名: " + appName);
        System.out.println("バージョン: " + version);
    }

}
