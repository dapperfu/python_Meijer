package hw;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kw.C15328e;
import kw.C15331h;
import kw.DeflaterSink;
import kw.I;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lhw/a;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lkw/e;", "Lkw/h;", "suffix", "b", "(Lkw/e;Lkw/h;)Z", "buffer", "", "a", "(Lkw/e;)V", "close", "()V", "Z", "Lkw/e;", "deflatedBytes", "Ljava/util/zip/Deflater;", "c", "Ljava/util/zip/Deflater;", "deflater", "Lkw/i;", "d", "Lkw/i;", "deflaterSink", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15328e deflatedBytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DeflaterSink deflaterSink;

    public final void a(C15328e buffer) throws IOException {
        Intrinsics.j(buffer, "buffer");
        if (this.deflatedBytes.getSize() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.M1(buffer, buffer.getSize());
        this.deflaterSink.flush();
        if (b(this.deflatedBytes, b.f136410a)) {
            long size = this.deflatedBytes.getSize() - 4;
            C15328e.a aVarD = C15328e.D(this.deflatedBytes, null, 1, null);
            try {
                aVarD.c(size);
                CloseableKt.a(aVarD, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        C15328e c15328e = this.deflatedBytes;
        buffer.M1(c15328e, c15328e.getSize());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public a(boolean z10) {
        this.noContextTakeover = z10;
        C15328e c15328e = new C15328e();
        this.deflatedBytes = c15328e;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((I) c15328e, deflater);
    }

    private final boolean b(C15328e c15328e, C15331h c15331h) {
        return c15328e.Y(c15328e.getSize() - c15331h.V(), c15331h);
    }
}
