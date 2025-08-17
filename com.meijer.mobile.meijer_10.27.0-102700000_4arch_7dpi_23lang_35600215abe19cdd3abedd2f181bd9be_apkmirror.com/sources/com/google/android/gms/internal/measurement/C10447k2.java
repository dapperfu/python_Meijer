package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10447k2 extends AbstractC10396e5 implements L5 {
    private static final C10447k2 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        C10447k2 c10447k2 = new C10447k2();
        zzi = c10447k2;
        AbstractC10396e5.t(C10447k2.class, c10447k2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10396e5
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC10396e5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C10447k2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C10438j2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    private C10447k2() {
    }
}
