package jia.pokemonAssignement;

public class Trainer {
    private String name;
    private Pokemon[] team;
    private int currentIndex;

    public Trainer(String name,String[] pokemons)
    {
        this.name=name;
        this.team=new Pokemon[5];
        this.currentIndex=0;
        for(int i=0;i< team.length;i++)
        {
           team[i]=new Pokemon(pokemons[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon[] getTeam() {
        return team;
    }

    public void setTeam(Pokemon[] team) {
        this.team = team;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}
