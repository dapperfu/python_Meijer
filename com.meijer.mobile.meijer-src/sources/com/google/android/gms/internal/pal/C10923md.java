package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.md, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10923md extends B0 implements InterfaceC10831h1 {
    private static final C10923md zzb;
    private int zze;
    private C10827gd zzf;
    private AbstractC10730b0 zzg = AbstractC10730b0.f83895b;

    public static C10923md y() {
        return zzb;
    }

    public final AbstractC10730b0 A() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzf != null;
    }

    public final int t() {
        return this.zze;
    }

    static {
        C10923md c10923md = new C10923md();
        zzb = c10923md;
        B0.j(C10923md.class, c10923md);
    }

    public static C10907ld v() {
        return (C10907ld) zzb.l();
    }

    public static C10923md z(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10923md) B0.n(zzb, abstractC10730b0, c10958p0);
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
            return new C10923md();
        }
        C10891kd c10891kd = null;
        if (i11 == 4) {
            return new C10907ld(c10891kd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10827gd u() {
        C10827gd c10827gd = this.zzf;
        return c10827gd == null ? C10827gd.v() : c10827gd;
    }

    private C10923md() {
    }

    static /* synthetic */ void G(C10923md c10923md, C10827gd c10827gd) {
        c10827gd.getClass();
        c10923md.zzf = c10827gd;
    }
}
