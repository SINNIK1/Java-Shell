package org.example;

import org.example.shell.Command;
import org.example.shell.Session;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);
        var session = new Session();

        while (true) {
            System.out.print("$ ");
            String line = scanner.nextLine();

            try (var command = Command.of(session, line)) {
                command.execute();
            }
        }
    }
}