package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.dd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10777dd extends B0 implements InterfaceC10831h1 {
    private static final C10777dd zzb;
    private C10827gd zze;

    static {
        C10777dd c10777dd = new C10777dd();
        zzb = c10777dd;
        B0.j(C10777dd.class, c10777dd);
    }

    public static C10743bd t() {
        return (C10743bd) zzb.l();
    }

    public static C10777dd v(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10777dd) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new C10777dd();
        }
        C10726ad c10726ad = null;
        if (i11 == 4) {
            return new C10743bd(c10726ad);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10827gd w() {
        C10827gd c10827gd = this.zze;
        return c10827gd == null ? C10827gd.v() : c10827gd;
    }

    private C10777dd() {
    }

    static /* synthetic */ void y(C10777dd c10777dd, C10827gd c10827gd) {
        c10827gd.getClass();
        c10777dd.zze = c10827gd;
    }
}
