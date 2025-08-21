package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public final class p2 extends K0 implements InterfaceC10375q1 {
    private static final p2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static /* synthetic */ void s(p2 p2Var, int i10) {
        p2Var.zze = i10 - 1;
        p2Var.zzd |= 1;
    }

    static /* synthetic */ void t(p2 p2Var, int i10) {
        p2Var.zzf = i10 - 1;
        p2Var.zzd |= 2;
    }

    static /* synthetic */ void u(p2 p2Var, int i10) {
        p2Var.zzg = i10 - 1;
        p2Var.zzd |= 4;
    }

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        K0.o(p2.class, p2Var);
    }

    public static o2 q() {
        return (o2) zzb.g();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", k2.f81862a, "zzf", j2.f81859a, "zzg", n2.f81866a});
        }
        if (i11 == 3) {
            return new p2();
        }
        C10330b2 c10330b2 = null;
        if (i11 == 4) {
            return new o2(c10330b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private p2() {
    }
}
