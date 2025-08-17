package kw;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkw/r;", "Lkw/J;", "Lkw/g;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lkw/g;Ljava/util/zip/Inflater;)V", "(Lkw/J;Ljava/util/zip/Inflater;)V", "", "c", "()V", "Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "a", "", "b", "()Z", "Lkw/K;", "timeout", "()Lkw/K;", "close", "Lkw/g;", "Ljava/util/zip/Inflater;", "", "I", "bufferBytesHeldByInflater", "d", "Z", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class r implements J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int bufferBytesHeldByInflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    public r(InterfaceC15330g source, Inflater inflater) {
        Intrinsics.j(source, "source");
        Intrinsics.j(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    private final void c() throws IOException {
        int i10 = this.bufferBytesHeldByInflater;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    public final long a(C15328e sink, long byteCount) throws DataFormatException, IOException {
        Intrinsics.j(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            F fZ = sink.Z(1);
            int iMin = (int) Math.min(byteCount, 8192 - fZ.limit);
            b();
            int iInflate = this.inflater.inflate(fZ.data, fZ.limit, iMin);
            c();
            if (iInflate > 0) {
                fZ.limit += iInflate;
                long j10 = iInflate;
                sink.K(sink.getSize() + j10);
                return j10;
            }
            if (fZ.pos == fZ.limit) {
                sink.head = fZ.b();
                G.b(fZ);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.j2()) {
            return true;
        }
        F f10 = this.source.e().head;
        Intrinsics.g(f10);
        int i10 = f10.limit;
        int i11 = f10.pos;
        int i12 = i10 - i11;
        this.bufferBytesHeldByInflater = i12;
        this.inflater.setInput(f10.data, i11, i12);
        return false;
    }

    @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // kw.J
    public long read(C15328e sink, long byteCount) throws DataFormatException, IOException {
        Intrinsics.j(sink, "sink");
        do {
            long jA = a(sink, byteCount);
            if (jA > 0) {
                return jA;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.j2());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // kw.J
    /* renamed from: timeout */
    public K getF148081a() {
        return this.source.getF148081a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(J source, Inflater inflater) {
        this(w.d(source), inflater);
        Intrinsics.j(source, "source");
        Intrinsics.j(inflater, "inflater");
    }
}
