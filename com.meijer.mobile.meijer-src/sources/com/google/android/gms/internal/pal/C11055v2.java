package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11055v2 extends B0 implements InterfaceC10831h1 {
    private static final C11055v2 zzb;
    private int zze;
    private String zzf = "";

    static {
        C11055v2 c11055v2 = new C11055v2();
        zzb = c11055v2;
        B0.j(C11055v2.class, c11055v2);
    }

    public static C11039u2 t() {
        return (C11039u2) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C11055v2();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C11039u2(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C11055v2() {
    }

    static /* synthetic */ void v(C11055v2 c11055v2, String str) {
        str.getClass();
        c11055v2.zze |= 1;
        c11055v2.zzf = str;
    }
}
