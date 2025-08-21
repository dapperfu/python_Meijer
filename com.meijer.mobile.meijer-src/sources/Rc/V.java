package Rc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.HandlerC6982Jd0;

/* loaded from: classes4.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f32331a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f32332b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f32333c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f32334d = new Object();

    public final Handler a() {
        return this.f32332b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f32334d) {
            try {
                if (this.f32333c != 0) {
                    com.google.android.gms.common.internal.r.m(this.f32331a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f32331a == null) {
                    p0.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f32331a = handlerThread;
                    handlerThread.start();
                    this.f32332b = new HandlerC6982Jd0(this.f32331a.getLooper());
                    p0.k("Looper thread started.");
                } else {
                    p0.k("Resuming the looper thread");
                    this.f32334d.notifyAll();
                }
                this.f32333c++;
                looper = this.f32331a.getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }
}
