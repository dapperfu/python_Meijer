package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.s7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10887s7 extends B0 implements InterfaceC10706h1 {
    private static final C10887s7 zzb;
    private int zze;
    private int zzf = 2;

    public static C10887s7 u() {
        return zzb;
    }

    public final int v() {
        int iA = V8.a(this.zzf);
        if (iA == 0) {
            return 3;
        }
        return iA;
    }

    static {
        C10887s7 c10887s7 = new C10887s7();
        zzb = c10887s7;
        B0.j(C10887s7.class, c10887s7);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", C10920u8.f84079a});
        }
        if (i11 == 3) {
            return new C10887s7();
        }
        C10678f5 c10678f5 = null;
        if (i11 == 4) {
            return new G6(c10678f5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10887s7() {
    }
}
