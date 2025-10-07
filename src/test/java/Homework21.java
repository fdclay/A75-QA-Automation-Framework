import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest{
    @Test
    public void renamePlaylist() throws InterruptedException{
        String ExpectedString = "Updated playlist \"Test Pro Playlist2.\"";

        provideEmail("felicia.clay@testpro.io");
        providePassword("ACw0FWOe");
        clickSubmitBtn();
        rightclickPlaylist();
        clickEditPlaylist();
        enterList();

        Assert.assertEquals(getRenamePlaylistSuccessMsg(),ExpectedString);

    };
}
