package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10483o2 extends AbstractC10396e5 implements L5 {
    private static final C10483o2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    public final String E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    static {
        C10483o2 c10483o2 = new C10483o2();
        zzf = c10483o2;
        AbstractC10396e5.t(C10483o2.class, c10483o2);
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
            return new C10483o2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10474n2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private C10483o2() {
    }
}
