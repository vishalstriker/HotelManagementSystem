/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import javax.ejb.Local;

/**
 *
 * @author Vishal
 */
@Local
public interface UserLOgin_SessionBeanLocal {
    
     public boolean ISLogin(String username , String psw);
}
