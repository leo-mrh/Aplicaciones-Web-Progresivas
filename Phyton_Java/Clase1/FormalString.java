package edu.utvt.clase1;

public class FormalString {
    public static void main(String[] args) {

        String name = "Axis Almazan";
        String age = "20";

        String message = "hola " + name + " con tu edad actual " + age + ", ya eres mayor de edad.";
        System.out.println(message);

        // Uso de StringBuffer para construir cadenas
        StringBuffer sb = new StringBuffer();
        sb.append("hola xd");
        sb.append(name);
        sb.append(" con tu edad actual ");
        sb.append(age);
        sb.append(", ya eres mayor de edad.");

        System.out.println(sb.toString());

        // Uso de String.format
        String defaultMessage = "hola %s con tu edad actual %s, ya eres mayor de edad.";
        String newMessage = String.format(defaultMessage, name, age);
        System.out.println(newMessage);
    }
}
