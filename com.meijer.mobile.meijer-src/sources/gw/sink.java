package gw;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgw/A;", "Lgw/J;", "Ljava/io/OutputStream;", "out", "Lgw/L;", "timeout", "<init>", "(Ljava/io/OutputStream;Lgw/L;)V", "Lgw/e;", "source", "", "byteCount", "", "E1", "(Lgw/e;J)V", "flush", "()V", "close", "()Lgw/L;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/OutputStream;", "b", "Lgw/L;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gw.A, reason: from toString */
/* loaded from: classes14.dex */
final class sink implements J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OutputStream out;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final L timeout;

    public sink(OutputStream out, L timeout) {
        Intrinsics.j(out, "out");
        Intrinsics.j(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // gw.J
    public void E1(C14416e source, long byteCount) throws IOException {
        Intrinsics.j(source, "source");
        C14413b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.f();
            G g10 = source.head;
            Intrinsics.g(g10);
            int iMin = (int) Math.min(byteCount, g10.limit - g10.pos);
            this.out.write(g10.data, g10.pos, iMin);
            g10.pos += iMin;
            long j10 = iMin;
            byteCount -= j10;
            source.K(source.getSize() - j10);
            if (g10.pos == g10.limit) {
                source.head = g10.b();
                H.b(g10);
            }
        }
    }

    @Override // gw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // gw.J, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // gw.J
    /* renamed from: timeout, reason: from getter */
    public L getTimeout() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }
}
