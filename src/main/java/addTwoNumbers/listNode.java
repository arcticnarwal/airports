package addTwoNumbers;

import java.util.Objects;

public class listNode {
    int val;
    listNode next;

    listNode() {
    }

    public listNode(int val) {
        this.val = val;
    }

    public listNode(int val, listNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return (next != null ? next.toString() : "") + val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        listNode listNode = (addTwoNumbers.listNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
