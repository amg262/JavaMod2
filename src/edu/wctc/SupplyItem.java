package edu.wctc;

public class SupplyItem extends Item {
    private String classroom;

    public SupplyItem(final String name, final String desc, final String classroom) {
        super(name, desc);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(final String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return String.format("Classroom: %s\n%s", classroom, super.toString());
    }
}
