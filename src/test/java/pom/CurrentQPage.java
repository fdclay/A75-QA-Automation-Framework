package pom;

import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CurrentQPage extends BasePage{
    public CurrentQPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    //By CurrentQMsg = By.xpath("//*[id='queueWrapper']/header/div[2]/h1/text()");
    By CurrentQMsg = By.xpath("//*[@id='queueWrapper']/header/div[2]/h1");
    public String getCurrentQMsg() {
        return findElement(CurrentQMsg).getText();
    }

    By firstSong = By.xpath("//*[@id='queueWrapper']/div/div/div[1]/table/tr[1]");

    public CurrentQPage choose1stSong() {
        doubleClick((By) firstSong);
        return this;
    }

    By AlbumName = By.xpath("//*[@id='extraPanelAlbum']/article/h1/span");
    public String getAlbumName() {
        return findElement(AlbumName).getText();
    }

    By AlbumTab = By.xpath("//*[@id='extraTabAlbum']");
    public CurrentQPage albumTab() {
        click((By) AlbumTab);
        return this;
    }

    By LyricsTab = By.xpath("//*[@id=\'extraTabLyrics']");
    public CurrentQPage lyricsTab () {
        click((By) LyricsTab);
        return this;
    }

   By LyricsName = By.xpath("//*[@id='lyrics']/div/p/span");
    public String getLyricsName() {
        return findElement(LyricsName).getText();
    }

    By ArtistsTab = By.xpath("//*[@id='extraTabArtist']");
    public CurrentQPage ArtistsTab () {
        click((By) ArtistsTab);
        return this;
    }
    By ArtistName = By.xpath("//*[@id='extraPanelArtist']/article/h1/span");
    public String getArtistName() {
        return findElement(ArtistName).getText();
    }

    By InfoBtn = By.xpath("//*[@id='mainFooter']/div[2]/div[2]/div/button[2]");
    public CurrentQPage InfoBtn () {
        click((By) InfoBtn);
        return this;
    }

    By ShuffleArtistBtn = By.xpath("//*[@id='extraPanelArtist']/article/h1/button");
    public CurrentQPage ShuffleArtistBtn () {
        click((By) ShuffleArtistBtn);
        return this;
    }

    By ShuffleAlbumBtn = By.xpath("//*[@id='extraPanelAlbum']/article/h1/button");
    public CurrentQPage ShuffleAlbumBtn () {
        click((By) ShuffleAlbumBtn);
        return this;
    }

    /*@FindBy(css = "[@id='extra']")
    WebElement infoPanel;

    public boolean isInfoPanelDisplay () {
        findElement((By) infoPanel);
        return infoPanel.isDisplayed();
    }*/

}
