package eu.jangos.auth.model;
// Generated 01-f�vr.-2016 22:32:30 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Realmtimezone generated by hbm2java
 */
public class Realmtimezone  implements java.io.Serializable {


     private int id;
     private String name;
     private Set realms = new HashSet(0);

    public Realmtimezone() {
    }

	
    public Realmtimezone(int id) {
        this.id = id;
    }
    public Realmtimezone(int id, String name, Set realms) {
       this.id = id;
       this.name = name;
       this.realms = realms;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getRealms() {
        return this.realms;
    }
    
    public void setRealms(Set realms) {
        this.realms = realms;
    }




}


