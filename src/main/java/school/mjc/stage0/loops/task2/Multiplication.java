package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if(multiplyByAndToInclusive == 0)
            return;
        else {
            int i = 0;
            while (i <= 5){
                System.out.println(multiplyByAndToInclusive * i++);
            }
        }
    }
}
