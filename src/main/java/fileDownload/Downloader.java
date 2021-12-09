package fileDownload;

public class Downloader {
    public static void main(String[] args) throws InterruptedException {
        FileDownloadLogicImplementer run = new FileDownloadLogicImplementer();
        run.openBrowser();
        run.downloadFile();
        run.checkTheDownloadedFileInThePath();
        run.closeBrowser();
    }
}
