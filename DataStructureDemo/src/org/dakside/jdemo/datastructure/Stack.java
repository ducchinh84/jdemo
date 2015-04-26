/*
 * The MIT License
 *
 * Copyright 2015 Hoang Duc Chinh <dc.hoang.vn@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.dakside.jdemo.datastructure;

/**
 *
 * @author Hoang Duc Chinh <dc.hoang.vn@gmail.com>
 */
public class Stack {
    private Node top;
    private int N;
    
    private class Node {
        int data;
        Node previous;
        public void Node(){
            this.previous = null;
        }
    }
    
    public Stack() {
        top = new Node();        
        N = 0;
    }
    
    public boolean isEmpty() {
        if (top != null && N != 0) {
            return false;
        }
        return true;
    }
    
    public void push(int _data) {
        Node tempNode = new Node();        
        tempNode.data = _data;
        tempNode.previous = top;
        top = tempNode;
        N++;
    }
    
    public int pop() {
        int _data = top.data;
        top = top.previous;
        N--;
        return _data;
    }
    
    @Override
    public String toString() {
        String strStack="";
        Node tempNode = top;
        
        if (isEmpty()) {
            System.out.println("Empty!");
            return null;
        }
        
        while (tempNode.previous != null) {
            strStack = strStack + " " + String.valueOf(tempNode.data);
            tempNode = tempNode.previous;
        }
        return strStack;
    }    
}
