package snippet_splitter_out.ds_9$bc;
public class ds_9$bc_snip_10_shortenText522 {
public static String shortenText522(String textValue, Control control)
    {
    /* Define local variables. */
    GraphicsContext gc = new GraphicsContext(control);
    Extent extent = gc.textExtent(textValue);
    int maxExtent = extent.x;
    Bounds bounds = control.getBounds();
    int maxWidth = bounds.width - 5;
    /* Define further local variables. */
    int length = textValue.length();
    int start = length/2;
    int end = length/2 + 1;
    /* While the condition holds true, */
    /* override characters between s1 and s2 with ELLIPSIS. */
    while (start >= 0 && end < length) {
    String s1 = textValue.substring(0, start);
    String s2 = textValue.substring(end, length);
    String s = s1 + ELLIPSIS + s2;
    extent = gc.textExtent(s);
    int l = extent.x;
    /* When l is smaller than maxWidth, return s. */
    if (l < maxWidth) {
    gc.dispose();
    return s;
    }
    start--;
    end++;
    }
    return null; // Had to be added to allow compilation
    }
}