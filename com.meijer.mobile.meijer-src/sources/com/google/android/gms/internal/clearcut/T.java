package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10418f0;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
final class T extends S<AbstractC10418f0.d> {
    T() {
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final int a(Map.Entry<?, ?> entry) {
        return ((AbstractC10418f0.d) entry.getKey()).f82272a;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final W<AbstractC10418f0.d> b(Object obj) {
        return ((AbstractC10418f0.c) obj).zzjv;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final void c(M1 m12, Map.Entry<?, ?> entry) throws IOException {
        AbstractC10418f0.d dVar = (AbstractC10418f0.d) entry.getKey();
        switch (U.f82044a[dVar.f82273b.ordinal()]) {
            case 1:
                m12.k(dVar.f82272a, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                m12.l(dVar.f82272a, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                m12.E(dVar.f82272a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                m12.zza(dVar.f82272a, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                m12.g(dVar.f82272a, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                m12.zzc(dVar.f82272a, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                m12.m(dVar.f82272a, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                m12.zzb(dVar.f82272a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                m12.r(dVar.f82272a, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                m12.I(dVar.f82272a, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                m12.zzj(dVar.f82272a, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                m12.s(dVar.f82272a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                m12.e(dVar.f82272a, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                m12.g(dVar.f82272a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                m12.B(dVar.f82272a, (A) entry.getValue());
                break;
            case 16:
                m12.c(dVar.f82272a, (String) entry.getValue());
                break;
            case 17:
                m12.D(dVar.f82272a, entry.getValue(), V0.a().b(entry.getValue().getClass()));
                break;
            case 18:
                m12.C(dVar.f82272a, entry.getValue(), V0.a().b(entry.getValue().getClass()));
                break;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final void d(Object obj, W<AbstractC10418f0.d> w10) {
        ((AbstractC10418f0.c) obj).zzjv = w10;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final W<AbstractC10418f0.d> e(Object obj) {
        W<AbstractC10418f0.d> wB = b(obj);
        if (!wB.c()) {
            return wB;
        }
        W<AbstractC10418f0.d> w10 = (W) wB.clone();
        d(obj, w10);
        return w10;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final void f(Object obj) {
        b(obj).t();
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final boolean g(J0 j02) {
        return j02 instanceof AbstractC10418f0.c;
    }
}
