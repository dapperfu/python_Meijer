package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
final class T extends S<AbstractC10293f0.d> {
    T() {
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final int a(Map.Entry<?, ?> entry) {
        return ((AbstractC10293f0.d) entry.getKey()).f81432a;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final W<AbstractC10293f0.d> b(Object obj) {
        return ((AbstractC10293f0.c) obj).zzjv;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final void c(M1 m12, Map.Entry<?, ?> entry) throws IOException {
        AbstractC10293f0.d dVar = (AbstractC10293f0.d) entry.getKey();
        switch (U.f81204a[dVar.f81433b.ordinal()]) {
            case 1:
                m12.k(dVar.f81432a, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                m12.l(dVar.f81432a, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                m12.E(dVar.f81432a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                m12.zza(dVar.f81432a, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                m12.g(dVar.f81432a, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                m12.zzc(dVar.f81432a, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                m12.m(dVar.f81432a, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                m12.zzb(dVar.f81432a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                m12.r(dVar.f81432a, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                m12.I(dVar.f81432a, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                m12.zzj(dVar.f81432a, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                m12.s(dVar.f81432a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                m12.e(dVar.f81432a, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                m12.g(dVar.f81432a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                m12.B(dVar.f81432a, (A) entry.getValue());
                break;
            case 16:
                m12.c(dVar.f81432a, (String) entry.getValue());
                break;
            case 17:
                m12.D(dVar.f81432a, entry.getValue(), V0.a().b(entry.getValue().getClass()));
                break;
            case 18:
                m12.C(dVar.f81432a, entry.getValue(), V0.a().b(entry.getValue().getClass()));
                break;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final void d(Object obj, W<AbstractC10293f0.d> w10) {
        ((AbstractC10293f0.c) obj).zzjv = w10;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final W<AbstractC10293f0.d> e(Object obj) {
        W<AbstractC10293f0.d> wB = b(obj);
        if (!wB.c()) {
            return wB;
        }
        W<AbstractC10293f0.d> w10 = (W) wB.clone();
        d(obj, w10);
        return w10;
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final void f(Object obj) {
        b(obj).t();
    }

    @Override // com.google.android.gms.internal.clearcut.S
    final boolean g(J0 j02) {
        return j02 instanceof AbstractC10293f0.c;
    }
}
