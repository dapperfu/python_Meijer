package kw;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0002\u001a\u00020\u00018G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0004¨\u0006\u001f"}, d2 = {"Lkw/p;", "Lkw/K;", "delegate", "<init>", "(Lkw/K;)V", "j", "(Lkw/K;)Lkw/p;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)Lkw/K;", "h", "()J", "", "e", "()Z", "c", "deadlineNanoTime", "d", "(J)Lkw/K;", "b", "()Lkw/K;", "a", "", "f", "()V", "Lkw/K;", "i", "setDelegate", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public class p extends K {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private K delegate;

    public p(K delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kw.K
    public K a() {
        return this.delegate.a();
    }

    @Override // kw.K
    public K b() {
        return this.delegate.b();
    }

    @Override // kw.K
    public long c() {
        return this.delegate.c();
    }

    @Override // kw.K
    public K d(long deadlineNanoTime) {
        return this.delegate.d(deadlineNanoTime);
    }

    @Override // kw.K
    /* renamed from: e */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // kw.K
    public void f() throws IOException {
        this.delegate.f();
    }

    @Override // kw.K
    public K g(long timeout, TimeUnit unit) {
        Intrinsics.j(unit, "unit");
        return this.delegate.g(timeout, unit);
    }

    @Override // kw.K
    /* renamed from: h */
    public long getTimeoutNanos() {
        return this.delegate.getTimeoutNanos();
    }

    @JvmName
    /* renamed from: i, reason: from getter */
    public final K getDelegate() {
        return this.delegate;
    }

    public final p j(K delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
