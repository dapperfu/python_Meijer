package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public final class u2 extends K0 implements InterfaceC10375q1 {
    private static final u2 zzb;
    private int zzd;
    private String zze = "";

    static /* synthetic */ void s(u2 u2Var, String str) {
        u2Var.zzd |= 1;
        u2Var.zze = "1.0.0";
    }

    static {
        u2 u2Var = new u2();
        zzb = u2Var;
        K0.o(u2.class, u2Var);
    }

    public static t2 q() {
        return (t2) zzb.g();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new u2();
        }
        C10330b2 c10330b2 = null;
        if (i11 == 4) {
            return new t2(c10330b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private u2() {
    }
}
