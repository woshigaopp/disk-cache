package diskCache.urlLoader;

import diskCache.downloader.FileCatcher;

public class HttpLoader extends AbstractUrlLoader {
    @Override
    public boolean support(String url) {
        return false;
    }

    @Override
    public FileCatcher load(String url, String taskId) {
        return null;
    }

    @Override
    public boolean isUpdate(String url, String tag, String taskId) {
        return false;
    }
}
