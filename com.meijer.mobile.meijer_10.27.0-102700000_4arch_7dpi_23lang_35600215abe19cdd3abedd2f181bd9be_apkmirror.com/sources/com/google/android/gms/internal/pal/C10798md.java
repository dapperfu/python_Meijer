package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.md, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10798md extends B0 implements InterfaceC10706h1 {
    private static final C10798md zzb;
    private int zze;
    private C10702gd zzf;
    private AbstractC10605b0 zzg = AbstractC10605b0.f83055b;

    public static C10798md y() {
        return zzb;
    }

    public final AbstractC10605b0 A() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzf != null;
    }

    public final int t() {
        return this.zze;
    }

    static {
        C10798md c10798md = new C10798md();
        zzb = c10798md;
        B0.j(C10798md.class, c10798md);
    }

    public static C10782ld v() {
        return (C10782ld) zzb.l();
    }

    public static C10798md z(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10798md) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new C10798md();
        }
        C10766kd c10766kd = null;
        if (i11 == 4) {
            return new C10782ld(c10766kd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10702gd u() {
        C10702gd c10702gd = this.zzf;
        return c10702gd == null ? C10702gd.v() : c10702gd;
    }

    private C10798md() {
    }

    static /* synthetic */ void G(C10798md c10798md, C10702gd c10702gd) {
        c10702gd.getClass();
        c10798md.zzf = c10702gd;
    }
}
