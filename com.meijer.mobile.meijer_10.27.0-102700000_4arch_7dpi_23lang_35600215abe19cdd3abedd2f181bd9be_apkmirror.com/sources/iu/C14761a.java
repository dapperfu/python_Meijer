package iu;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ju.InterfaceC15077a;
import kw.C15328e;
import kw.I;
import kw.InterfaceC15329f;
import kw.K;
import kw.w;

/* renamed from: iu.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14761a implements Closeable {

    /* renamed from: s, reason: collision with root package name */
    static final Pattern f138475s = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: t, reason: collision with root package name */
    private static final I f138476t = new c();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15077a f138477a;

    /* renamed from: b, reason: collision with root package name */
    private final File f138478b;

    /* renamed from: c, reason: collision with root package name */
    private final File f138479c;

    /* renamed from: d, reason: collision with root package name */
    private final File f138480d;

    /* renamed from: e, reason: collision with root package name */
    private final File f138481e;

    /* renamed from: f, reason: collision with root package name */
    private final int f138482f;

    /* renamed from: g, reason: collision with root package name */
    private long f138483g;

    /* renamed from: h, reason: collision with root package name */
    private final int f138484h;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC15329f f138486j;

    /* renamed from: l, reason: collision with root package name */
    private int f138488l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f138489m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f138490n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f138491o;

    /* renamed from: q, reason: collision with root package name */
    private final Executor f138493q;

    /* renamed from: i, reason: collision with root package name */
    private long f138485i = 0;

    /* renamed from: k, reason: collision with root package name */
    private final LinkedHashMap<String, e> f138487k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: p, reason: collision with root package name */
    private long f138492p = 0;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f138494r = new RunnableC2191a();

    /* renamed from: iu.a$a, reason: collision with other inner class name */
    class RunnableC2191a implements Runnable {
        RunnableC2191a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C14761a.this) {
                if ((!C14761a.this.f138490n) || C14761a.this.f138491o) {
                    return;
                }
                try {
                    C14761a.this.w();
                    if (C14761a.this.l()) {
                        C14761a.this.p();
                        C14761a.this.f138488l = 0;
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    /* renamed from: iu.a$b */
    class b extends C14762b {
        b(I i10) {
            super(i10);
        }

        @Override // iu.C14762b
        protected void a(IOException iOException) {
            C14761a.this.f138489m = true;
        }
    }

    /* renamed from: iu.a$c */
    static class c implements I {
        @Override // kw.I, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // kw.I, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // kw.I
        public K timeout() {
            return K.f148056e;
        }

        c() {
        }

        @Override // kw.I
        public void M1(C15328e c15328e, long j10) throws IOException {
            c15328e.skip(j10);
        }
    }

    /* renamed from: iu.a$d */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f138497a;

        public void a() throws IOException {
            throw null;
        }
    }

    /* renamed from: iu.a$e */
    private final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f138498a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f138499b;

        /* renamed from: c, reason: collision with root package name */
        private final File[] f138500c;

        /* renamed from: d, reason: collision with root package name */
        private d f138501d;

        void e(InterfaceC15329f interfaceC15329f) throws IOException {
            for (long j10 : this.f138499b) {
                interfaceC15329f.writeByte(32).E1(j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() throws IOException {
        try {
            InterfaceC15329f interfaceC15329f = this.f138486j;
            if (interfaceC15329f != null) {
                interfaceC15329f.close();
            }
            InterfaceC15329f interfaceC15329fC = w.c(this.f138477a.c(this.f138480d));
            try {
                interfaceC15329fC.I0("libcore.io.DiskLruCache").writeByte(10);
                interfaceC15329fC.I0("1").writeByte(10);
                interfaceC15329fC.E1(this.f138482f).writeByte(10);
                interfaceC15329fC.E1(this.f138484h).writeByte(10);
                interfaceC15329fC.writeByte(10);
                for (e eVar : this.f138487k.values()) {
                    d unused = eVar.f138501d;
                    interfaceC15329fC.I0("CLEAN").writeByte(32);
                    interfaceC15329fC.I0(eVar.f138498a);
                    eVar.e(interfaceC15329fC);
                    interfaceC15329fC.writeByte(10);
                }
                interfaceC15329fC.close();
                if (this.f138477a.a(this.f138479c)) {
                    this.f138477a.d(this.f138479c, this.f138481e);
                }
                this.f138477a.d(this.f138480d, this.f138479c);
                this.f138477a.e(this.f138481e);
                this.f138486j = m();
                this.f138489m = false;
            } catch (Throwable th2) {
                interfaceC15329fC.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f138490n && !this.f138491o) {
                for (e eVar : (e[]) this.f138487k.values().toArray(new e[this.f138487k.size()])) {
                    d unused = eVar.f138501d;
                }
                w();
                this.f138486j.close();
                this.f138486j = null;
                this.f138491o = true;
                return;
            }
            this.f138491o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static C14761a j(InterfaceC15077a interfaceC15077a, File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            return new C14761a(interfaceC15077a, file, i10, i11, j10, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f.b("OkHttp DiskLruCache", true)));
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        int i10 = this.f138488l;
        return i10 >= 2000 && i10 >= this.f138487k.size();
    }

    private InterfaceC15329f m() throws FileNotFoundException {
        return w.c(new b(this.f138477a.b(this.f138479c)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() throws IOException {
        while (this.f138485i > this.f138483g) {
            u(this.f138487k.values().iterator().next());
        }
    }

    C14761a(InterfaceC15077a interfaceC15077a, File file, int i10, int i11, long j10, Executor executor) {
        this.f138477a = interfaceC15077a;
        this.f138478b = file;
        this.f138482f = i10;
        this.f138479c = new File(file, "journal");
        this.f138480d = new File(file, "journal.tmp");
        this.f138481e = new File(file, "journal.bkp");
        this.f138484h = i11;
        this.f138483g = j10;
        this.f138493q = executor;
    }

    private boolean u(e eVar) throws IOException {
        d unused = eVar.f138501d;
        for (int i10 = 0; i10 < this.f138484h; i10++) {
            this.f138477a.e(eVar.f138500c[i10]);
            this.f138485i -= eVar.f138499b[i10];
            eVar.f138499b[i10] = 0;
        }
        this.f138488l++;
        this.f138486j.I0("REMOVE").writeByte(32).I0(eVar.f138498a).writeByte(10);
        this.f138487k.remove(eVar.f138498a);
        if (l()) {
            this.f138493q.execute(this.f138494r);
        }
        return true;
    }
}
