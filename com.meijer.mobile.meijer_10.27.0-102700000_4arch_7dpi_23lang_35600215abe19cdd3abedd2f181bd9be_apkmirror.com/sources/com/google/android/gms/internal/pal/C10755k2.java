package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10755k2 extends B0 implements InterfaceC10706h1 {
    private static final C10755k2 zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private H0 zzi = B0.p();
    private long zzj;

    static {
        C10755k2 c10755k2 = new C10755k2();
        zzb = c10755k2;
        B0.j(C10755k2.class, c10755k2);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C10755k2();
        }
        C10986ya c10986ya = null;
        if (i11 == 4) {
            return new C10607b2(c10986ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10755k2() {
    }
}
