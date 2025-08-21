package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class H1 extends AbstractC10521e5 implements L5 {
    private static final H1 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private B1 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zzb & 32) != 0;
    }

    public final boolean L() {
        return this.zzi;
    }

    final /* synthetic */ void N(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    static {
        H1 h12 = new H1();
        zzj = h12;
        AbstractC10521e5.t(H1.class, h12);
    }

    public static G1 M() {
        return (G1) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new H1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new G1(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final B1 H() {
        B1 b12 = this.zzf;
        return b12 == null ? B1.M() : b12;
    }

    private H1() {
    }
}
