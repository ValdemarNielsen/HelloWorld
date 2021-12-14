package Lektion9;

 public class AnsatTAP extends Ansat{
    private float arbejdstimer;
     public AnsatTAP(String name, String institutnavn, float arbejdstimer) {
         super(name, institutnavn);
         this.arbejdstimer = arbejdstimer;
     }

     @Override
     public String toString() {
         return super.toString() + "arbejdstimer= " + arbejdstimer;
     }


}
