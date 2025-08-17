package kw;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkw/o;", "Lkw/J;", "delegate", "<init>", "(Lkw/J;)V", "Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "Lkw/K;", "timeout", "()Lkw/K;", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lkw/J;", "Lkw/J;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class o implements J {
    private final J delegate;

    public o(J delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final J getDelegate() {
        return this.delegate;
    }

    @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName
    public final J delegate() {
        return this.delegate;
    }

    @Override // kw.J
    public long read(C15328e sink, long byteCount) throws IOException {
        Intrinsics.j(sink, "sink");
        return this.delegate.read(sink, byteCount);
    }

    @Override // kw.J
    /* renamed from: timeout */
    public K getF148081a() {
        return this.delegate.getF148081a();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
