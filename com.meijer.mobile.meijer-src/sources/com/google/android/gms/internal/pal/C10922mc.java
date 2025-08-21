package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10922mc extends B0 implements InterfaceC10831h1 {
    private static final C10922mc zzb;
    private int zze;
    private AbstractC10730b0 zzf = AbstractC10730b0.f83895b;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10730b0 y() {
        return this.zzf;
    }

    static {
        C10922mc c10922mc = new C10922mc();
        zzb = c10922mc;
        B0.j(C10922mc.class, c10922mc);
    }

    public static C10906lc u() {
        return (C10906lc) zzb.l();
    }

    public static C10922mc w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10922mc) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C10922mc();
        }
        C10890kc c10890kc = null;
        if (i11 == 4) {
            return new C10906lc(c10890kc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10922mc() {
    }
}
