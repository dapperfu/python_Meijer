package Ce;

import java.util.NoSuchElementException;

/* renamed from: Ce.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3010b<T> extends y0<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f4025a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private T f4026b;

    /* renamed from: Ce.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T a();

    private boolean d() {
        this.f4025a = a.FAILED;
        this.f4026b = a();
        if (this.f4025a == a.DONE) {
            return false;
        }
        this.f4025a = a.READY;
        return true;
    }

    protected final T c() {
        this.f4025a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Be.p.w(this.f4025a != a.FAILED);
        int iOrdinal = this.f4025a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return d();
        }
        return false;
    }

    protected AbstractC3010b() {
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f4025a = a.NOT_READY;
            T t10 = (T) e0.a(this.f4026b);
            this.f4026b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
