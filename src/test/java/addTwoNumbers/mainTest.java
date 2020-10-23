package addTwoNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class mainTest {

    public main cut;

    @BeforeEach
    void setup() {
        cut = new main();
    }

    @Test
    void addTwoNumbers1() {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807
        listNode l1 = new listNode(2, new listNode(4, new listNode(3)));
        listNode l2 = new listNode(5, new listNode(6, new listNode(4)));
        listNode e = new listNode(7, new listNode(0, new listNode(8)));

        assertEquals(e, cut.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers2() {
//        Input: l1 = [0], l2 = [0]
//        Output: [0]
        listNode l1 = new listNode(0);
        listNode l2 = new listNode(0);
        listNode e = new listNode(0);

        assertEquals(e, cut.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers3() {
//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]
        listNode l1 = new listNode(9, new listNode(9, new listNode(9, new listNode(9, new listNode(9, new listNode(9, new listNode(9)))))));
        listNode l2 = new listNode(9, new listNode(9, new listNode(9, new listNode(9))));
        listNode e = new listNode(8, new listNode(9, new listNode(9, new listNode(9, new listNode(0, new listNode(0, new listNode(0, new listNode(1))))))));

        assertEquals(e, cut.addTwoNumbers(l1, l2));
    }
}