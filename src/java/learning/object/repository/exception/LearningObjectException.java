/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.object.repository.exception;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class LearningObjectException extends Throwable{
    
    public LearningObjectException(String message) {
        super(message);
    }

    public LearningObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public LearningObjectException(Throwable cause) {
        super(cause);
    }
    
}
