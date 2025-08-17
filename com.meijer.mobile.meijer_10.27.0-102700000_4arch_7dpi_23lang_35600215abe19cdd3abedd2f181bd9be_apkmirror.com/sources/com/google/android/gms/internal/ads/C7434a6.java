package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7434a6 implements InterfaceC7422a0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8857nU f72357a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f72358b = new GQ();

    /* renamed from: c, reason: collision with root package name */
    private final int f72359c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7422a0
    public final Z a(InterfaceC9236r0 interfaceC9236r0, long j10) throws IOException {
        int iA;
        int iA2;
        long jZzf = interfaceC9236r0.zzf();
        int iMin = (int) Math.min(112800L, interfaceC9236r0.zzd() - jZzf);
        this.f72358b.i(iMin);
        interfaceC9236r0.g(this.f72358b.n(), 0, iMin);
        GQ gq2 = this.f72358b;
        int iU = gq2.u();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (gq2.r() >= 188 && (iA2 = (iA = C8607l6.a(gq2.n(), gq2.t(), iU)) + 188) <= iU) {
            long jB = C8607l6.b(gq2, iA, this.f72359c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.f72357a.b(jB);
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
        return j12 != -9223372036854775807L ? Z.f(j12, jZzf + j11) : Z.f71952d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7422a0
    public final void zzb() {
        byte[] bArr = OV.f69096f;
        int length = bArr.length;
        this.f72358b.j(bArr, 0);
    }

    public C7434a6(int i10, C8857nU c8857nU, int i11) {
        this.f72359c = i10;
        this.f72357a = c8857nU;
    }
}
