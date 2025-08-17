package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Bc extends B0 implements InterfaceC10706h1 {
    private static final Bc zzb;
    private int zze;
    private int zzf;

    static {
        Bc bc2 = new Bc();
        zzb = bc2;
        B0.j(Bc.class, bc2);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", Dd.f82570a});
        }
        if (i11 == 3) {
            return new Bc();
        }
        C10986ya c10986ya = null;
        if (i11 == 4) {
            return new C10600ac(c10986ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Bc() {
    }
}
