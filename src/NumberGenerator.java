public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            try{
                //In ra so tu nhien va hashCode cua doi tuong NumberGenerator
                System.out.println("Number: "+i+", Hashcode: "+this.hashCode());
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
