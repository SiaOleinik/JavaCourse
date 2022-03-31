package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int magicAtt;

    public Shaman(int health, double physDef, double magicDef, int physAtt, int magicAtt) {
        super(health, physDef, magicDef, physAtt);
        this.magicAtt = magicAtt;
    }

    @Override
    public void healHimself() {
        if (this.health <= 50) {
            this.health += 50;
        } else {
            this.health = 100;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health <= 70) {
            hero.health += 30;
        } else {
            hero.health = 100;
        }

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= (int) (this.magicAtt - this.magicAtt * hero.magicDef);

    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health >=(this.physAtt-this.physAtt* hero.physDef)) {
            hero.health -= (int) (this.physAtt - this.physAtt * hero.physDef);
        }else{
            hero.health = 0;
        }
    }

    public String toString() {
        return "Shaman {health=" + health + "}";
    }
}
