import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

class Animal{
    String name;
    String voice;

    public Animal (String name , String voice){
        this.name = name;
        this.voice = voice;

        System.out.println(name + " has voice " + voice);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of animals : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0 ; i < n ; i++){
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
    
        System.out.print("Enter the voice : ");
        String voice = sc.nextLine();

        Animal a = new Animal(name, voice);
        }

    }

}
