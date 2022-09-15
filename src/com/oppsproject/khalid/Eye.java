package com.oppsproject.khalid;

public class Eye extends Organs{
    private String color ;
    private boolean isOpend;

    public Eye(String name, String medicalCondition, String color, boolean isOpend) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpend = isOpend;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("color: " + this.getColor());
    }

    public void open(){
        this.setOpend(true);
        System.out.println(this.getName() + " opened");
    }

    public void close(){
        this.setOpend(false);
        System.out.println(this.getName() + "Closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpend() {
        return isOpend;
    }

    public void setOpend(boolean opend) {
        isOpend = opend;
    }
}
