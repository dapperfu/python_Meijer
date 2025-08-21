package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class U2 extends AbstractC10521e5 implements L5 {
    private static final U2 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private C10697y2 zzf;

    static {
        U2 u22 = new U2();
        zzg = u22;
        AbstractC10521e5.t(U2.class, u22);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new U2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new T2(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    private U2() {
    }
}
