package diskCache.downloader;

import diskCache.DownloadInfo;

public abstract class AbstractFileDownloader implements FileDownloader{
    @Override
    public void processDownload(DownloadInfo downloadInfo) {
        if(exist(downloadInfo)) {
            return;
        }
        createSoftLink(downloadInfo, download(downloadInfo));
    }
}
