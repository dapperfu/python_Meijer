package Ee;

import java.util.NoSuchElementException;

/* renamed from: Ee.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3213b<T> extends y0<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f7337a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private T f7338b;

    /* renamed from: Ee.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T a();

    private boolean d() {
        this.f7337a = a.FAILED;
        this.f7338b = a();
        if (this.f7337a == a.DONE) {
            return false;
        }
        this.f7337a = a.READY;
        return true;
    }

    protected final T c() {
        this.f7337a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        De.p.w(this.f7337a != a.FAILED);
        int iOrdinal = this.f7337a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return d();
        }
        return false;
    }

    protected AbstractC3213b() {
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f7337a = a.NOT_READY;
            T t10 = (T) e0.a(this.f7338b);
            this.f7338b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
