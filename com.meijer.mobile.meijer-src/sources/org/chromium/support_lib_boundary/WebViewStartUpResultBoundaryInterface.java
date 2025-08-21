package org.chromium.support_lib_boundary;

import java.util.List;

/* loaded from: classes14.dex */
public interface WebViewStartUpResultBoundaryInterface {
    List<Throwable> getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
