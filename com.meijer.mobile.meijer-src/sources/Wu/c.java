package Wu;

import Ou.e;
import androidx.recyclerview.widget.RecyclerView;
import av.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes10.dex */
public final class c<T> implements e<T> {

    /* renamed from: i, reason: collision with root package name */
    static final int f41457i = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: j, reason: collision with root package name */
    private static final Object f41458j = new Object();

    /* renamed from: b, reason: collision with root package name */
    int f41460b;

    /* renamed from: c, reason: collision with root package name */
    long f41461c;

    /* renamed from: d, reason: collision with root package name */
    final int f41462d;

    /* renamed from: e, reason: collision with root package name */
    AtomicReferenceArray<Object> f41463e;

    /* renamed from: f, reason: collision with root package name */
    final int f41464f;

    /* renamed from: g, reason: collision with root package name */
    AtomicReferenceArray<Object> f41465g;

    /* renamed from: a, reason: collision with root package name */
    final AtomicLong f41459a = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f41466h = new AtomicLong();

    private static int c(int i10) {
        return i10;
    }

    private static int d(long j10, int i10) {
        return c(((int) j10) & i10);
    }

    private void b(int i10) {
        this.f41460b = Math.min(i10 / 4, f41457i);
    }

    private long e() {
        return this.f41466h.get();
    }

    private long f() {
        return this.f41459a.get();
    }

    private long g() {
        return this.f41466h.get();
    }

    private long j() {
        return this.f41459a.get();
    }

    private T k(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f41465g = atomicReferenceArray;
        return (T) h(atomicReferenceArray, d(j10, i10));
    }

    private T l(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f41465g = atomicReferenceArray;
        int iD = d(j10, i10);
        T t10 = (T) h(atomicReferenceArray, iD);
        if (t10 != null) {
            r(atomicReferenceArray, iD, null);
            q(j10 + 1);
        }
        return t10;
    }

    private void q(long j10) {
        this.f41466h.lazySet(j10);
    }

    private void t(long j10) {
        this.f41459a.lazySet(j10);
    }

    public boolean m(T t10, T t11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f41463e;
        long j10 = j();
        int i10 = this.f41462d;
        long j11 = 2 + j10;
        if (h(atomicReferenceArray, d(j11, i10)) == null) {
            int iD = d(j10, i10);
            r(atomicReferenceArray, iD + 1, t11);
            r(atomicReferenceArray, iD, t10);
            t(j11);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f41463e = atomicReferenceArray2;
        int iD2 = d(j10, i10);
        r(atomicReferenceArray2, iD2 + 1, t11);
        r(atomicReferenceArray2, iD2, t10);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, iD2, f41458j);
        t(j11);
        return true;
    }

    public T n() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f41465g;
        long jE = e();
        int i10 = this.f41464f;
        T t10 = (T) h(atomicReferenceArray, d(jE, i10));
        return t10 == f41458j ? k(i(atomicReferenceArray, i10 + 1), jE, i10) : t10;
    }

    @Override // Ou.f
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f41463e;
        long jF = f();
        int i10 = this.f41462d;
        int iD = d(jF, i10);
        if (jF < this.f41461c) {
            return u(atomicReferenceArray, t10, jF, iD);
        }
        long j10 = this.f41460b + jF;
        if (h(atomicReferenceArray, d(j10, i10)) == null) {
            this.f41461c = j10 - 1;
            return u(atomicReferenceArray, t10, jF, iD);
        }
        if (h(atomicReferenceArray, d(jF + 1, i10)) == null) {
            return u(atomicReferenceArray, t10, jF, iD);
        }
        o(atomicReferenceArray, jF, iD, t10, i10);
        return true;
    }

    @Override // Ou.e, Ou.f
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f41465g;
        long jE = e();
        int i10 = this.f41464f;
        int iD = d(jE, i10);
        T t10 = (T) h(atomicReferenceArray, iD);
        boolean z10 = t10 == f41458j;
        if (t10 == null || z10) {
            if (z10) {
                return l(i(atomicReferenceArray, i10 + 1), jE, i10);
            }
            return null;
        }
        r(atomicReferenceArray, iD, null);
        q(jE + 1);
        return t10;
    }

    public c(int i10) {
        int iA = p.a(Math.max(8, i10));
        int i11 = iA - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA + 1);
        this.f41463e = atomicReferenceArray;
        this.f41462d = i11;
        b(iA);
        this.f41465g = atomicReferenceArray;
        this.f41464f = i11;
        this.f41461c = iA - 2;
        t(0L);
    }

    private static <E> Object h(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray<Object> i(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        int iC = c(i10);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) h(atomicReferenceArray, iC);
        r(atomicReferenceArray, iC, null);
        return atomicReferenceArray2;
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f41463e = atomicReferenceArray2;
        this.f41461c = (j11 + j10) - 1;
        r(atomicReferenceArray2, i10, t10);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, i10, f41458j);
        t(j10 + 1);
    }

    private static void r(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void s(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        r(atomicReferenceArray, c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private boolean u(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        r(atomicReferenceArray, i10, t10);
        t(j10 + 1);
        return true;
    }

    @Override // Ou.f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // Ou.f
    public boolean isEmpty() {
        if (j() == g()) {
            return true;
        }
        return false;
    }

    public int p() {
        long jG = g();
        while (true) {
            long j10 = j();
            long jG2 = g();
            if (jG == jG2) {
                return (int) (j10 - jG2);
            }
            jG = jG2;
        }
    }
}
