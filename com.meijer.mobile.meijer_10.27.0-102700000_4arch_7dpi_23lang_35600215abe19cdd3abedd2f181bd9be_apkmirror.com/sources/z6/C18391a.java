package z6;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kw.C15328e;
import kw.I;
import kw.K;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lz6/a;", "Lkw/I;", "delegate", "<init>", "(Lkw/I;)V", "Lkw/e;", "source", "", "byteCount", "", "M1", "(Lkw/e;J)V", "close", "()V", "flush", "Lkw/K;", "timeout", "()Lkw/K;", "a", "Lkw/I;", "value", "b", "J", "()J", "bytesWritten", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18391a implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long bytesWritten;

    public C18391a(I delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kw.I
    public void M1(C15328e source, long byteCount) throws IOException {
        Intrinsics.j(source, "source");
        this.delegate.M1(source, byteCount);
        this.bytesWritten += byteCount;
    }

    /* renamed from: a, reason: from getter */
    public final long getBytesWritten() {
        return this.bytesWritten;
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
}
