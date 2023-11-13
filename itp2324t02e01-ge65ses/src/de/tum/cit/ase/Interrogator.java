package de.tum.cit.ase;

public class Interrogator {
    private String name;
    private String tactic;

    public Interrogator(String name) {
        this.name = name;
        tactic = "NONE";
    }
    public Interrogator() {
    }

    public String getName() {
        return name;
    }

    public String getTactic() {
        return tactic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }
}
