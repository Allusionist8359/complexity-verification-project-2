package snippet_splitter_out.ds_3;
public class ds_3_snip_42_s76 {
public void s76() throws IOException{
        out.writeObject(device.getDriver().getClass().getName());
        out.writeObject(device.getName());

        device.writeData(out);
    }
}