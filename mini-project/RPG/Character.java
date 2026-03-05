package RPG;
import java.lang.classfile.TypeAnnotation.SupertypeTarget;
import java.net.SocketTimeoutException;
import java.util.*;
public class Character {
    float hp;
    String name;
    Weapon wp;
    Skill sk;

    public Character(float hp, String name){
        this.hp=hp;
        this.name=name;
    }
        public void Attack(Character ch){
        ch.hp=ch.hp-wp.damage;
        System.out.println(name+" attacked "+ch.name+" with "+wp.name+" and deal "+wp.damage+" damage");
    }
}

class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Character p1=new Character(300, "Charlie");
        Character p2=new Character(300, "Enemy");
        Weapon sword=new Weapon(50,"Excalibur");
        Weapon bow=new Weapon(20,"Libera");
        Skill burn=new Skill(20,"Burn");

        System.out.println("\nHero HP: "+p1.hp);
        System.out.println("Enemy HP: "+p2.hp);

        System.out.println("Pick your weapon: ");
        System.out.println("1. Excalibur (Sword)");
        System.out.println("2. Libera (Bow)");

        int choice=sc.nextInt();
        switch(choice){
            case 1:
                p1.wp=sword;
                break;
            case 2:
                p1.wp=bow;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        p2.wp=bow;
        
        p1.Attack(p2);
        p2.Attack(p1);

        System.out.println("\nHero HP: "+p1.hp);
        System.out.println("Enemy HP: "+p2.hp);

    }
}