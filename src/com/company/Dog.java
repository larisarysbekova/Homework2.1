package com.company;


public final class Dog extends Pet {

  private String name ;
  private String breed;
  private  String commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog(){

    }
    public Dog(String name, String breed, Color color, Shelter shelter) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
    }
    public Dog (String name, String breed, Color color , Shelter shelter, String commands){
        super.setColor(color);
        super.setShelter(shelter);
        this.name=name;
        this.breed = breed;
        this.commands = commands;

    }
    public void makeVoice() {
        System.out.println("Гав-гав");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Гав-гав ");
        }
        System.out.println();
    }


    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println(voice);
    }
    public String getInfo(){
        return " Кличка="+ name
                + " Порода="+breed
                +" Команда="+commands + super.getInfo();

    }
}
