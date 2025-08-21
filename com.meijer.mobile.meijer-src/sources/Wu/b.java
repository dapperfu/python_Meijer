package Wu;

import Ou.e;
import androidx.recyclerview.widget.RecyclerView;
import av.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes10.dex */
public final class b<E> extends AtomicReferenceArray<E> implements e<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final Integer f41451f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: a, reason: collision with root package name */
    final int f41452a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicLong f41453b;

    /* renamed from: c, reason: collision with root package name */
    long f41454c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f41455d;

    /* renamed from: e, reason: collision with root package name */
    final int f41456e;

    int b(long j10) {
        return ((int) j10) & this.f41452a;
    }

    int c(long j10, int i10) {
        return ((int) j10) & i10;
    }

    void e(long j10) {
        this.f41455d.lazySet(j10);
    }

    void g(long j10) {
        this.f41453b.lazySet(j10);
    }

    @Override // Ou.f
    public boolean isEmpty() {
        return this.f41453b.get() == this.f41455d.get();
    }

    @Override // Ou.f
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f41452a;
        long j10 = this.f41453b.get();
        int iC = c(j10, i10);
        if (j10 >= this.f41454c) {
            long j11 = this.f41456e + j10;
            if (d(c(j11, i10)) == null) {
                this.f41454c = j11;
            } else if (d(iC) != null) {
                return false;
            }
        }
        f(iC, e10);
        g(j10 + 1);
        return true;
    }

    @Override // Ou.e, Ou.f
    public E poll() {
        long j10 = this.f41455d.get();
        int iB = b(j10);
        E eD = d(iB);
        if (eD == null) {
            return null;
        }
        e(j10 + 1);
        f(iB, null);
        return eD;
    }

    public b(int i10) {
        super(p.a(i10));
        this.f41452a = length() - 1;
        this.f41453b = new AtomicLong();
        this.f41455d = new AtomicLong();
        this.f41456e = Math.min(i10 / 4, f41451f.intValue());
    }

    @Override // Ou.f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    E d(int i10) {
        return get(i10);
    }

    void f(int i10, E e10) {
        lazySet(i10, e10);
    }
}
