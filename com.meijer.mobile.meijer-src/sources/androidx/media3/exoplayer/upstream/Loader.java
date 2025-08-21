package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d3.C13599a;
import d3.InterfaceC13610l;
import d3.K;
import d3.P;
import d3.r;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import u3.InterfaceExecutorC17347a;

/* loaded from: classes.dex */
public final class Loader {

    /* renamed from: d, reason: collision with root package name */
    public static final c f57189d = g(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f57190e = g(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f57191f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f57192g;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC17347a f57193a;

    /* renamed from: b, reason: collision with root package name */
    private d<? extends e> f57194b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f57195c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th2);
        }
    }

    public interface b<T extends e> {
        c f(T t10, long j10, long j11, IOException iOException, int i10);

        default void o(T t10, long j10, long j11, int i10) {
        }

        void s(T t10, long j10, long j11);

        void v(T t10, long j10, long j11, boolean z10);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f57196a;

        /* renamed from: b, reason: collision with root package name */
        private final long f57197b;

        private c(int i10, long j10) {
            this.f57196a = i10;
            this.f57197b = j10;
        }

        public boolean c() {
            int i10 = this.f57196a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f57198a;

        /* renamed from: b, reason: collision with root package name */
        private final T f57199b;

        /* renamed from: c, reason: collision with root package name */
        private final long f57200c;

        /* renamed from: d, reason: collision with root package name */
        private b<T> f57201d;

        /* renamed from: e, reason: collision with root package name */
        private IOException f57202e;

        /* renamed from: f, reason: collision with root package name */
        private int f57203f;

        /* renamed from: g, reason: collision with root package name */
        private Thread f57204g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f57205h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f57206i;

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f57205h;
                    this.f57204g = Thread.currentThread();
                }
                if (!z10) {
                    K.a("load:" + this.f57199b.getClass().getSimpleName());
                    try {
                        this.f57199b.b();
                        K.b();
                    } catch (Throwable th2) {
                        K.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f57204g = null;
                    Thread.interrupted();
                }
                if (this.f57206i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f57206i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f57206i) {
                    r.e("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f57206i) {
                    return;
                }
                r.e("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f57206i) {
                    return;
                }
                r.e("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(3, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f57199b = t10;
            this.f57201d = bVar;
            this.f57198a = i10;
            this.f57200c = j10;
        }

        private void e() {
            Loader.this.f57194b = null;
        }

        private long f() {
            return Math.min((this.f57203f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f57206i = z10;
            this.f57202e = null;
            if (hasMessages(1)) {
                this.f57205h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f57205h = true;
                        this.f57199b.c();
                        Thread thread = this.f57204g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                e();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C13599a.e(this.f57201d)).v(this.f57199b, jElapsedRealtime, jElapsedRealtime - this.f57200c, true);
                this.f57201d = null;
            }
        }

        public void g(int i10) throws IOException {
            IOException iOException = this.f57202e;
            if (iOException != null && this.f57203f > i10) {
                throw iOException;
            }
        }

        public void h(long j10) {
            C13599a.g(Loader.this.f57194b == null);
            Loader.this.f57194b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f57206i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            e();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f57200c;
            b bVar = (b) C13599a.e(this.f57201d);
            if (this.f57205h) {
                bVar.v(this.f57199b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.s(this.f57199b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    r.e("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f57195c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f57202e = iOException;
            int i12 = this.f57203f + 1;
            this.f57203f = i12;
            c cVarF = bVar.f(this.f57199b, jElapsedRealtime, j10, iOException, i12);
            if (cVarF.f57196a == 3) {
                Loader.this.f57195c = this.f57202e;
            } else if (cVarF.f57196a != 2) {
                if (cVarF.f57196a == 1) {
                    this.f57203f = 1;
                }
                h(cVarF.f57197b != -9223372036854775807L ? cVarF.f57197b : f());
            }
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) C13599a.e(this.f57201d)).o(this.f57199b, jElapsedRealtime, jElapsedRealtime - this.f57200c, this.f57203f);
            this.f57202e = null;
            Loader.this.f57193a.execute((Runnable) C13599a.e(Loader.this.f57194b));
        }
    }

    public interface e {
        void b() throws IOException;

        void c();
    }

    public interface f {
        void l();
    }

    private static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final f f57208a;

        @Override // java.lang.Runnable
        public void run() {
            this.f57208a.l();
        }

        public g(f fVar) {
            this.f57208a = fVar;
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f57191f = new c(2, j10);
        f57192g = new c(3, j10);
    }

    public Loader(String str) {
        this(InterfaceExecutorC17347a.I0(P.N0("ExoPlayer:Loader:" + str), new InterfaceC13610l() { // from class: t3.i
            @Override // d3.InterfaceC13610l
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public void f() {
        this.f57195c = null;
    }

    public void l() {
        m(null);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) C13599a.i(this.f57194b)).a(false);
    }

    public boolean h() {
        return this.f57195c != null;
    }

    public boolean i() {
        return this.f57194b != null;
    }

    public void j() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f57195c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f57194b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f57198a;
            }
            dVar.g(i10);
        }
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f57194b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f57193a.execute(new g(fVar));
        }
        this.f57193a.release();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) C13599a.i(Looper.myLooper());
        this.f57195c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).h(0L);
        return jElapsedRealtime;
    }

    public Loader(InterfaceExecutorC17347a interfaceExecutorC17347a) {
        this.f57193a = interfaceExecutorC17347a;
    }
}
