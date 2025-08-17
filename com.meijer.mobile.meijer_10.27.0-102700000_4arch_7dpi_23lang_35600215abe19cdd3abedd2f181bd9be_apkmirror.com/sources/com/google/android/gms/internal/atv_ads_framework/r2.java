package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public final class r2 extends K0 implements InterfaceC10250q1 {
    private static final r2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static /* synthetic */ void u(r2 r2Var, int i10) {
        r2Var.zze = i10 - 1;
        r2Var.zzd |= 1;
    }

    static {
        r2 r2Var = new r2();
        zzb = r2Var;
        K0.o(r2.class, r2Var);
    }

    public static q2 q() {
        return (q2) zzb.g();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", s2.f81054a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new r2();
        }
        C10205b2 c10205b2 = null;
        if (i11 == 4) {
            return new q2(c10205b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private r2() {
    }

    static /* synthetic */ void s(r2 r2Var, String str) {
        str.getClass();
        r2Var.zzd |= 2;
        r2Var.zzf = str;
    }

    static /* synthetic */ void t(r2 r2Var, String str) {
        str.getClass();
        r2Var.zzd |= 4;
        r2Var.zzg = str;
    }
}
