package jia.oops.assignment1;

public class Doll {
    private boolean interactive;
    private String name;


    //Getters
    public boolean getInteractive()
    {
        return interactive;
    }

    public String getName()
    {
        return name;
    }

    //Setters
    public void setInteractive(boolean interactive)
    {
        this.interactive=interactive;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
      if(interactive)
      {
          return name+ " wants to play with you.";
      }
      else {
          return name+ " pretty much just sits there";
      }
    }
}
