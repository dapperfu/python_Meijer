package dw;

import gw.C14416e;
import gw.C14419h;
import gw.DeflaterSink;
import gw.J;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ldw/a;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lgw/e;", "Lgw/h;", "suffix", "b", "(Lgw/e;Lgw/h;)Z", "buffer", "", "a", "(Lgw/e;)V", "close", "()V", "Z", "Lgw/e;", "deflatedBytes", "Ljava/util/zip/Deflater;", "c", "Ljava/util/zip/Deflater;", "deflater", "Lgw/i;", "d", "Lgw/i;", "deflaterSink", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14416e deflatedBytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DeflaterSink deflaterSink;

    public final void a(C14416e buffer) throws IOException {
        Intrinsics.j(buffer, "buffer");
        if (this.deflatedBytes.getSize() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.E1(buffer, buffer.getSize());
        this.deflaterSink.flush();
        if (b(this.deflatedBytes, b.f128886a)) {
            long size = this.deflatedBytes.getSize() - 4;
            C14416e.a aVarD = C14416e.D(this.deflatedBytes, null, 1, null);
            try {
                aVarD.c(size);
                CloseableKt.a(aVarD, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        C14416e c14416e = this.deflatedBytes;
        buffer.E1(c14416e, c14416e.getSize());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public a(boolean z10) {
        this.noContextTakeover = z10;
        C14416e c14416e = new C14416e();
        this.deflatedBytes = c14416e;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((J) c14416e, deflater);
    }

    private final boolean b(C14416e c14416e, C14419h c14419h) {
        return c14416e.d0(c14416e.getSize() - c14419h.V(), c14419h);
    }
}
