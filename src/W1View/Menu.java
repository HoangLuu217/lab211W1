/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W1View;


import java.util.ArrayList;
import java.util.List;


public abstract class Menu {
    private String Type;
    private ArrayList<String> choices;
    private Validation valid = new Validation();

    protected Menu(String type, String[] choices){
        this.Type = type;
        this.choices = new ArrayList<>();
        this.choices.addAll(List.of(choices));
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }


    public void displayMenu(){
        System.out.print("\n");
        System.out.println(Type);
        System.out.println("__________________________");
        for(int i = 0; i < choices.size() - 1; i++){
            System.out.println((i + 1) + "." + choices.get(i));
        }
        System.out.println(0 + "." + choices.getLast());
        System.out.println("__________________________");
    }

    public int getSelected(){
        displayMenu();
        return valid.getValueInt("Enter your choice: ", 0, Integer.MAX_VALUE);
    }
    public abstract void execute(int n);

    public void run(){
        while(true){
            int choice = getSelected();
            if(choice == 0){
                execute(0);
                break;
            } else if(choice > 0){
                execute(choice);
            }
        }
    }



    public void printMenu(){
        displayMenu();
    }
}





