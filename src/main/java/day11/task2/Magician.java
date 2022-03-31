package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    private int magicAtt;
    public Magician(int health, double physDef, double magicDef, int physAtt, int magicAtt) {
        super(health, physDef, magicDef, physAtt);
        this.magicAtt = magicAtt;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= (int) (this.magicAtt-this.magicAtt* hero.magicDef);

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
        return "Magician {health="+ health+"}";
    }
}
