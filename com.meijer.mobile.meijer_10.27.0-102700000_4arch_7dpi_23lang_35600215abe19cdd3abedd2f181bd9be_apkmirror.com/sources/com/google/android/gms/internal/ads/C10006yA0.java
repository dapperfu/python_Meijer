package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.yA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10006yA0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f80168a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Looper f80169b = null;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f80170c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f80171d = 0;

    public C10006yA0(Looper looper) {
    }

    public final Looper a() {
        Looper looper;
        synchronized (this.f80168a) {
            try {
                if (this.f80169b == null) {
                    boolean z10 = false;
                    if (this.f80171d == 0 && this.f80170c == null) {
                        z10 = true;
                    }
                    C8086gC.f(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f80170c = handlerThread;
                    handlerThread.start();
                    this.f80169b = this.f80170c.getLooper();
                }
                this.f80171d++;
                looper = this.f80169b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this.f80168a) {
            try {
                C8086gC.f(this.f80171d > 0);
                int i10 = this.f80171d - 1;
                this.f80171d = i10;
                if (i10 == 0 && (handlerThread = this.f80170c) != null) {
                    handlerThread.quit();
                    this.f80170c = null;
                    this.f80169b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
