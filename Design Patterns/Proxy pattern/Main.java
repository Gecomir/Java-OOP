package DesignPatterns.proxyPattern;

public class Main {
    public static void main(String[] args) {
        Animal lion = new LionProxy();
        lion.speak();
    }
}
