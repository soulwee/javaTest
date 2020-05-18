package jvm;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        if(listNode==null){
            return list;
        }
        list.add(listNode.val);
        while(listNode.next!=null){
            listNode = listNode.next;
            list.add(listNode.val);
        }
       for(int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
       }
        return list2;
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("d");
                }

            }
        });
        t.setDaemon(true);
        t.start();
        System.out.println("main exit");
    }
}
