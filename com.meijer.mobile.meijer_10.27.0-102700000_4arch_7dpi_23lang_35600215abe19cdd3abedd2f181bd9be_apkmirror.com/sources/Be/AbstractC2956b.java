package Be;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Be.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC2956b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f2184a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private T f2185b;

    /* renamed from: Be.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T a();

    private boolean d() {
        this.f2184a = a.FAILED;
        this.f2185b = a();
        if (this.f2184a == a.DONE) {
            return false;
        }
        this.f2184a = a.READY;
        return true;
    }

    protected final T c() {
        this.f2184a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p.w(this.f2184a != a.FAILED);
        int iOrdinal = this.f2184a.ordinal();
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

    protected AbstractC2956b() {
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f2184a = a.NOT_READY;
            T t10 = (T) k.a(this.f2185b);
            this.f2185b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
