package eu.jangos.auth.model;
// Generated 01-f�vr.-2016 22:32:30 by Hibernate Tools 4.3.1



/**
 * Parameter1 generated by hbm2java
 */
public class Parameter1  implements java.io.Serializable {


     private Integer id;
     private String param;
     private String val;

    public Parameter1() {
    }

    public Parameter1(String param, String val) {
       this.param = param;
       this.val = val;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getParam() {
        return this.param;
    }
    
    public void setParam(String param) {
        this.param = param;
    }
    public String getVal() {
        return this.val;
    }
    
    public void setVal(String val) {
        this.val = val;
    }




}


