package com.syntax.Class23;

public class Car {
    void start(){System.out.println("Use keysto start me");}
    void stop(){System.out.println("Use breaks to stop me");}
    void Park(){System.out.println("Park me manually");}
}
class BMW extends Car{
    void start(){System.out.println("Start me with dutton");}
    void stop(){System.out.println("Can use breaks or i can autoBreak");}
    void park(){System.out.println("Use parking sensor to park me");}
}
class Tesla extends Car {
    void start() {System.out.println("Start with app or  remout");
    }
    void stop() {System.out.println("Can use breaks or i can autoBreak");
    }
    void park() {System.out.println("Use parking sensor i can autopark");
    }
}
    class Suzuki extends Car {
        void start() {System.out.println("Push me to start");
        }
        void stop() {System.out.println("I lost my breaks dan tires on the way");}
    }

