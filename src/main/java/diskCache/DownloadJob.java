package diskCache;

import diskCache.downloader.BaseDownloader;


public class DownloadJob implements Runnable {
    private DownloadInfo downloadInfo;

    public DownloadJob(DownloadInfo downloadInfo) {
        this.downloadInfo = downloadInfo;
    }

    @Override
    public void run() {
        new BaseDownloader().processDownload(downloadInfo);
    }
}
