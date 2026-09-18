public class CarC {

    String model;
    int year;
    EngineC engineC;

    CarC(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engineC = new EngineC(engineType);
    }

    void start(){
        this.engineC.start();
        System.out.println("The " + this.model + " is running");
    }

}
