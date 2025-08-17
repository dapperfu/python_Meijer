package com.launchdarkly.sdk.android;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
class K {

    /* renamed from: a, reason: collision with root package name */
    private volatile Callable<Void> f91077a = null;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f91078b = Executors.newSingleThreadExecutor();

    K() {
    }
}
