package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class X1 extends AbstractC10396e5 implements L5 {
    private static final X1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    public final String E() {
        return this.zzd;
    }

    static {
        X1 x12 = new X1();
        zzf = x12;
        AbstractC10396e5.t(X1.class, x12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new X1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new W1(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private X1() {
    }
}
