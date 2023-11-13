import de.tum.cit.ase.Penguin;

public class InterrogationRoom {
    //
    private final String interrogator;
    //Constructor
    public InterrogationRoom(String interrogator ) {
        this.interrogator = interrogator;
    }

    //getter, interrogator为final没有setter
    public String getInterrogator() {
        return interrogator;
    }

    //method interrogate 2 penguins
    //+interrogate(alice: Penguin, bob: Penguin): void
    //方法参数alice & bob都为Penguin类局部变量
    public void interrogate(Penguin alice, Penguin bob){


    }

    public void interrogatorUseTactics(Penguin alice, Penguin bob){

    }

}

