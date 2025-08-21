package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.yA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10131yA0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f81008a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Looper f81009b = null;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f81010c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f81011d = 0;

    public C10131yA0(Looper looper) {
    }

    public final Looper a() {
        Looper looper;
        synchronized (this.f81008a) {
            try {
                if (this.f81009b == null) {
                    boolean z10 = false;
                    if (this.f81011d == 0 && this.f81010c == null) {
                        z10 = true;
                    }
                    C8211gC.f(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f81010c = handlerThread;
                    handlerThread.start();
                    this.f81009b = this.f81010c.getLooper();
                }
                this.f81011d++;
                looper = this.f81009b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this.f81008a) {
            try {
                C8211gC.f(this.f81011d > 0);
                int i10 = this.f81011d - 1;
                this.f81011d = i10;
                if (i10 == 0 && (handlerThread = this.f81010c) != null) {
                    handlerThread.quit();
                    this.f81010c = null;
                    this.f81009b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
