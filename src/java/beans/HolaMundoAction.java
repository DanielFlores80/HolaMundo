/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/Action.java to edit this template
 */
package beans;

import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
/**
 *
 * @author grenn
 */
public class HolaMundoAction extends ActionSupport{
    
    public HolaMundoAction() {
    }
    
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
}
