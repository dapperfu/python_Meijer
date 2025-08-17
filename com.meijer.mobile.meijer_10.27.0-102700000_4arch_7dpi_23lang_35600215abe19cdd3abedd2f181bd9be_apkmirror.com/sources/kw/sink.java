package kw;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkw/A;", "Lkw/I;", "Ljava/io/OutputStream;", "out", "Lkw/K;", "timeout", "<init>", "(Ljava/io/OutputStream;Lkw/K;)V", "Lkw/e;", "source", "", "byteCount", "", "M1", "(Lkw/e;J)V", "flush", "()V", "close", "()Lkw/K;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/OutputStream;", "b", "Lkw/K;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.A, reason: from toString */
/* loaded from: classes13.dex */
final class sink implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OutputStream out;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final K timeout;

    public sink(OutputStream out, K timeout) {
        Intrinsics.j(out, "out");
        Intrinsics.j(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // kw.I
    public void M1(C15328e source, long byteCount) throws IOException {
        Intrinsics.j(source, "source");
        C15325b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.f();
            F f10 = source.head;
            Intrinsics.g(f10);
            int iMin = (int) Math.min(byteCount, f10.limit - f10.pos);
            this.out.write(f10.data, f10.pos, iMin);
            f10.pos += iMin;
            long j10 = iMin;
            byteCount -= j10;
            source.K(source.getSize() - j10);
            if (f10.pos == f10.limit) {
                source.head = f10.b();
                G.b(f10);
            }
        }
    }

    @Override // kw.I, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // kw.I, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // kw.I
    /* renamed from: timeout, reason: from getter */
    public K getTimeout() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }
}
