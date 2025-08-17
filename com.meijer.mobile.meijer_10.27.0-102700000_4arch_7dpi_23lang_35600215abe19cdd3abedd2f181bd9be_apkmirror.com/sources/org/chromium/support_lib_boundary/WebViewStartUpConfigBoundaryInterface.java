package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* loaded from: classes13.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
