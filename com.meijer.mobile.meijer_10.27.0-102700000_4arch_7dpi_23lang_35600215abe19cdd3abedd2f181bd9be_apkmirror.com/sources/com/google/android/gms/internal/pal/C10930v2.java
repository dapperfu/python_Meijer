package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10930v2 extends B0 implements InterfaceC10706h1 {
    private static final C10930v2 zzb;
    private int zze;
    private String zzf = "";

    static {
        C10930v2 c10930v2 = new C10930v2();
        zzb = c10930v2;
        B0.j(C10930v2.class, c10930v2);
    }

    public static C10914u2 t() {
        return (C10914u2) zzb.l();
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
            return new C10930v2();
        }
        C10986ya c10986ya = null;
        if (i11 == 4) {
            return new C10914u2(c10986ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10930v2() {
    }

    static /* synthetic */ void v(C10930v2 c10930v2, String str) {
        str.getClass();
        c10930v2.zze |= 1;
        c10930v2.zzf = str;
    }
}
