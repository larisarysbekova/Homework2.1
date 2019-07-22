package com.company;

public class Main {

    public static void main(String[] args) {
   Dog dog1 = new Dog();
   dog1.setAge(5);
   dog1.setName("Рекс");
   dog1.setBreed("Овчарка");
   dog1.setCommands("(Стоять, сидеть , кувырок) ");
   dog1.setShelter(new Shelter( "Рай для собак" , "  Исанова 34"));
  dog1.setColor(Color.BLACK);

  Dog dog2 = new Dog("Лайка ", "Хаска",Color.WHITE,new Shelter("Отель для собак","Турусбекова 21"));
  dog2.setCommands( "(Стоять ,  лаять , прыгать)");
  dog2.setAge(3);

  Dog dog3 = new Dog("Шарик", "чихуахуа" ,Color.BROWN,new Shelter("Отель для собак ","Турусбекова 21"));
  dog3.setAge(4);
  dog3.setCommands("(Стоять, голос , след)");
        System.out.println(dog1.getInfo());
       dog1.makeVoice();
        System.out.println(dog2.getInfo());
        dog2.makeVoice(3);
        System.out.println(dog3.getInfo());
        dog3.makeVoice(3);












    }
}
