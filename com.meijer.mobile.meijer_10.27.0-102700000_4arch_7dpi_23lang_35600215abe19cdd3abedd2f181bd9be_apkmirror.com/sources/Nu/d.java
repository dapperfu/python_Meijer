package Nu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
abstract class d<T> extends AtomicReference<T> implements b {
    protected abstract void a(T t10);

    d(T t10) {
        super(Ru.b.e(t10, "value is null"));
    }

    @Override // Nu.b
    public final void dispose() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            a(andSet);
        }
    }

    @Override // Nu.b
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
