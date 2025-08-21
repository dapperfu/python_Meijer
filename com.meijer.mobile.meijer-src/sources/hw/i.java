package hw;

import gw.AbstractC14426o;
import gw.C14416e;
import gw.K;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lhw/i;", "Lgw/o;", "Lgw/K;", "delegate", "", "size", "", "truncate", "<init>", "(Lgw/K;JZ)V", "Lgw/e;", "newSize", "", "a", "(Lgw/e;J)V", "sink", "byteCount", "read", "(Lgw/e;J)J", "J", "b", "Z", "c", "bytesReceived", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends AbstractC14426o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean truncate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long bytesReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(K delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.j(delegate, "delegate");
        this.size = j10;
        this.truncate = z10;
    }

    private final void a(C14416e c14416e, long j10) throws IOException {
        C14416e c14416e2 = new C14416e();
        c14416e2.t2(c14416e);
        c14416e.E1(c14416e2, j10);
        c14416e2.a();
    }

    @Override // gw.AbstractC14426o, gw.K
    public long read(C14416e sink, long byteCount) throws IOException {
        Intrinsics.j(sink, "sink");
        long j10 = this.bytesReceived;
        long j11 = this.size;
        if (j10 > j11) {
            byteCount = 0;
        } else if (this.truncate) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j12);
        }
        long j13 = super.read(sink, byteCount);
        if (j13 != -1) {
            this.bytesReceived += j13;
        }
        long j14 = this.bytesReceived;
        long j15 = this.size;
        if ((j14 >= j15 || j13 != -1) && j14 <= j15) {
            return j13;
        }
        if (j13 > 0 && j14 > j15) {
            a(sink, sink.getSize() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
