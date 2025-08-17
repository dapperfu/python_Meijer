package g3;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import d3.C13466a;
import g3.e;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class f<I extends DecoderInputBuffer, O extends e, E extends DecoderException> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f132719a;

    /* renamed from: e, reason: collision with root package name */
    private final I[] f132723e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f132724f;

    /* renamed from: g, reason: collision with root package name */
    private int f132725g;

    /* renamed from: h, reason: collision with root package name */
    private int f132726h;

    /* renamed from: i, reason: collision with root package name */
    private I f132727i;

    /* renamed from: j, reason: collision with root package name */
    private E f132728j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f132729k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f132730l;

    /* renamed from: m, reason: collision with root package name */
    private int f132731m;

    /* renamed from: b, reason: collision with root package name */
    private final Object f132720b = new Object();

    /* renamed from: n, reason: collision with root package name */
    private long f132732n = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f132721c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f132722d = new ArrayDeque<>();

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
        return !this.f132721c.isEmpty() && this.f132726h > 0;
    }

    private boolean m() throws InterruptedException {
        E e10;
        synchronized (this.f132720b) {
            while (!this.f132730l && !h()) {
                try {
                    this.f132720b.wait();
                } finally {
                }
            }
            if (this.f132730l) {
                return false;
            }
            I iRemoveFirst = this.f132721c.removeFirst();
            O[] oArr = this.f132724f;
            int i10 = this.f132726h - 1;
            this.f132726h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f132729k;
            this.f132729k = false;
            if (iRemoveFirst.u()) {
                o10.m(4);
            } else {
                o10.f132716b = iRemoveFirst.f55467f;
                if (iRemoveFirst.w()) {
                    o10.m(134217728);
                }
                if (!p(iRemoveFirst.f55467f)) {
                    o10.f132718d = true;
                }
                try {
                    e10 = (E) l(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) k(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) k(e12);
                }
                if (e10 != null) {
                    synchronized (this.f132720b) {
                        this.f132728j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f132720b) {
                try {
                    if (this.f132729k) {
                        o10.E();
                    } else if (o10.f132718d) {
                        this.f132731m++;
                        o10.E();
                    } else {
                        o10.f132717c = this.f132731m;
                        this.f132731m = 0;
                        this.f132722d.addLast(o10);
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
        E e10 = this.f132728j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // g3.d
    public final void d(long j10) {
        synchronized (this.f132720b) {
            try {
                C13466a.g(this.f132725g == this.f132723e.length || this.f132729k);
                this.f132732n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g3.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(I i10) throws DecoderException {
        synchronized (this.f132720b) {
            r();
            C13466a.a(i10 == this.f132727i);
            this.f132721c.addLast(i10);
            q();
            this.f132727i = null;
        }
    }

    @Override // g3.d
    public final void flush() {
        synchronized (this.f132720b) {
            try {
                this.f132729k = true;
                this.f132731m = 0;
                I i10 = this.f132727i;
                if (i10 != null) {
                    s(i10);
                    this.f132727i = null;
                }
                while (!this.f132721c.isEmpty()) {
                    s(this.f132721c.removeFirst());
                }
                while (!this.f132722d.isEmpty()) {
                    this.f132722d.removeFirst().E();
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
        synchronized (this.f132720b) {
            r();
            C13466a.g(this.f132727i == null);
            int i11 = this.f132725g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f132723e;
                int i12 = i11 - 1;
                this.f132725g = i12;
                i10 = iArr[i12];
            }
            this.f132727i = i10;
        }
        return i10;
    }

    @Override // g3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final O a() throws DecoderException {
        synchronized (this.f132720b) {
            try {
                r();
                if (this.f132722d.isEmpty()) {
                    return null;
                }
                return this.f132722d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final boolean p(long j10) {
        boolean z10;
        synchronized (this.f132720b) {
            long j11 = this.f132732n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    @Override // g3.d
    public void release() throws InterruptedException {
        synchronized (this.f132720b) {
            this.f132730l = true;
            this.f132720b.notify();
        }
        try {
            this.f132719a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected void t(O o10) {
        synchronized (this.f132720b) {
            u(o10);
            q();
        }
    }

    protected final void w(int i10) {
        C13466a.g(this.f132725g == this.f132723e.length);
        for (I i11 : this.f132723e) {
            i11.F(i10);
        }
    }

    protected f(I[] iArr, O[] oArr) {
        this.f132723e = iArr;
        this.f132725g = iArr.length;
        for (int i10 = 0; i10 < this.f132725g; i10++) {
            ((I[]) this.f132723e)[i10] = i();
        }
        this.f132724f = oArr;
        this.f132726h = oArr.length;
        for (int i11 = 0; i11 < this.f132726h; i11++) {
            ((O[]) this.f132724f)[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f132719a = aVar;
        aVar.start();
    }

    private void q() {
        if (h()) {
            this.f132720b.notify();
        }
    }

    private void s(I i10) {
        i10.o();
        I[] iArr = this.f132723e;
        int i11 = this.f132725g;
        this.f132725g = i11 + 1;
        iArr[i11] = i10;
    }

    private void u(O o10) {
        o10.o();
        O[] oArr = this.f132724f;
        int i10 = this.f132726h;
        this.f132726h = i10 + 1;
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
