public class Person 
{
    private String fn, ln;
    private int id;
    private static int last_id = 1000;

    public Person(String fn, String ln, int id) 
    {
        this.fn = fn;
        this.ln = ln;
        this.id = ++last_id;
    }

    public String gFN() { return fn; }
    public String gLN() { return ln; }
    public int gID() { return id; }

    public void pFN() { for (int c = 0; c < 1; c++) System.out.println(this.fn); }
    public void pLN() { for (int c = 0; c < 1; c++) System.out.println(this.ln); }
    public void pID() { for (int c = 0; c < 1; c++) System.out.println(this.id); }

    @Override public String toString() { return "Person{" + "First Name:'" + fn + '\'' + ", Last Name:'" + ln + '\'' + ", ID:" + id + '}'; }

}



    
    



