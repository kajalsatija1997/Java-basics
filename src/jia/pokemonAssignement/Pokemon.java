package jia.pokemonAssignement;

public class Pokemon {

    private String name;
    private int maxAttacks;
    private int hp;

    public Pokemon(String name)
    {
        this.name=name;
        maxAttacks=(int)(Math.random()*11)+10;
        this.hp=50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxAttacks() {
        return maxAttacks;
    }

    public void setMaxAttacks(int maxAttacks) {
        this.maxAttacks = maxAttacks;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString()
    {
        return name + " has "+hp+" hp remaining";
    }

    public void attack(Pokemon enemy)
    {
        //Step 1: Generate a random chance
        //We use a random number from 1 to 100 to decide what happens?
        int chance=(int)(Math.random()*100)+1;

        //Decide the outcome
        //Dodge- 10% chance
        //If the random number is between 1-10
        if(chance<=10)
        {
            System.out.println(enemy.getName()+" dodge the attack");
        }

        //Normal attack - 80% chance
        //If the number is between 11-90
        else if (chance<=90)
        {
            int damage=(int)(Math.random()*maxAttacks)+1;
            enemy.hp= enemy.hp- damage;
            System.out.println(this.name+" attacks "+enemy.name+" for "+damage+"damage!");
        }

        //Charged attack- 10% chance
        //If the number is between 91-100
        else{
            int damage=maxAttacks*3;
            enemy.hp= enemy.hp- damage;
            System.out.println(this.name+" uses a CHARGED ATTACK on "+enemy.name+" for "+damage+" damage!");
        }
        if(enemy.hp<0)
        {
            enemy.hp=0;
        }
        System.out.println(enemy.name+ " HP: "+enemy.hp );
        System.out.println();

    }

}
