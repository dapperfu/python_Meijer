package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class B1 extends AbstractC10396e5 implements L5 {
    private static final B1 zzh;
    private int zzb;
    private L1 zzd;
    private F1 zze;
    private boolean zzf;
    private String zzg = "";

    public static B1 M() {
        return zzh;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    final /* synthetic */ void N(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }

    static {
        B1 b12 = new B1();
        zzh = b12;
        AbstractC10396e5.t(B1.class, b12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new B1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new A1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final L1 F() {
        L1 l12 = this.zzd;
        return l12 == null ? L1.L() : l12;
    }

    public final F1 H() {
        F1 f12 = this.zze;
        return f12 == null ? F1.N() : f12;
    }

    private B1() {
    }
}
