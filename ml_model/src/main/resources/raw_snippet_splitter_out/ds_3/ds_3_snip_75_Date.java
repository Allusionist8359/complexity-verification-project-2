package snippet_splitter_out.ds_3;
public class ds_3_snip_75_Date {
public void Date(int daysSince1970) { // return type void added to allow compilation

        long l = (long) daysSince1970 * 24 * 60 * 60 * 1000;
        java.util.Date d = new java.util.Date(l);
        Calendar cal = Calendar.getInstance();
    }
}