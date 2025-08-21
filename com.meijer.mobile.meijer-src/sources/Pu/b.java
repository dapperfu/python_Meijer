package Pu;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public abstract class b<T> extends AtomicInteger implements Ou.b<T> {
    @Override // Ou.f
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
