public class EngineC {

    String type;

    EngineC(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine");
    }

}
