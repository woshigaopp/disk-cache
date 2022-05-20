package diskCache.urlLoader;

import diskCache.downloader.FileCatcher;

public abstract class AbstractUrlLoader implements UrlLoader {
    @Override
    public FileCatcher process(String url, String taskId) {
        if(support(url)) {
            return load(url, taskId);
        }
        return null;
    }
}
