package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.sH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9378sH0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C8737mH0 f78190d = new C8737mH0(2, -9223372036854775807L, null);

    /* renamed from: e, reason: collision with root package name */
    public static final C8737mH0 f78191e = new C8737mH0(3, -9223372036854775807L, null);

    /* renamed from: a, reason: collision with root package name */
    private final BH0 f78192a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerC8844nH0 f78193b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f78194c;

    public static C8737mH0 b(boolean z10, long j10) {
        return new C8737mH0(z10 ? 1 : 0, j10, null);
    }

    public final void h() {
        this.f78194c = null;
    }

    public final boolean k() {
        return this.f78194c != null;
    }

    public final boolean l() {
        return this.f78193b != null;
    }

    public C9378sH0(String str) {
        final String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        this.f78192a = C10127zH0.a(Executors.newSingleThreadExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.NU

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f68894a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.f68894a);
            }
        }), new ME() { // from class: com.google.android.gms.internal.ads.kH0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        });
    }

    public final void g() {
        HandlerC8844nH0 handlerC8844nH0 = this.f78193b;
        C8086gC.b(handlerC8844nH0);
        handlerC8844nH0.a(false);
    }

    public final void i(int i10) throws IOException {
        IOException iOException = this.f78194c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC8844nH0 handlerC8844nH0 = this.f78193b;
        if (handlerC8844nH0 != null) {
            handlerC8844nH0.b(i10);
        }
    }

    public final void j(InterfaceC9058pH0 interfaceC9058pH0) {
        HandlerC8844nH0 handlerC8844nH0 = this.f78193b;
        if (handlerC8844nH0 != null) {
            handlerC8844nH0.a(true);
        }
        this.f78192a.execute(new RunnableC9165qH0(interfaceC9058pH0));
        this.f78192a.zza();
    }

    public final long a(InterfaceC8951oH0 interfaceC8951oH0, InterfaceC8630lH0 interfaceC8630lH0, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        C8086gC.b(looperMyLooper);
        this.f78194c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC8844nH0(this, looperMyLooper, interfaceC8951oH0, interfaceC8630lH0, i10, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }
}
