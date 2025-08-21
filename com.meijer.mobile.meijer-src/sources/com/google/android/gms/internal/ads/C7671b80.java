package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.b80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7671b80 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73563a;

    public C7671b80(InterfaceC10213yy0 interfaceC10213yy0) {
        this.f73563a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.f73563a.zzb();
        C6948Id0.a();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        C9358qy0.b(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
