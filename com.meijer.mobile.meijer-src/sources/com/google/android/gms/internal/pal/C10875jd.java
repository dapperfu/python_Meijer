package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.jd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10875jd extends B0 implements InterfaceC10831h1 {
    private static final C10875jd zzb;
    private int zze;
    private C10923md zzf;
    private AbstractC10730b0 zzg = AbstractC10730b0.f83895b;

    public final boolean H() {
        return this.zzf != null;
    }

    public final int t() {
        return this.zze;
    }

    public final AbstractC10730b0 z() {
        return this.zzg;
    }

    static {
        C10875jd c10875jd = new C10875jd();
        zzb = c10875jd;
        B0.j(C10875jd.class, c10875jd);
    }

    public static C10859id u() {
        return (C10859id) zzb.l();
    }

    public static C10875jd w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10875jd) B0.n(zzb, abstractC10730b0, c10958p0);
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
            return new C10875jd();
        }
        C10843hd c10843hd = null;
        if (i11 == 4) {
            return new C10859id(c10843hd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10923md y() {
        C10923md c10923md = this.zzf;
        return c10923md == null ? C10923md.y() : c10923md;
    }

    private C10875jd() {
    }

    static /* synthetic */ void E(C10875jd c10875jd, C10923md c10923md) {
        c10923md.getClass();
        c10875jd.zzf = c10923md;
    }
}
