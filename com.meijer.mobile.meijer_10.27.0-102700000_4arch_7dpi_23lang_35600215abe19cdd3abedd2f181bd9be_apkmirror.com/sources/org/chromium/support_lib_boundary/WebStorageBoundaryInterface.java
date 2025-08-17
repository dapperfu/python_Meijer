package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* loaded from: classes13.dex */
public interface WebStorageBoundaryInterface {
    void deleteBrowsingData(Executor executor, Runnable runnable);

    String deleteBrowsingDataForSite(String str, Executor executor, Runnable runnable);
}
