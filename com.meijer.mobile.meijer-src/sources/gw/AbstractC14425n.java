package gw;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgw/n;", "Lgw/J;", "delegate", "<init>", "(Lgw/J;)V", "Lgw/e;", "source", "", "byteCount", "", "E1", "(Lgw/e;J)V", "flush", "()V", "Lgw/L;", "timeout", "()Lgw/L;", "close", "", "toString", "()Ljava/lang/String;", "a", "Lgw/J;", "()Lgw/J;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: gw.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC14425n implements J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final J delegate;

    public AbstractC14425n(J delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // gw.J
    public void E1(C14416e source, long byteCount) throws IOException {
        Intrinsics.j(source, "source");
        this.delegate.E1(source, byteCount);
    }

    @Override // gw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // gw.J, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // gw.J
    /* renamed from: timeout */
    public L getF134542a() {
        return this.delegate.getF134542a();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
