package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Jd extends B0 implements InterfaceC10831h1 {
    private static final Jd zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        Jd jd2 = new Jd();
        zzb = jd2;
        B0.j(Jd.class, jd2);
    }

    public static Id t() {
        return (Id) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new Jd();
        }
        Gd gd2 = null;
        if (i11 == 4) {
            return new Id(gd2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Jd() {
    }

    static /* synthetic */ void v(Jd jd2, String str) {
        str.getClass();
        jd2.zze = str;
    }
}
