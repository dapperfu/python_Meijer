package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10626q2 extends AbstractC10521e5 implements L5 {
    private static final C10626q2 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    public static C10626q2 I() {
        return zzi;
    }

    public final String E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    public final int G() {
        return this.zzg;
    }

    public final String H() {
        return this.zzh;
    }

    static {
        C10626q2 c10626q2 = new C10626q2();
        zzi = c10626q2;
        AbstractC10521e5.t(C10626q2.class, c10626q2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C10626q2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10617p2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    private C10626q2() {
    }
}
