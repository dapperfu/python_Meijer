package Mu;

import Nu.c;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
final class b extends t {

    /* renamed from: c, reason: collision with root package name */
    private final Handler f21234c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21235d;

    private static final class a extends t.c {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f21236a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f21237b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f21238c;

        @Override // Nu.b
        public void dispose() {
            this.f21238c = true;
            this.f21236a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.t.c
        @SuppressLint({"NewApi"})
        public Nu.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f21238c) {
                return c.a();
            }
            RunnableC0335b runnableC0335b = new RunnableC0335b(this.f21236a, C14313a.u(runnable));
            Message messageObtain = Message.obtain(this.f21236a, runnableC0335b);
            messageObtain.obj = this;
            if (this.f21237b) {
                messageObtain.setAsynchronous(true);
            }
            this.f21236a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f21238c) {
                return runnableC0335b;
            }
            this.f21236a.removeCallbacks(runnableC0335b);
            return c.a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f21238c;
        }

        a(Handler handler, boolean z10) {
            this.f21236a = handler;
            this.f21237b = z10;
        }
    }

    /* renamed from: Mu.b$b, reason: collision with other inner class name */
    private static final class RunnableC0335b implements Runnable, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f21239a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f21240b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f21241c;

        @Override // Nu.b
        public void dispose() {
            this.f21239a.removeCallbacks(this);
            this.f21241c = true;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f21241c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f21240b.run();
            } catch (Throwable th2) {
                C14313a.s(th2);
            }
        }

        RunnableC0335b(Handler handler, Runnable runnable) {
            this.f21239a = handler;
            this.f21240b = runnable;
        }
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new a(this.f21234c, this.f21235d);
    }

    @Override // io.reactivex.t
    @SuppressLint({"NewApi"})
    public Nu.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0335b runnableC0335b = new RunnableC0335b(this.f21234c, C14313a.u(runnable));
        Message messageObtain = Message.obtain(this.f21234c, runnableC0335b);
        if (this.f21235d) {
            messageObtain.setAsynchronous(true);
        }
        this.f21234c.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return runnableC0335b;
    }

    b(Handler handler, boolean z10) {
        this.f21234c = handler;
        this.f21235d = z10;
    }
}
