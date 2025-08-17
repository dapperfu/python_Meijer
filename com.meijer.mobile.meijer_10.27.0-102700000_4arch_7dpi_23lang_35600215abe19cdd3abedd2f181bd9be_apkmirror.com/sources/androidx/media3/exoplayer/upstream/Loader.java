package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d3.C13466a;
import d3.InterfaceC13477l;
import d3.K;
import d3.P;
import d3.r;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import u3.InterfaceExecutorC17220a;

/* loaded from: classes.dex */
public final class Loader {

    /* renamed from: d, reason: collision with root package name */
    public static final c f56965d = g(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f56966e = g(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f56967f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f56968g;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC17220a f56969a;

    /* renamed from: b, reason: collision with root package name */
    private d<? extends e> f56970b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f56971c;

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
        private final int f56972a;

        /* renamed from: b, reason: collision with root package name */
        private final long f56973b;

        private c(int i10, long j10) {
            this.f56972a = i10;
            this.f56973b = j10;
        }

        public boolean c() {
            int i10 = this.f56972a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f56974a;

        /* renamed from: b, reason: collision with root package name */
        private final T f56975b;

        /* renamed from: c, reason: collision with root package name */
        private final long f56976c;

        /* renamed from: d, reason: collision with root package name */
        private b<T> f56977d;

        /* renamed from: e, reason: collision with root package name */
        private IOException f56978e;

        /* renamed from: f, reason: collision with root package name */
        private int f56979f;

        /* renamed from: g, reason: collision with root package name */
        private Thread f56980g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f56981h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f56982i;

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f56981h;
                    this.f56980g = Thread.currentThread();
                }
                if (!z10) {
                    K.a("load:" + this.f56975b.getClass().getSimpleName());
                    try {
                        this.f56975b.b();
                        K.b();
                    } catch (Throwable th2) {
                        K.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f56980g = null;
                    Thread.interrupted();
                }
                if (this.f56982i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f56982i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f56982i) {
                    r.e("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f56982i) {
                    return;
                }
                r.e("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f56982i) {
                    return;
                }
                r.e("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(3, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f56975b = t10;
            this.f56977d = bVar;
            this.f56974a = i10;
            this.f56976c = j10;
        }

        private void e() {
            Loader.this.f56970b = null;
        }

        private long f() {
            return Math.min((this.f56979f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f56982i = z10;
            this.f56978e = null;
            if (hasMessages(1)) {
                this.f56981h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f56981h = true;
                        this.f56975b.c();
                        Thread thread = this.f56980g;
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
                ((b) C13466a.e(this.f56977d)).v(this.f56975b, jElapsedRealtime, jElapsedRealtime - this.f56976c, true);
                this.f56977d = null;
            }
        }

        public void g(int i10) throws IOException {
            IOException iOException = this.f56978e;
            if (iOException != null && this.f56979f > i10) {
                throw iOException;
            }
        }

        public void h(long j10) {
            C13466a.g(Loader.this.f56970b == null);
            Loader.this.f56970b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f56982i) {
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
            long j10 = jElapsedRealtime - this.f56976c;
            b bVar = (b) C13466a.e(this.f56977d);
            if (this.f56981h) {
                bVar.v(this.f56975b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.s(this.f56975b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    r.e("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f56971c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f56978e = iOException;
            int i12 = this.f56979f + 1;
            this.f56979f = i12;
            c cVarF = bVar.f(this.f56975b, jElapsedRealtime, j10, iOException, i12);
            if (cVarF.f56972a == 3) {
                Loader.this.f56971c = this.f56978e;
            } else if (cVarF.f56972a != 2) {
                if (cVarF.f56972a == 1) {
                    this.f56979f = 1;
                }
                h(cVarF.f56973b != -9223372036854775807L ? cVarF.f56973b : f());
            }
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) C13466a.e(this.f56977d)).o(this.f56975b, jElapsedRealtime, jElapsedRealtime - this.f56976c, this.f56979f);
            this.f56978e = null;
            Loader.this.f56969a.execute((Runnable) C13466a.e(Loader.this.f56970b));
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
        private final f f56984a;

        @Override // java.lang.Runnable
        public void run() {
            this.f56984a.l();
        }

        public g(f fVar) {
            this.f56984a = fVar;
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f56967f = new c(2, j10);
        f56968g = new c(3, j10);
    }

    public Loader(String str) {
        this(InterfaceExecutorC17220a.K0(P.N0("ExoPlayer:Loader:" + str), new InterfaceC13477l() { // from class: t3.i
            @Override // d3.InterfaceC13477l
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public void f() {
        this.f56971c = null;
    }

    public void l() {
        m(null);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) C13466a.i(this.f56970b)).a(false);
    }

    public boolean h() {
        return this.f56971c != null;
    }

    public boolean i() {
        return this.f56970b != null;
    }

    public void j() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f56971c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f56970b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f56974a;
            }
            dVar.g(i10);
        }
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f56970b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f56969a.execute(new g(fVar));
        }
        this.f56969a.release();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) C13466a.i(Looper.myLooper());
        this.f56971c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).h(0L);
        return jElapsedRealtime;
    }

    public Loader(InterfaceExecutorC17220a interfaceExecutorC17220a) {
        this.f56969a = interfaceExecutorC17220a;
    }
}
