/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Oct-20
 *  Time: 4:32 PM
 */
package main;

import java.io.IOException;

//we are going to create a method which ill print the object, if object is null it will raise
// IOException
public class DemoException2 {
    public static void main(String[] args) {
        DemoException2 obj = new DemoException2();
        String s = null;
        try {
            obj.print(s);
        }catch (IOException e) {
            System.out.println(e);
        }

    }

    public void print(Object obj) throws IOException{
        if(obj != null){
            System.out.println(obj);
        }
        else{
            throw new IOException("Object cannot be null");
        }
    }
}
