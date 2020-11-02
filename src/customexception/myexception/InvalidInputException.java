/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Oct-20
 *  Time: 4:39 PM
 */
package customexception.myexception;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
