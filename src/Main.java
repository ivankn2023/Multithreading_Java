public class Main {
    static int number = -1;
    static int number2 =-2;
    static int amount =0;
    public static void main(String[] args) {

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {

                    try{
                        while (true){
                            if(number == number2){
                                System.out.println("Угаданное число: " + number);
                                System.out.println("Количество попыток: " + amount);
                                break;
                            }
                            else {
                                number2=-1;
                            }
                            number = ((int)(Math.random()*100));
                            amount++;
                            System.out.println(number);

                            Thread.sleep(100);
                        }
                    } catch (Exception e){

                    }

                }
        });
        timer.start();



        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    int i = 0;
                    while (true) {
                        number2 = ((int) (Math.random() * 100));
                        System.out.println(number2+"\n");
                        if (number == number2) break;
                        Thread.sleep(100);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer2.start();
    }
}