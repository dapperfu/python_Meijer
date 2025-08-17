package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10465m2 extends AbstractC10396e5 implements L5 {
    private static final C10465m2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C10465m2 c10465m2 = new C10465m2();
        zzf = c10465m2;
        AbstractC10396e5.t(C10465m2.class, c10465m2);
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
            return new C10465m2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10456l2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    private C10465m2() {
    }
}
