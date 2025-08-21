package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10729b extends B0 implements InterfaceC10831h1 {
    private static final C10729b zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        C10729b c10729b = new C10729b();
        zzb = c10729b;
        B0.j(C10729b.class, c10729b);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C10976q2.f84128a});
        }
        if (i11 == 3) {
            return new C10729b();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new ff(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10729b() {
    }
}
