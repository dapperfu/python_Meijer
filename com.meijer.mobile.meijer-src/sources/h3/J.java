package h3;

import android.os.HandlerThread;
import android.os.Looper;
import d3.C13599a;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f134663a;

    /* renamed from: b, reason: collision with root package name */
    private Looper f134664b;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f134665c;

    /* renamed from: d, reason: collision with root package name */
    private int f134666d;

    public J() {
        this(null);
    }

    public J(Looper looper) {
        this.f134663a = new Object();
        this.f134664b = looper;
        this.f134665c = null;
        this.f134666d = 0;
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f134663a) {
            try {
                if (this.f134664b == null) {
                    C13599a.g(this.f134666d == 0 && this.f134665c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f134665c = handlerThread;
                    handlerThread.start();
                    this.f134664b = this.f134665c.getLooper();
                }
                this.f134666d++;
                looper = this.f134664b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f134663a) {
            try {
                C13599a.g(this.f134666d > 0);
                int i10 = this.f134666d - 1;
                this.f134666d = i10;
                if (i10 == 0 && (handlerThread = this.f134665c) != null) {
                    handlerThread.quit();
                    this.f134665c = null;
                    this.f134664b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
