package B2;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"LB2/b;", "", "", "initialValue", "<init>", "(I)V", "c", "()I", "a", "b", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2937b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger delegate;

    public final int a() {
        return this.delegate.decrementAndGet();
    }

    public final int b() {
        return this.delegate.get();
    }

    public final int c() {
        return this.delegate.getAndIncrement();
    }

    public final int d() {
        return this.delegate.incrementAndGet();
    }

    public C2937b(int i10) {
        this.delegate = new AtomicInteger(i10);
    }
}
