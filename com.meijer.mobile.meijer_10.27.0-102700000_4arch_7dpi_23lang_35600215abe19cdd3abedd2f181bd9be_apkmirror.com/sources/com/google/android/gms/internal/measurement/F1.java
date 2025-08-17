package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class F1 extends AbstractC10396e5 implements L5 {
    private static final F1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    public static F1 N() {
        return zzi;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final boolean G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final String K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final String M() {
        return this.zzh;
    }

    public final int P() {
        int iA = E1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static {
        F1 f12 = new F1();
        zzi = f12;
        AbstractC10396e5.t(F1.class, f12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", D1.f81674a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new F1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    private F1() {
    }
}
