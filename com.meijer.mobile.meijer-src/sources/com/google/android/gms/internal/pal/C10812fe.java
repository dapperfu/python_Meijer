package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.fe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10812fe extends B0 implements InterfaceC10831h1 {
    private static final C10812fe zzb;
    private int zze;
    private AbstractC10730b0 zzf = AbstractC10730b0.f83895b;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10730b0 y() {
        return this.zzf;
    }

    static {
        C10812fe c10812fe = new C10812fe();
        zzb = c10812fe;
        B0.j(C10812fe.class, c10812fe);
    }

    public static C10778de u() {
        return (C10778de) zzb.l();
    }

    public static C10812fe w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10812fe) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C10812fe();
        }
        C10761ce c10761ce = null;
        if (i11 == 4) {
            return new C10778de(c10761ce);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10812fe() {
    }
}
