package De;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: De.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3105b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f6129a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private T f6130b;

    /* renamed from: De.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T a();

    private boolean d() {
        this.f6129a = a.FAILED;
        this.f6130b = a();
        if (this.f6129a == a.DONE) {
            return false;
        }
        this.f6129a = a.READY;
        return true;
    }

    protected final T c() {
        this.f6129a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p.w(this.f6129a != a.FAILED);
        int iOrdinal = this.f6129a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return d();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected AbstractC3105b() {
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f6129a = a.NOT_READY;
            T t10 = (T) k.a(this.f6130b);
            this.f6130b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
