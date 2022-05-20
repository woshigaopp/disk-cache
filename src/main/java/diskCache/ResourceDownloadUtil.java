package diskCache;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ResourceDownloadUtil {
    public static ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 50, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new ThreadPoolExecutor.DiscardPolicy());

    public static void batchDownload(DownloadInfo downloadInfo) {
        executor.submit(new DownloadJob(downloadInfo));
    }
}
