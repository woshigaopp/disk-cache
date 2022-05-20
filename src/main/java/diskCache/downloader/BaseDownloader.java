package diskCache.downloader;

import diskCache.DownloadInfo;

public class BaseDownloader extends AbstractFileDownloader {
    @Override
    public boolean exist(DownloadInfo downloadInfo) {
        return false;
    }

    @Override
    public FileCatcher download(DownloadInfo downloadInfo) {
        return null;
    }

    @Override
    public void createSoftLink(DownloadInfo downloadInfo, FileCatcher fileCatcher) {

    }
}
