package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class O1 extends AbstractC10396e5 implements L5 {
    private static final O1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    public final int F() {
        int iA = V1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int G() {
        int iA = S1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int H() {
        int iA = Z1.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static {
        O1 o12 = new O1();
        zzg = o12;
        AbstractC10396e5.t(O1.class, o12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", T1.f81989a, "zze", R1.f81975a, "zzf", Y1.f82104a});
        }
        if (i11 == 3) {
            return new O1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new N1(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    private O1() {
    }
}
