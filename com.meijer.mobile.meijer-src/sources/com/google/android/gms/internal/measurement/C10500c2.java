package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10500c2 extends AbstractC10521e5 implements L5 {
    private static final C10500c2 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC10602n5 zze = AbstractC10521e5.z();
    private boolean zzf;

    public final String E() {
        return this.zzd;
    }

    static {
        C10500c2 c10500c2 = new C10500c2();
        zzg = c10500c2;
        AbstractC10521e5.t(C10500c2.class, c10500c2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", C10590m2.class, "zzf"});
        }
        if (i11 == 3) {
            return new C10500c2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10491b2(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    private C10500c2() {
    }
}
