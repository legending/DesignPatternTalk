package com.legend.dp.c18.memo;

public class GameRole {

    private int vitality;
    private int attack;
    private int defense;

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void display() {
        System.out.println("生命: " + this.vitality);
        System.out.println("攻击：" + this.attack);
        System.out.println("防御：" + this.defense);
	}
	
	public void init() {
        this.vitality = 1000;
        this.attack = 1000;
        this.defense = 1500;
	}
	
	public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
	}

    public RoleStateMemo saveState() {
        return new RoleStateMemo(vitality, attack, defense);
	}

    public void recoverState(RoleStateMemo roleStateMemo) {
        this.vitality = roleStateMemo.getVitality();
        this.attack = roleStateMemo.getAttack();
        this.defense = roleStateMemo.getDefense();
	}
	
}
