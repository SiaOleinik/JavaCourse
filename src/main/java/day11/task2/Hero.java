package day11.task2;

public abstract class Hero {
   protected int health;
   protected double physDef;
   protected double magicDef;
   protected int physAtt;

   public Hero(int health, double physDef, double magicDef, int physAtt){
       this.health = health;
       this.physDef = physDef;
       this.magicDef = magicDef;
       this.physAtt = physAtt;
   }

 }
