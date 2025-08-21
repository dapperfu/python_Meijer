package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7559a6 implements InterfaceC7547a0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8982nU f73197a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f73198b = new GQ();

    /* renamed from: c, reason: collision with root package name */
    private final int f73199c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7547a0
    public final Z a(InterfaceC9361r0 interfaceC9361r0, long j10) throws IOException {
        int iA;
        int iA2;
        long jZzf = interfaceC9361r0.zzf();
        int iMin = (int) Math.min(112800L, interfaceC9361r0.zzd() - jZzf);
        this.f73198b.i(iMin);
        interfaceC9361r0.g(this.f73198b.n(), 0, iMin);
        GQ gq2 = this.f73198b;
        int iU = gq2.u();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (gq2.r() >= 188 && (iA2 = (iA = C8732l6.a(gq2.n(), gq2.t(), iU)) + 188) <= iU) {
            long jB = C8732l6.b(gq2, iA, this.f73199c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.f73197a.b(jB);
                if (jB2 > j10) {
                    return j12 == -9223372036854775807L ? Z.d(jB2, jZzf) : Z.e(jZzf + j13);
                }
                j13 = iA;
                if (100000 + jB2 > j10) {
                    return Z.e(jZzf + j13);
                }
                j12 = jB2;
            }
            gq2.l(iA2);
            j11 = iA2;
        }
        return j12 != -9223372036854775807L ? Z.f(j12, jZzf + j11) : Z.f72792d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7547a0
    public final void zzb() {
        byte[] bArr = OV.f69936f;
        int length = bArr.length;
        this.f73198b.j(bArr, 0);
    }

    public C7559a6(int i10, C8982nU c8982nU, int i11) {
        this.f73199c = i10;
        this.f73197a = c8982nU;
    }
}
