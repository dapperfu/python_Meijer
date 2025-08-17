package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class X9 extends B0 implements InterfaceC10706h1 {
    private static final X9 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    public static X9 u() {
        return zzb;
    }

    public final String v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzk;
    }

    static {
        X9 x92 = new X9();
        zzb = x92;
        B0.j(X9.class, x92);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new X9();
        }
        C10678f5 c10678f5 = null;
        if (i11 == 4) {
            return new C10953w9(c10678f5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private X9() {
    }
}
