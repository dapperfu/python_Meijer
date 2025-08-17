package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Gd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6755Gd0 implements InterfaceC6721Fd0 {
    /* synthetic */ C6755Gd0(C6789Hd0 c6789Hd0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6721Fd0
    public final ExecutorService a(ThreadFactory threadFactory, int i10) {
        return b(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6721Fd0
    public final ExecutorService b(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6721Fd0
    public final ExecutorService zza(int i10) {
        return b(1, Executors.defaultThreadFactory(), 2);
    }
}
