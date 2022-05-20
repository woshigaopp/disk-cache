package diskCache.downloader;

import diskCache.DownloadInfo;

public interface FileDownloader {
    boolean exist(DownloadInfo downloadInfo);
    void processDownload(DownloadInfo downloadInfo);
    FileCatcher download(DownloadInfo downloadInfo);
    void createSoftLink(DownloadInfo downloadInfo, FileCatcher fileCatcher);
}
