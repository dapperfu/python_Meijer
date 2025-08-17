package com.fullstory.instrumentation.frameworks.compose;

import java.util.function.Consumer;

/* loaded from: classes14.dex */
public interface FSComposeChildLayerDependenciesTracker {
    boolean _fsGetTrackingInProgress();

    void _fsWithTracking(Consumer consumer, Runnable runnable);
}
