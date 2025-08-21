package N3;

import d3.D;
import d3.J;

/* loaded from: classes4.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f20574a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20575b;

    @Override // N3.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f20574a + ", playbackPositionUs= " + this.f20575b + " }";
    }

    private g(long j10, long j11) {
        this.f20574a = j10;
        this.f20575b = j11;
    }

    static g d(D d10, long j10, J j11) {
        long jE = e(d10, j10);
        return new g(jE, j11.b(jE));
    }

    static long e(D d10, long j10) {
        long jH = d10.H();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | d10.J()) + j10);
        }
        return -9223372036854775807L;
    }
}
