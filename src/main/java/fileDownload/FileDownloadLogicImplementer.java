package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;


public class FileDownloadLogicImplementer extends DataProvider {
    WebDriver driver;
    boolean fileFound = false;

    public void openBrowser() {
        driver = initializeDriver();
    }

    public void downloadFile() {
        driver.get(getUrl());
        driver.findElement(By.linkText("Download Excel")).click();
    }

    public void checkTheDownloadedFileInThePath() throws InterruptedException {
        Thread.sleep(3000);
        File fileLocation = new File(filePath());
        File[] totalFilesInLocation = fileLocation.listFiles();
        for (File file : totalFilesInLocation) {
            if (file.getName().equals(getFileName())) {
                fileFound = true;
                System.out.println("File is downloaded and present in the given file path");
                break;
            }
        }
        if (!fileFound) {
            System.out.println("File is not present in the given file path");
        }
    }

    public void closeBrowser() {
        driver.quit();
    }
}
