package com.google.android.gms.internal.pal;

import java.util.List;

/* loaded from: classes6.dex */
final class R0 extends T0 {
    /* synthetic */ R0(Q0 q02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.T0
    final List a(Object obj, long j10) {
        int i10;
        I0 i02 = (I0) T1.k(obj, j10);
        if (!i02.zzc()) {
            int size = i02.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            I0 i0Zzd = i02.zzd(i10);
            T1.x(obj, j10, i0Zzd);
            return i0Zzd;
        }
        return i02;
    }

    @Override // com.google.android.gms.internal.pal.T0
    final void b(Object obj, long j10) {
        ((I0) T1.k(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.pal.T0
    final void c(Object obj, Object obj2, long j10) {
        I0 i0Zzd = (I0) T1.k(obj, j10);
        I0 i02 = (I0) T1.k(obj2, j10);
        int size = i0Zzd.size();
        int size2 = i02.size();
        if (size > 0 && size2 > 0) {
            if (!i0Zzd.zzc()) {
                i0Zzd = i0Zzd.zzd(size2 + size);
            }
            i0Zzd.addAll(i02);
        }
        if (size > 0) {
            i02 = i0Zzd;
        }
        T1.x(obj, j10, i02);
    }
}
