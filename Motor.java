public class Beat extends Motor {
    private int jumBan;
    private String jenis;
    
    public Beat(){
        jumBan = 1;
    }
    
    public Beat(int jumBan, String jenis){
        this.jumBan = jumBan;
        this.jenis = jenis;
    }

    @Override
    public void suara() {
        System.out.println("ngueeeeng");
    }   

    public String toString() {
        return "Beat{" + "jumBan=" + jumBan + ", jenis=" + jenis + '}';
    }
    
    
}