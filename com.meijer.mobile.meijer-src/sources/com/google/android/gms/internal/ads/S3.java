package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class S3 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f70839a;

    /* renamed from: b, reason: collision with root package name */
    private final A0 f70840b;

    /* renamed from: c, reason: collision with root package name */
    private long f70841c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f70842d = -1;

    public S3(B0 b02, A0 a02) {
        this.f70839a = b02;
        this.f70840b = a02;
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final long a(InterfaceC9361r0 interfaceC9361r0) {
        long j10 = this.f70842d;
        if (j10 < 0) {
            return -1L;
        }
        this.f70842d = -1L;
        return -(j10 + 2);
    }

    public final void b(long j10) {
        this.f70841c = j10;
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final Q0 zze() {
        C8211gC.f(this.f70841c != -1);
        return new C10217z0(this.f70839a, this.f70841c);
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final void zzg(long j10) {
        long[] jArr = this.f70840b.f65879a;
        this.f70842d = jArr[OV.v(jArr, j10, true, true)];
    }
}
