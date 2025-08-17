package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10604b extends B0 implements InterfaceC10706h1 {
    private static final C10604b zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        C10604b c10604b = new C10604b();
        zzb = c10604b;
        B0.j(C10604b.class, c10604b);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C10851q2.f83288a});
        }
        if (i11 == 3) {
            return new C10604b();
        }
        C10986ya c10986ya = null;
        if (i11 == 4) {
            return new ff(c10986ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10604b() {
    }
}
