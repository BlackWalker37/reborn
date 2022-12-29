package video5;

import org.junit.jupiter.api.Test;

public class ObjectPractise {
    @Test
    public void workingWithOreders() {
       Order firstOrder = new Order();

       firstOrder.setTotalPrice(12.34);
       firstOrder.setAdress("asdaffsa");
       firstOrder.setItemCount(9);

       Order secondOrder = new Order();
       secondOrder.setTotalPrice(55.67);
       secondOrder.setAdress("asdasfcasw");
       secondOrder.setItemCount(3);

       System.out.println("Hello, world!");
       System.out.println("1st order:");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd order:");
        System.out.println(secondOrder.getTotalPrice());
    }

}
