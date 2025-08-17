package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.dd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10652dd extends B0 implements InterfaceC10706h1 {
    private static final C10652dd zzb;
    private C10702gd zze;

    static {
        C10652dd c10652dd = new C10652dd();
        zzb = c10652dd;
        B0.j(C10652dd.class, c10652dd);
    }

    public static C10618bd t() {
        return (C10618bd) zzb.l();
    }

    public static C10652dd v(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10652dd) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new C10652dd();
        }
        C10601ad c10601ad = null;
        if (i11 == 4) {
            return new C10618bd(c10601ad);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10702gd w() {
        C10702gd c10702gd = this.zze;
        return c10702gd == null ? C10702gd.v() : c10702gd;
    }

    private C10652dd() {
    }

    static /* synthetic */ void y(C10652dd c10652dd, C10702gd c10702gd) {
        c10702gd.getClass();
        c10652dd.zze = c10702gd;
    }
}
