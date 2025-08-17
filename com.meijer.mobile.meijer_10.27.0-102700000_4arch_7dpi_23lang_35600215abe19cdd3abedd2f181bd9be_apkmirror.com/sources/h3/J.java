package h3;

import android.os.HandlerThread;
import android.os.Looper;
import d3.C13466a;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f134192a;

    /* renamed from: b, reason: collision with root package name */
    private Looper f134193b;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f134194c;

    /* renamed from: d, reason: collision with root package name */
    private int f134195d;

    public J() {
        this(null);
    }

    public J(Looper looper) {
        this.f134192a = new Object();
        this.f134193b = looper;
        this.f134194c = null;
        this.f134195d = 0;
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f134192a) {
            try {
                if (this.f134193b == null) {
                    C13466a.g(this.f134195d == 0 && this.f134194c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f134194c = handlerThread;
                    handlerThread.start();
                    this.f134193b = this.f134194c.getLooper();
                }
                this.f134195d++;
                looper = this.f134193b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f134192a) {
            try {
                C13466a.g(this.f134195d > 0);
                int i10 = this.f134195d - 1;
                this.f134195d = i10;
                if (i10 == 0 && (handlerThread = this.f134194c) != null) {
                    handlerThread.quit();
                    this.f134194c = null;
                    this.f134193b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
