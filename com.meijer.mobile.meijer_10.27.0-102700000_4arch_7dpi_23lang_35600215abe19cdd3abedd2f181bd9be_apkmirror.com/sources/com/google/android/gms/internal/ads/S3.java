package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class S3 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f69999a;

    /* renamed from: b, reason: collision with root package name */
    private final A0 f70000b;

    /* renamed from: c, reason: collision with root package name */
    private long f70001c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f70002d = -1;

    public S3(B0 b02, A0 a02) {
        this.f69999a = b02;
        this.f70000b = a02;
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final long a(InterfaceC9236r0 interfaceC9236r0) {
        long j10 = this.f70002d;
        if (j10 < 0) {
            return -1L;
        }
        this.f70002d = -1L;
        return -(j10 + 2);
    }

    public final void b(long j10) {
        this.f70001c = j10;
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final Q0 zze() {
        C8086gC.f(this.f70001c != -1);
        return new C10092z0(this.f69999a, this.f70001c);
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final void zzg(long j10) {
        long[] jArr = this.f70000b.f65039a;
        this.f70002d = jArr[OV.v(jArr, j10, true, true)];
    }
}
