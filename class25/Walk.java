package com.syntax.class25;

interface HealthAble{
    void healthy();
}
public interface Walk extends HealthAble {

    void burnCalories();
}
interface Milk extends HealthAble{

    void giveEnergy();

}
interface Bananna extends HealthAble{

    void giveEnargy();

    void giveEnergy();
}
class Demo implements Bananna{
    @Override
    public void healthy(){
        System.out.println(" bananna is good");
    }
    @Override
    public  void giveEnargy(){
        System.out.println("it gives us energy");
    }

    @Override
    public void giveEnergy() {

    }
}