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

package datastructureapps;

import org.dakside.jdemo.datastructure.Stack;
import java.util.Scanner;

/**
 * 
 * @author ChinhHD <Hoang Duc Chinh dc.hoang.vn@gmail.com>
 */

public class DataStructureApps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack testStack = new Stack();
        Scanner scan= new Scanner(System.in);
        String textInput = "start";
        int num;
        
        while (!textInput.equals("stop")) {
            System.out.print("What do you want to do next?");
            textInput = scan.nextLine();
            switch (textInput) {
                case "insert":                  
                    System.out.print("Enter a number: ");
                    try {
                        num= scan.nextInt();
                        testStack.push(num);
                        if (testStack.toString()!=null) {
                            System.out.println("The new stack is ");
                            System.out.println(testStack.toString());
                        }
                        else
                            System.out.println("The new stack is null!");}
                    catch (Exception e) {
                        
                    }
                    break;
                case "delete":
                    num = testStack.pop();
                    System.out.printf("%d is deleted \n", num);
                    if (testStack.toString()!=null) {
                        System.out.println("The new stack is ");
                        System.out.println(testStack.toString());
                    }
                    else
                        System.out.println("The new stack is null!");
                    break;
                default:
                    break;            
          }
        }
    }
    
}
