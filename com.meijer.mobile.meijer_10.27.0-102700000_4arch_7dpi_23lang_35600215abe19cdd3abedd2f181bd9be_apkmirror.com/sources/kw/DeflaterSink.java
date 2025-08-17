package kw;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkw/i;", "Lkw/I;", "Lkw/f;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lkw/f;Ljava/util/zip/Deflater;)V", "(Lkw/I;Ljava/util/zip/Deflater;)V", "", "syncFlush", "", "a", "(Z)V", "Lkw/e;", "source", "", "byteCount", "M1", "(Lkw/e;J)V", "flush", "()V", "b", "close", "Lkw/K;", "timeout", "()Lkw/K;", "", "toString", "()Ljava/lang/String;", "Lkw/f;", "Ljava/util/zip/Deflater;", "c", "Z", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes13.dex */
public final class DeflaterSink implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15329f sink;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    public DeflaterSink(InterfaceC15329f sink, Deflater deflater) {
        Intrinsics.j(sink, "sink");
        Intrinsics.j(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    @Override // kw.I, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.sink.flush();
    }

    private final void a(boolean syncFlush) throws IOException {
        F fZ;
        int iDeflate;
        C15328e bufferField = this.sink.getBufferField();
        while (true) {
            fZ = bufferField.Z(1);
            if (syncFlush) {
                try {
                    Deflater deflater = this.deflater;
                    byte[] bArr = fZ.data;
                    int i10 = fZ.limit;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = fZ.data;
                int i11 = fZ.limit;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                fZ.limit += iDeflate;
                bufferField.K(bufferField.getSize() + iDeflate);
                this.sink.s0();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (fZ.pos == fZ.limit) {
            bufferField.head = fZ.b();
            G.b(fZ);
        }
    }

    @Override // kw.I
    public void M1(C15328e source, long byteCount) throws IOException {
        Intrinsics.j(source, "source");
        C15325b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            F f10 = source.head;
            Intrinsics.g(f10);
            int iMin = (int) Math.min(byteCount, f10.limit - f10.pos);
            this.deflater.setInput(f10.data, f10.pos, iMin);
            a(false);
            long j10 = iMin;
            source.K(source.getSize() - j10);
            int i10 = f10.pos + iMin;
            f10.pos = i10;
            if (i10 == f10.limit) {
                source.head = f10.b();
                G.b(f10);
            }
            byteCount -= j10;
        }
        this.deflater.setInput(lw.t.b(), 0, 0);
    }

    public final void b() throws IOException {
        this.deflater.finish();
        a(false);
    }

    @Override // kw.I, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // kw.I
    /* renamed from: timeout */
    public K getTimeout() {
        return this.sink.getTimeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(I sink, Deflater deflater) {
        this(w.c(sink), deflater);
        Intrinsics.j(sink, "sink");
        Intrinsics.j(deflater, "deflater");
    }
}
