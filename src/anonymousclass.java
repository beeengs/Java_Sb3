public class anonymousclass {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        DogAC dogAC1 = new DogAC();
        DogAC dogAC2 = new DogAC(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Rug Roh*");
            }
        };


        dogAC1.speak();



    }
}
