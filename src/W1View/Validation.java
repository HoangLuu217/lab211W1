/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W1View;

import W1Model.Student;
import java.util.ArrayList;
import java.util.Scanner;


public class Validation {
    public static String getValue(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double getCheckScore(String message, double min, double max) {
        while (true) {
            String input = getValue(message).trim();
            try {
                double value = Double.parseDouble(input);
                if (min < value && value <= max) {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a real number.");
            }
        }
    }
    
    public int getValueInt(String message, int min, int max) {
        while (true) {
            String input = getValue(message).trim();
            try {
                int value = Integer.parseInt(input);
                if(min <= value && value <= max)
                    return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
    
    public boolean checkDuplicate(String id, ArrayList<Student> list){
        boolean checkDuplicated = false;
        for(Student student: list){
            if(student.getId().equals(id)){
                checkDuplicated = true;
                break;
            }
        }
        return checkDuplicated;
    }
    
}

