package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{
    public Paladin(int health, double physDef, double magicDef, int physAtt) {
        super(health, physDef, magicDef, physAtt);
    }

    @Override
    public void healHimself() {
        health+=25;

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health +=10;

    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health >=(this.physAtt-this.physAtt* hero.physDef)) {
            hero.health -= (int) (this.physAtt - this.physAtt * hero.physDef);
        }else{
            hero.health = 0;
        }
    }

    public String toString(){
        return "Paladin {health="+ health+"}";
    }
}
