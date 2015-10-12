import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Created by Liliia_Klymenko on 10/12/2015.
 */
public class DownloadFileTest {

    @Test
    public void testDownloadFileFromURL() throws Exception {
        String address = "https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt";
        String fileName = "d://NewTxt.txt";
        File destination = new File(fileName);
        DownloadFile.downloadFileFromURL(address, destination);
        Assert.assertTrue(destination.exists());
    }
}