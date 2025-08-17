package N3;

import d3.D;

/* loaded from: classes4.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f21274a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21275b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f21276c;

    @Override // N3.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f21274a + ", identifier= " + this.f21275b + " }";
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f21274a = j11;
        this.f21275b = j10;
        this.f21276c = bArr;
    }

    static a d(D d10, int i10, long j10) {
        long J10 = d10.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        d10.l(bArr, 0, i11);
        return new a(J10, bArr, j10);
    }
}
