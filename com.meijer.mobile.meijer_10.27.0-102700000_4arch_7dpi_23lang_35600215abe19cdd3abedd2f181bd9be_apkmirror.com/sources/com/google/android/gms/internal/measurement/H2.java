package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class H2 extends AbstractC10396e5 implements L5 {
    private static final H2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    public final int G() {
        int iA = F2.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int H() {
        int iA = J2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void I(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void J(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }

    static {
        H2 h22 = new H2();
        zzf = h22;
        AbstractC10396e5.t(H2.class, h22);
    }

    public static G2 E() {
        return (G2) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", E2.f81752a, "zze", I2.f81788a});
        }
        if (i11 == 3) {
            return new H2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new G2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private H2() {
    }
}
