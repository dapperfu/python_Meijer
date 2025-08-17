package Pc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.HandlerC6857Jd0;

/* loaded from: classes4.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f25117a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f25118b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f25119c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f25120d = new Object();

    public final Handler a() {
        return this.f25118b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f25120d) {
            try {
                if (this.f25119c != 0) {
                    com.google.android.gms.common.internal.r.m(this.f25117a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f25117a == null) {
                    p0.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f25117a = handlerThread;
                    handlerThread.start();
                    this.f25118b = new HandlerC6857Jd0(this.f25117a.getLooper());
                    p0.k("Looper thread started.");
                } else {
                    p0.k("Resuming the looper thread");
                    this.f25120d.notifyAll();
                }
                this.f25119c++;
                looper = this.f25117a.getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }
}
