package com.mayzhou.learn.multi.thread.lesson1;

/**
 * @Auther: MayZhou
 * @Date: 19/3/20 04:57
 * @Description:
 * @copyright:
 * @version:
 */
public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }
}
