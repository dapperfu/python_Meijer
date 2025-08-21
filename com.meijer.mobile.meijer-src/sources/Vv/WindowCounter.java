package Vv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, d2 = {"LVv/a;", "", "", "streamId", "<init>", "(I)V", "", "total", "acknowledged", "", "b", "(JJ)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getStreamId", "()I", "value", "J", "getTotal", "()J", "c", "getAcknowledged", "unacknowledged", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: Vv.a, reason: from toString */
/* loaded from: classes14.dex */
public final class WindowCounter {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int streamId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private long total;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private long acknowledged;

    public final synchronized long a() {
        return this.total - this.acknowledged;
    }

    public final synchronized void b(long total, long acknowledged) {
        try {
            if (total < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (acknowledged < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j10 = this.total + total;
            this.total = j10;
            long j11 = this.acknowledged + acknowledged;
            this.acknowledged = j11;
            if (j11 > j10) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void c(WindowCounter windowCounter, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        windowCounter.b(j10, j11);
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.streamId + ", total=" + this.total + ", acknowledged=" + this.acknowledged + ", unacknowledged=" + a() + ')';
    }

    public WindowCounter(int i10) {
        this.streamId = i10;
    }
}
