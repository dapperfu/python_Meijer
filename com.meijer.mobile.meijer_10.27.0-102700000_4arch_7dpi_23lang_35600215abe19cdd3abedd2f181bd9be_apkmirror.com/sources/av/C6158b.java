package av;

import Su.e;
import androidx.recyclerview.widget.RecyclerView;
import ev.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: av.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6158b<E> extends AtomicReferenceArray<E> implements e<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final Integer f59484f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: a, reason: collision with root package name */
    final int f59485a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicLong f59486b;

    /* renamed from: c, reason: collision with root package name */
    long f59487c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f59488d;

    /* renamed from: e, reason: collision with root package name */
    final int f59489e;

    int b(long j10) {
        return ((int) j10) & this.f59485a;
    }

    int c(long j10, int i10) {
        return ((int) j10) & i10;
    }

    void e(long j10) {
        this.f59488d.lazySet(j10);
    }

    void g(long j10) {
        this.f59486b.lazySet(j10);
    }

    @Override // Su.f
    public boolean isEmpty() {
        return this.f59486b.get() == this.f59488d.get();
    }

    @Override // Su.f
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f59485a;
        long j10 = this.f59486b.get();
        int iC = c(j10, i10);
        if (j10 >= this.f59487c) {
            long j11 = this.f59489e + j10;
            if (d(c(j11, i10)) == null) {
                this.f59487c = j11;
            } else if (d(iC) != null) {
                return false;
            }
        }
        f(iC, e10);
        g(j10 + 1);
        return true;
    }

    @Override // Su.e, Su.f
    public E poll() {
        long j10 = this.f59488d.get();
        int iB = b(j10);
        E eD = d(iB);
        if (eD == null) {
            return null;
        }
        e(j10 + 1);
        f(iB, null);
        return eD;
    }

    public C6158b(int i10) {
        super(p.a(i10));
        this.f59485a = length() - 1;
        this.f59486b = new AtomicLong();
        this.f59488d = new AtomicLong();
        this.f59489e = Math.min(i10 / 4, f59484f.intValue());
    }

    @Override // Su.f
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
