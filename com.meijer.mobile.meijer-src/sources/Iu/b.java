package Iu;

import Ju.c;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
final class b extends t {

    /* renamed from: c, reason: collision with root package name */
    private final Handler f15279c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15280d;

    private static final class a extends t.c {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f15281a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15282b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f15283c;

        @Override // Ju.b
        public void dispose() {
            this.f15283c = true;
            this.f15281a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.t.c
        @SuppressLint({"NewApi"})
        public Ju.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f15283c) {
                return c.a();
            }
            RunnableC0247b runnableC0247b = new RunnableC0247b(this.f15281a, C13558a.u(runnable));
            Message messageObtain = Message.obtain(this.f15281a, runnableC0247b);
            messageObtain.obj = this;
            if (this.f15282b) {
                messageObtain.setAsynchronous(true);
            }
            this.f15281a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f15283c) {
                return runnableC0247b;
            }
            this.f15281a.removeCallbacks(runnableC0247b);
            return c.a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f15283c;
        }

        a(Handler handler, boolean z10) {
            this.f15281a = handler;
            this.f15282b = z10;
        }
    }

    /* renamed from: Iu.b$b, reason: collision with other inner class name */
    private static final class RunnableC0247b implements Runnable, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f15284a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f15285b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f15286c;

        @Override // Ju.b
        public void dispose() {
            this.f15284a.removeCallbacks(this);
            this.f15286c = true;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f15286c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f15285b.run();
            } catch (Throwable th2) {
                C13558a.s(th2);
            }
        }

        RunnableC0247b(Handler handler, Runnable runnable) {
            this.f15284a = handler;
            this.f15285b = runnable;
        }
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new a(this.f15279c, this.f15280d);
    }

    @Override // io.reactivex.t
    @SuppressLint({"NewApi"})
    public Ju.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0247b runnableC0247b = new RunnableC0247b(this.f15279c, C13558a.u(runnable));
        Message messageObtain = Message.obtain(this.f15279c, runnableC0247b);
        if (this.f15280d) {
            messageObtain.setAsynchronous(true);
        }
        this.f15279c.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return runnableC0247b;
    }

    b(Handler handler, boolean z10) {
        this.f15279c = handler;
        this.f15280d = z10;
    }
}
