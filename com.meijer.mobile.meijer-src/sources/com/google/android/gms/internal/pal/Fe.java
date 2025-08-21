package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Fe extends B0 implements InterfaceC10831h1 {
    private static final Fe zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        Fe fe2 = new Fe();
        zzb = fe2;
        B0.j(Fe.class, fe2);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", C10760cd.f83922a, "zzg"});
        }
        if (i11 == 3) {
            return new Fe();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C10795ee(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Fe() {
    }
}
