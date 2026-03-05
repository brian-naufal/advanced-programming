package RPG;

public class Skill {
    String name;
    float damage; 
    
    public Skill(float damage, String name){
        this.name=name;
        this.damage=damage;
    }

    public void useSkill(Character ch){
        ch.wp.damage=ch.wp.damage+damage;
    }

}

