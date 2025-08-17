package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.fullstory.Reason;

/* loaded from: classes6.dex */
final class Y2 implements InterfaceC7535b3 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f71461a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f71462b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71463c;

    private static Pair b(long j10, long[] jArr, long[] jArr2) {
        int iV = OV.v(jArr, j10, true, true);
        long j11 = jArr[iV];
        long j12 = jArr2[iV];
        int i10 = iV + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f71463c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final int zzc() {
        return Reason.OS_VERSION_TOO_LOW;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public static Y2 a(long j10, C9347s2 c9347s2, long j11) {
        int length = c9347s2.f78116e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += c9347s2.f78114c + c9347s2.f78116e[i12];
            j12 += c9347s2.f78115d + c9347s2.f78117f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new Y2(jArr, jArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long f(long j10) {
        return OV.K(((Long) b(j10, this.f71461a, this.f71462b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        Pair pairB = b(OV.N(Math.max(0L, Math.min(j10, this.f71463c))), this.f71462b, this.f71461a);
        R0 r02 = new R0(OV.K(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new O0(r02, r02);
    }

    private Y2(long[] jArr, long[] jArr2, long j10) {
        this.f71461a = jArr;
        this.f71462b = jArr2;
        this.f71463c = j10 == -9223372036854775807L ? OV.K(jArr2[jArr2.length - 1]) : j10;
    }
}
