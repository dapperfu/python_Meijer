package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10780lb extends B0 implements InterfaceC10706h1 {
    private static final C10780lb zzb;
    private int zze;
    private AbstractC10605b0 zzf = AbstractC10605b0.f83055b;
    private C10875rb zzg;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10605b0 z() {
        return this.zzf;
    }

    static {
        C10780lb c10780lb = new C10780lb();
        zzb = c10780lb;
        B0.j(C10780lb.class, c10780lb);
    }

    public static C10764kb u() {
        return (C10764kb) zzb.l();
    }

    public static C10780lb w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10780lb) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10780lb();
        }
        C10748jb c10748jb = null;
        if (i11 == 4) {
            return new C10764kb(c10748jb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10875rb y() {
        C10875rb c10875rb = this.zzg;
        return c10875rb == null ? C10875rb.w() : c10875rb;
    }

    private C10780lb() {
    }

    static /* synthetic */ void G(C10780lb c10780lb, C10875rb c10875rb) {
        c10875rb.getClass();
        c10780lb.zzg = c10875rb;
    }
}
