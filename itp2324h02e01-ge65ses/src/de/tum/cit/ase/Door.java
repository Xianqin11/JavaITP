package de.tum.cit.ase;

public class Door {
    private int windowHeight;
    private boolean isOpened;

    public Door() {
        this.windowHeight = 0;
        this.isOpened = false;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    @Override
    public String toString() {
        return "Door{" +
                "windowHeight=" + windowHeight +
                ", isOpened=" + isOpened +
                '}';
    }
}
