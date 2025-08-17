package Tu;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public abstract class b<T> extends AtomicInteger implements Su.b<T> {
    @Override // Su.f
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
