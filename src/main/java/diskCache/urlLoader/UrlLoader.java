package diskCache.urlLoader;

import diskCache.downloader.FileCatcher;

public interface UrlLoader {
    boolean support(String url);
    FileCatcher load(String url, String taskId);
    FileCatcher process(String url, String taskId);
    boolean isUpdate(String url, String tag, String taskId);
}
