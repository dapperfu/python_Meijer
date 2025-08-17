package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.jd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10750jd extends B0 implements InterfaceC10706h1 {
    private static final C10750jd zzb;
    private int zze;
    private C10798md zzf;
    private AbstractC10605b0 zzg = AbstractC10605b0.f83055b;

    public final boolean H() {
        return this.zzf != null;
    }

    public final int t() {
        return this.zze;
    }

    public final AbstractC10605b0 z() {
        return this.zzg;
    }

    static {
        C10750jd c10750jd = new C10750jd();
        zzb = c10750jd;
        B0.j(C10750jd.class, c10750jd);
    }

    public static C10734id u() {
        return (C10734id) zzb.l();
    }

    public static C10750jd w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10750jd) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10750jd();
        }
        C10718hd c10718hd = null;
        if (i11 == 4) {
            return new C10734id(c10718hd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10798md y() {
        C10798md c10798md = this.zzf;
        return c10798md == null ? C10798md.y() : c10798md;
    }

    private C10750jd() {
    }

    static /* synthetic */ void E(C10750jd c10750jd, C10798md c10798md) {
        c10798md.getClass();
        c10750jd.zzf = c10798md;
    }
}
