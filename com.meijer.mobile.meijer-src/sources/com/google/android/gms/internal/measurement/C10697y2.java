package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10697y2 extends AbstractC10521e5 implements L5 {
    private static final C10697y2 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C10697y2 c10697y2 = new C10697y2();
        zzk = c10697y2;
        AbstractC10521e5.t(C10697y2.class, c10697y2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10521e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10521e5.u(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C10697y2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10688x2(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }

    private C10697y2() {
    }
}
