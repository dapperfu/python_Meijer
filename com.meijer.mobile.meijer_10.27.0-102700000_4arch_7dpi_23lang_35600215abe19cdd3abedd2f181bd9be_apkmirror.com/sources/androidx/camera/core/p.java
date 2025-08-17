package androidx.camera.core;

import C.I;
import C.P;
import F.AbstractC3611h;
import F.S;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class p implements S, e.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f47545a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3611h f47546b;

    /* renamed from: c, reason: collision with root package name */
    private int f47547c;

    /* renamed from: d, reason: collision with root package name */
    private S.a f47548d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47549e;

    /* renamed from: f, reason: collision with root package name */
    private final S f47550f;

    /* renamed from: g, reason: collision with root package name */
    S.a f47551g;

    /* renamed from: h, reason: collision with root package name */
    private Executor f47552h;

    /* renamed from: i, reason: collision with root package name */
    private final LongSparseArray<I> f47553i;

    /* renamed from: j, reason: collision with root package name */
    private final LongSparseArray<n> f47554j;

    /* renamed from: k, reason: collision with root package name */
    private int f47555k;

    /* renamed from: l, reason: collision with root package name */
    private final List<n> f47556l;

    /* renamed from: m, reason: collision with root package name */
    private final List<n> f47557m;

    class a extends AbstractC3611h {
        a() {
        }

        @Override // F.AbstractC3611h
        public void b(int i10, F.r rVar) {
            super.b(i10, rVar);
            p.this.q(rVar);
        }
    }

    public p(int i10, int i11, int i12, int i13) {
        this(j(i10, i11, i12, i13));
    }

    p(S s10) {
        this.f47545a = new Object();
        this.f47546b = new a();
        this.f47547c = 0;
        this.f47548d = new S.a() { // from class: C.Q
            @Override // F.S.a
            public final void a(F.S s11) {
                androidx.camera.core.p.i(this.f3316a, s11);
            }
        };
        this.f47549e = false;
        this.f47553i = new LongSparseArray<>();
        this.f47554j = new LongSparseArray<>();
        this.f47557m = new ArrayList();
        this.f47550f = s10;
        this.f47555k = 0;
        this.f47556l = new ArrayList(e());
    }

    public static /* synthetic */ void i(p pVar, S s10) {
        synchronized (pVar.f47545a) {
            pVar.f47547c++;
        }
        pVar.n(s10);
    }

    private static S j(int i10, int i11, int i12, int i13) {
        return new d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    private void k(n nVar) {
        synchronized (this.f47545a) {
            try {
                int iIndexOf = this.f47556l.indexOf(nVar);
                if (iIndexOf >= 0) {
                    this.f47556l.remove(iIndexOf);
                    int i10 = this.f47555k;
                    if (iIndexOf <= i10) {
                        this.f47555k = i10 - 1;
                    }
                }
                this.f47557m.remove(nVar);
                if (this.f47547c > 0) {
                    n(this.f47550f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l(r rVar) {
        final S.a aVar;
        Executor executor;
        synchronized (this.f47545a) {
            try {
                if (this.f47556l.size() < e()) {
                    rVar.a(this);
                    this.f47556l.add(rVar);
                    aVar = this.f47551g;
                    executor = this.f47552h;
                } else {
                    P.a("TAG", "Maximum image number reached.");
                    rVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: C.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.p.h(this.f3317a, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    private void o() {
        synchronized (this.f47545a) {
            try {
                for (int size = this.f47553i.size() - 1; size >= 0; size--) {
                    I iValueAt = this.f47553i.valueAt(size);
                    long timestamp = iValueAt.getTimestamp();
                    n nVar = this.f47554j.get(timestamp);
                    if (nVar != null) {
                        this.f47554j.remove(timestamp);
                        this.f47553i.removeAt(size);
                        l(new r(nVar, iValueAt));
                    }
                }
                p();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p() {
        synchronized (this.f47545a) {
            try {
                if (this.f47554j.size() != 0 && this.f47553i.size() != 0) {
                    long jKeyAt = this.f47554j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f47553i.keyAt(0);
                    o2.i.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f47554j.size() - 1; size >= 0; size--) {
                            if (this.f47554j.keyAt(size) < jKeyAt2) {
                                this.f47554j.valueAt(size).close();
                                this.f47554j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f47553i.size() - 1; size2 >= 0; size2--) {
                            if (this.f47553i.keyAt(size2) < jKeyAt) {
                                this.f47553i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.e.a
    public void a(n nVar) {
        synchronized (this.f47545a) {
            k(nVar);
        }
    }

    @Override // F.S
    public n b() {
        synchronized (this.f47545a) {
            try {
                if (this.f47556l.isEmpty()) {
                    return null;
                }
                if (this.f47555k >= this.f47556l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f47556l.size() - 1; i10++) {
                    if (!this.f47557m.contains(this.f47556l.get(i10))) {
                        arrayList.add(this.f47556l.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                int size = this.f47556l.size();
                List<n> list = this.f47556l;
                this.f47555k = size;
                n nVar = list.get(size - 1);
                this.f47557m.add(nVar);
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // F.S
    public int c() {
        int iC;
        synchronized (this.f47545a) {
            iC = this.f47550f.c();
        }
        return iC;
    }

    @Override // F.S
    public void close() {
        synchronized (this.f47545a) {
            try {
                if (this.f47549e) {
                    return;
                }
                Iterator it = new ArrayList(this.f47556l).iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                this.f47556l.clear();
                this.f47550f.close();
                this.f47549e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // F.S
    public void d() {
        synchronized (this.f47545a) {
            this.f47550f.d();
            this.f47551g = null;
            this.f47552h = null;
            this.f47547c = 0;
        }
    }

    @Override // F.S
    public int e() {
        int iE;
        synchronized (this.f47545a) {
            iE = this.f47550f.e();
        }
        return iE;
    }

    @Override // F.S
    public void f(S.a aVar, Executor executor) {
        synchronized (this.f47545a) {
            this.f47551g = (S.a) o2.i.g(aVar);
            this.f47552h = (Executor) o2.i.g(executor);
            this.f47550f.f(this.f47548d, executor);
        }
    }

    @Override // F.S
    public n g() {
        synchronized (this.f47545a) {
            try {
                if (this.f47556l.isEmpty()) {
                    return null;
                }
                if (this.f47555k >= this.f47556l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<n> list = this.f47556l;
                int i10 = this.f47555k;
                this.f47555k = i10 + 1;
                n nVar = list.get(i10);
                this.f47557m.add(nVar);
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // F.S
    public int getHeight() {
        int height;
        synchronized (this.f47545a) {
            height = this.f47550f.getHeight();
        }
        return height;
    }

    @Override // F.S
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f47545a) {
            surface = this.f47550f.getSurface();
        }
        return surface;
    }

    @Override // F.S
    public int getWidth() {
        int width;
        synchronized (this.f47545a) {
            width = this.f47550f.getWidth();
        }
        return width;
    }

    public AbstractC3611h m() {
        return this.f47546b;
    }

    void n(S s10) {
        n nVarG;
        synchronized (this.f47545a) {
            try {
                if (this.f47549e) {
                    return;
                }
                int size = this.f47554j.size() + this.f47556l.size();
                if (size >= s10.e()) {
                    P.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        nVarG = s10.g();
                        if (nVarG != null) {
                            this.f47547c--;
                            size++;
                            this.f47554j.put(nVarG.S2().getTimestamp(), nVarG);
                            o();
                        }
                    } catch (IllegalStateException e10) {
                        P.b("MetadataImageReader", "Failed to acquire next image.", e10);
                        nVarG = null;
                    }
                    if (nVarG == null || this.f47547c <= 0) {
                        break;
                    }
                } while (size < s10.e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void q(F.r rVar) {
        synchronized (this.f47545a) {
            try {
                if (this.f47549e) {
                    return;
                }
                this.f47553i.put(rVar.getTimestamp(), new J.b(rVar));
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void h(p pVar, S.a aVar) {
        pVar.getClass();
        aVar.a(pVar);
    }
}
