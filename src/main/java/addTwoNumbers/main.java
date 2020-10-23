package addTwoNumbers;

public class main {

    public main() {
    }

    public listNode addTwoNumbers(listNode l1, listNode l2) {
        return addListNodes(l1, l2, false);
    }

    private listNode addListNodes(listNode l1, listNode l2, boolean carryOver) {
        int carry = carryOver ? 1 : 0;
        int added = l1.val + l2.val + carry;
        int val = added > 9 ? added % 10 : added;
        if ( l1.next != null || l2.next != null) {
            listNode l1Next = l1.next != null ? l1.next : new listNode(0);
            listNode l2Next = l2.next != null ? l2.next : new listNode(0);
            return new listNode(val, addListNodes(l1Next, l2Next, added > 9));
        } else {
            return added > 9 ? new listNode(val, new listNode(1)) : new listNode(val);
        }
    }
}

