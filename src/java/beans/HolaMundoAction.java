/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/Action.java to edit this template
 */
package beans;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author grenn
 */
public class HolaMundoAction extends ActionSupport{
    //Logger log = LogManager.getLogger(HolaMundoAction.class);
    private String saludosAtr;

    
    @Override
    public String execute() throws Exception {
        this.saludosAtr = "Hola mundo desde Struts 2";
        return "exito";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
}
