package day11.task2;

public class Warrior extends Hero implements PhysAttack{

        public Warrior(int health, double physDef, int magicDef, int physAtt) {
        super(health, physDef, magicDef, physAtt);
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
       return "Warrior {health="+ health+"}";
    }


}
