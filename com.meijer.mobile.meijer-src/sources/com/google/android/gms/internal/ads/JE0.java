package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes6.dex */
public final class JE0 implements VF0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8042eh0 f68684a;

    /* renamed from: b, reason: collision with root package name */
    private long f68685b;

    @Override // com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        for (int i10 = 0; i10 < this.f68684a.size(); i10++) {
            ((IE0) this.f68684a.get(i10)).b(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final boolean c(C7994eA0 c7994eA0) {
        boolean zC;
        boolean z10 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zC = false;
            for (int i10 = 0; i10 < this.f68684a.size(); i10++) {
                long jZzc2 = ((IE0) this.f68684a.get(i10)).zzc();
                boolean z11 = jZzc2 != Long.MIN_VALUE && jZzc2 <= c7994eA0.f74617a;
                if (jZzc2 == jZzc || z11) {
                    zC |= ((IE0) this.f68684a.get(i10)).c(c7994eA0);
                }
            }
            z10 |= zC;
        } while (zC);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f68684a.size(); i10++) {
            IE0 ie0 = (IE0) this.f68684a.get(i10);
            long jZzb = ie0.zzb();
            if ((ie0.a().contains(1) || ie0.a().contains(2) || ie0.a().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f68685b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f68685b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f68684a.size(); i10++) {
            long jZzc = ((IE0) this.f68684a.get(i10)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        for (int i10 = 0; i10 < this.f68684a.size(); i10++) {
            if (((IE0) this.f68684a.get(i10)).zzp()) {
                return true;
            }
        }
        return false;
    }

    public JE0(List list, List list2) {
        boolean z10;
        C7723bh0 c7723bh0 = new C7723bh0();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            c7723bh0.g(new IE0((VF0) list.get(i10), (List) list2.get(i10)));
        }
        this.f68684a = c7723bh0.j();
        this.f68685b = -9223372036854775807L;
    }
}
