package dw;

import gw.C14416e;
import gw.K;
import gw.r;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ldw/c;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lgw/e;", "buffer", "", "a", "(Lgw/e;)V", "close", "()V", "Z", "b", "Lgw/e;", "deflatedBytes", "Ljava/util/zip/Inflater;", "c", "Ljava/util/zip/Inflater;", "inflater", "Lgw/r;", "d", "Lgw/r;", "inflaterSource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14416e deflatedBytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r inflaterSource;

    public final void a(C14416e buffer) throws DataFormatException, IOException {
        Intrinsics.j(buffer, "buffer");
        if (this.deflatedBytes.getSize() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.t2(buffer);
        this.deflatedBytes.writeInt(65535);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.getSize();
        do {
            this.inflaterSource.a(buffer, Long.MAX_VALUE);
            if (this.inflater.getBytesRead() >= bytesRead) {
                return;
            }
        } while (!this.inflater.finished());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public c(boolean z10) {
        this.noContextTakeover = z10;
        C14416e c14416e = new C14416e();
        this.deflatedBytes = c14416e;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new r((K) c14416e, inflater);
    }
}
