package gw;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgw/s;", "Lgw/K;", "Ljava/io/InputStream;", "input", "Lgw/L;", "timeout", "<init>", "(Ljava/io/InputStream;Lgw/L;)V", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "", "close", "()V", "()Lgw/L;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/InputStream;", "b", "Lgw/L;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gw.s, reason: from toString */
/* loaded from: classes14.dex */
class source implements K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputStream input;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final L timeout;

    public source(InputStream input, L timeout) {
        Intrinsics.j(input, "input");
        Intrinsics.j(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // gw.K
    public long read(C14416e sink, long byteCount) throws IOException {
        Intrinsics.j(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.f();
            G gY = sink.Y(1);
            int i10 = this.input.read(gY.data, gY.limit, (int) Math.min(byteCount, 8192 - gY.limit));
            if (i10 != -1) {
                gY.limit += i10;
                long j10 = i10;
                sink.K(sink.getSize() + j10);
                return j10;
            }
            if (gY.pos != gY.limit) {
                return -1L;
            }
            sink.head = gY.b();
            H.b(gY);
            return -1L;
        } catch (AssertionError e10) {
            if (hw.s.b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // gw.K
    /* renamed from: timeout, reason: from getter */
    public L getTimeout() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
