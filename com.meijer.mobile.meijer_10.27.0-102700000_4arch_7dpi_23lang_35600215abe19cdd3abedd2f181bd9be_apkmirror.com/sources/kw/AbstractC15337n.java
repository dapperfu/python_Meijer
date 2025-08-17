package kw;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkw/n;", "Lkw/I;", "delegate", "<init>", "(Lkw/I;)V", "Lkw/e;", "source", "", "byteCount", "", "M1", "(Lkw/e;J)V", "flush", "()V", "Lkw/K;", "timeout", "()Lkw/K;", "close", "", "toString", "()Ljava/lang/String;", "a", "Lkw/I;", "()Lkw/I;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kw.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC15337n implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I delegate;

    public AbstractC15337n(I delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kw.I
    public void M1(C15328e source, long byteCount) throws IOException {
        Intrinsics.j(source, "source");
        this.delegate.M1(source, byteCount);
    }

    @Override // kw.I, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // kw.I, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // kw.I
    /* renamed from: timeout */
    public K getF148079a() {
        return this.delegate.getF148079a();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
