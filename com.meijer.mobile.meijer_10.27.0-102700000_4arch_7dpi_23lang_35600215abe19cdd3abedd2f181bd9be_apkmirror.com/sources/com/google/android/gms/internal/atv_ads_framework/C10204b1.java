package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10204b1 extends AbstractC10211d1 {
    /* synthetic */ C10204b1(Z0 z02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10211d1
    final void a(Object obj, long j10) {
        ((R0) C10201a2.k(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10211d1
    final void b(Object obj, Object obj2, long j10) {
        R0 r0Zzg = (R0) C10201a2.k(obj, j10);
        R0 r02 = (R0) C10201a2.k(obj2, j10);
        int size = r0Zzg.size();
        int size2 = r02.size();
        if (size > 0 && size2 > 0) {
            if (!r0Zzg.zzc()) {
                r0Zzg = r0Zzg.zzg(size2 + size);
            }
            r0Zzg.addAll(r02);
        }
        if (size > 0) {
            r02 = r0Zzg;
        }
        C10201a2.x(obj, j10, r02);
    }
}
