package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public final class w2 extends K0 implements InterfaceC10250q1 {
    private static final w2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        w2 w2Var = new w2();
        zzb = w2Var;
        K0.o(w2.class, w2Var);
    }

    public static v2 q() {
        return (v2) zzb.g();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new w2();
        }
        C10205b2 c10205b2 = null;
        if (i11 == 4) {
            return new v2(c10205b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private w2() {
    }

    static /* synthetic */ void s(w2 w2Var, String str) {
        str.getClass();
        w2Var.zzd |= 1;
        w2Var.zze = str;
    }

    static /* synthetic */ void t(w2 w2Var, String str) {
        str.getClass();
        w2Var.zzd |= 2;
        w2Var.zzf = str;
    }
}
