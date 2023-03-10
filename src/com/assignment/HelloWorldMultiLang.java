package com.assignment;

public class HelloWorldMultiLang {
    public static void main(String[] args) {
        String  language = "English";
        String message;
        switch (language) {
            case "English":
                message = "Hello world!";
                break;
            case "Afrikaans":
                message = "Hallo Wêreld";
                break;
            case "Albanian":
                message = "Përshendetje Botë!";
                break;
            case "Amharic":
                message = "ሰላም ልዑል!";
                break;
            case "Arabic":
                message = "مرحبا بالعالم!";
                break;
            case "Armenian":
                message = "Բարեւ աշխարհ!";
                break;
            case "Assamese":
                message = "নমস্কাৰ বিশ্ব!";
                break;
            case "Aymara":
                message = "¡Aski urukipanaya Uraqpacha!";
                break;
            case "Azerbaijani":
                message = "Salam Dünya!";
                break;
            case "Bambara":
                message = "Bonjour Diɲɛ!";
                break;
            case "Basque":
                message = "Kaixo Mundua!";
                break;
            case "Belarusian":
                message = "Прывітанне Сусвет!";
                break;
            default: message = "Invalid language";
                break;


        }
        System.out.println(message);


        System.out.println("Hello World!");
        System.out.println("Hallo Wêreld!");                 // Afrikaans
        System.out.println("Përshendetje Botë!");            // Albanian
        System.out.println("ሰላም ልዑል!");                      // Amharic
        System.out.println("مرحبا بالعالم!");                // Arabic
        System.out.println("Բարեւ աշխարհ!");                 // Armenian
        System.out.println("নমস্কাৰ বিশ্ব!");                    // Assamese
        System.out.println("¡Aski urukipanaya Uraqpacha!");  // Aymara
        System.out.println("Salam Dünya!");                  // Azerbaijani
        System.out.println("Bonjour Diɲɛ!");                 // Bambara
        System.out.println("Kaixo Mundua!");                 // Basque
        System.out.println("Прывітанне Сусвет!");            // Belarusian

    }
}
