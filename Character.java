package com.mycompany.textrpg3;

public abstract class Character {
    
    //variables / atributes all characters have
      public String name;
      public int maxHp, hp, xp;
      
      //constructor for character

    public Character(String name, int maxHp, int xp) {
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }
      
      
      //methods every characters has
      public abstract int attack();
      public abstract int defend();
}
