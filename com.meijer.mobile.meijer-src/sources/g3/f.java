package g3;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import d3.C13599a;
import g3.e;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class f<I extends DecoderInputBuffer, O extends e, E extends DecoderException> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f134009a;

    /* renamed from: e, reason: collision with root package name */
    private final I[] f134013e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f134014f;

    /* renamed from: g, reason: collision with root package name */
    private int f134015g;

    /* renamed from: h, reason: collision with root package name */
    private int f134016h;

    /* renamed from: i, reason: collision with root package name */
    private I f134017i;

    /* renamed from: j, reason: collision with root package name */
    private E f134018j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f134019k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f134020l;

    /* renamed from: m, reason: collision with root package name */
    private int f134021m;

    /* renamed from: b, reason: collision with root package name */
    private final Object f134010b = new Object();

    /* renamed from: n, reason: collision with root package name */
    private long f134022n = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f134011c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f134012d = new ArrayDeque<>();

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f.this.v();
        }
    }

    protected abstract I i();

    protected abstract O j();

    protected abstract E k(Throwable th2);

    protected abstract E l(I i10, O o10, boolean z10);

    private boolean h() {
        return !this.f134011c.isEmpty() && this.f134016h > 0;
    }

    private boolean m() throws InterruptedException {
        E e10;
        synchronized (this.f134010b) {
            while (!this.f134020l && !h()) {
                try {
                    this.f134010b.wait();
                } finally {
                }
            }
            if (this.f134020l) {
                return false;
            }
            I iRemoveFirst = this.f134011c.removeFirst();
            O[] oArr = this.f134014f;
            int i10 = this.f134016h - 1;
            this.f134016h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f134019k;
            this.f134019k = false;
            if (iRemoveFirst.u()) {
                o10.m(4);
            } else {
                o10.f134006b = iRemoveFirst.f55691f;
                if (iRemoveFirst.w()) {
                    o10.m(134217728);
                }
                if (!p(iRemoveFirst.f55691f)) {
                    o10.f134008d = true;
                }
                try {
                    e10 = (E) l(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) k(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) k(e12);
                }
                if (e10 != null) {
                    synchronized (this.f134010b) {
                        this.f134018j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f134010b) {
                try {
                    if (this.f134019k) {
                        o10.E();
                    } else if (o10.f134008d) {
                        this.f134021m++;
                        o10.E();
                    } else {
                        o10.f134007c = this.f134021m;
                        this.f134021m = 0;
                        this.f134012d.addLast(o10);
                    }
                    s(iRemoveFirst);
                } finally {
                }
            }
            return true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.DecoderException */
    private void r() throws E, DecoderException {
        E e10 = this.f134018j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // g3.d
    public final void d(long j10) {
        synchronized (this.f134010b) {
            try {
                C13599a.g(this.f134015g == this.f134013e.length || this.f134019k);
                this.f134022n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g3.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(I i10) throws DecoderException {
        synchronized (this.f134010b) {
            r();
            C13599a.a(i10 == this.f134017i);
            this.f134011c.addLast(i10);
            q();
            this.f134017i = null;
        }
    }

    @Override // g3.d
    public final void flush() {
        synchronized (this.f134010b) {
            try {
                this.f134019k = true;
                this.f134021m = 0;
                I i10 = this.f134017i;
                if (i10 != null) {
                    s(i10);
                    this.f134017i = null;
                }
                while (!this.f134011c.isEmpty()) {
                    s(this.f134011c.removeFirst());
                }
                while (!this.f134012d.isEmpty()) {
                    this.f134012d.removeFirst().E();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final I e() throws DecoderException {
        I i10;
        synchronized (this.f134010b) {
            r();
            C13599a.g(this.f134017i == null);
            int i11 = this.f134015g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f134013e;
                int i12 = i11 - 1;
                this.f134015g = i12;
                i10 = iArr[i12];
            }
            this.f134017i = i10;
        }
        return i10;
    }

    @Override // g3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final O a() throws DecoderException {
        synchronized (this.f134010b) {
            try {
                r();
                if (this.f134012d.isEmpty()) {
                    return null;
                }
                return this.f134012d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final boolean p(long j10) {
        boolean z10;
        synchronized (this.f134010b) {
            long j11 = this.f134022n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    @Override // g3.d
    public void release() throws InterruptedException {
        synchronized (this.f134010b) {
            this.f134020l = true;
            this.f134010b.notify();
        }
        try {
            this.f134009a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected void t(O o10) {
        synchronized (this.f134010b) {
            u(o10);
            q();
        }
    }

    protected final void w(int i10) {
        C13599a.g(this.f134015g == this.f134013e.length);
        for (I i11 : this.f134013e) {
            i11.F(i10);
        }
    }

    protected f(I[] iArr, O[] oArr) {
        this.f134013e = iArr;
        this.f134015g = iArr.length;
        for (int i10 = 0; i10 < this.f134015g; i10++) {
            ((I[]) this.f134013e)[i10] = i();
        }
        this.f134014f = oArr;
        this.f134016h = oArr.length;
        for (int i11 = 0; i11 < this.f134016h; i11++) {
            ((O[]) this.f134014f)[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f134009a = aVar;
        aVar.start();
    }

    private void q() {
        if (h()) {
            this.f134010b.notify();
        }
    }

    private void s(I i10) {
        i10.o();
        I[] iArr = this.f134013e;
        int i11 = this.f134015g;
        this.f134015g = i11 + 1;
        iArr[i11] = i10;
    }

    private void u(O o10) {
        o10.o();
        O[] oArr = this.f134014f;
        int i10 = this.f134016h;
        this.f134016h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }
}
