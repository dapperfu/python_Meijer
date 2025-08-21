package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11048ub extends B0 implements InterfaceC10831h1 {
    private static final C11048ub zzb;
    private int zze;
    private Bb zzf;
    private Rc zzg;

    public final int t() {
        return this.zze;
    }

    static {
        C11048ub c11048ub = new C11048ub();
        zzb = c11048ub;
        B0.j(C11048ub.class, c11048ub);
    }

    public static C11032tb u() {
        return (C11032tb) zzb.l();
    }

    public static C11048ub w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C11048ub) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C11048ub();
        }
        C11016sb c11016sb = null;
        if (i11 == 4) {
            return new C11032tb(c11016sb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Bb y() {
        Bb bb2 = this.zzf;
        return bb2 == null ? Bb.w() : bb2;
    }

    public final Rc z() {
        Rc rc2 = this.zzg;
        return rc2 == null ? Rc.w() : rc2;
    }

    private C11048ub() {
    }

    static /* synthetic */ void E(C11048ub c11048ub, Bb bb2) {
        bb2.getClass();
        c11048ub.zzf = bb2;
    }

    static /* synthetic */ void G(C11048ub c11048ub, Rc rc2) {
        rc2.getClass();
        c11048ub.zzg = rc2;
    }
}
