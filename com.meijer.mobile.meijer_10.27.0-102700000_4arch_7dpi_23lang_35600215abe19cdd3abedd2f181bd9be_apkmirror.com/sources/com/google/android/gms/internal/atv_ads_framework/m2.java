package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public final class m2 extends K0 implements InterfaceC10250q1 {
    private static final m2 zzb;
    private int zzd;
    private String zze = "";
    private boolean zzf;

    static /* synthetic */ void t(m2 m2Var, boolean z10) {
        m2Var.zzd |= 2;
        m2Var.zzf = z10;
    }

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        K0.o(m2.class, m2Var);
    }

    public static l2 q() {
        return (l2) zzb.g();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new m2();
        }
        C10205b2 c10205b2 = null;
        if (i11 == 4) {
            return new l2(c10205b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private m2() {
    }

    static /* synthetic */ void s(m2 m2Var, String str) {
        str.getClass();
        m2Var.zzd |= 1;
        m2Var.zze = str;
    }
}
