package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.sH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9503sH0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C8862mH0 f79030d = new C8862mH0(2, -9223372036854775807L, null);

    /* renamed from: e, reason: collision with root package name */
    public static final C8862mH0 f79031e = new C8862mH0(3, -9223372036854775807L, null);

    /* renamed from: a, reason: collision with root package name */
    private final BH0 f79032a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerC8969nH0 f79033b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f79034c;

    public static C8862mH0 b(boolean z10, long j10) {
        return new C8862mH0(z10 ? 1 : 0, j10, null);
    }

    public final void h() {
        this.f79034c = null;
    }

    public final boolean k() {
        return this.f79034c != null;
    }

    public final boolean l() {
        return this.f79033b != null;
    }

    public C9503sH0(String str) {
        final String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        this.f79032a = C10252zH0.a(Executors.newSingleThreadExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.NU

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f69734a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.f69734a);
            }
        }), new ME() { // from class: com.google.android.gms.internal.ads.kH0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        });
    }

    public final void g() {
        HandlerC8969nH0 handlerC8969nH0 = this.f79033b;
        C8211gC.b(handlerC8969nH0);
        handlerC8969nH0.a(false);
    }

    public final void i(int i10) throws IOException {
        IOException iOException = this.f79034c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC8969nH0 handlerC8969nH0 = this.f79033b;
        if (handlerC8969nH0 != null) {
            handlerC8969nH0.b(i10);
        }
    }

    public final void j(InterfaceC9183pH0 interfaceC9183pH0) {
        HandlerC8969nH0 handlerC8969nH0 = this.f79033b;
        if (handlerC8969nH0 != null) {
            handlerC8969nH0.a(true);
        }
        this.f79032a.execute(new RunnableC9290qH0(interfaceC9183pH0));
        this.f79032a.zza();
    }

    public final long a(InterfaceC9076oH0 interfaceC9076oH0, InterfaceC8755lH0 interfaceC8755lH0, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        C8211gC.b(looperMyLooper);
        this.f79034c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC8969nH0(this, looperMyLooper, interfaceC9076oH0, interfaceC8755lH0, i10, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }
}
