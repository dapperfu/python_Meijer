package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10923ub extends B0 implements InterfaceC10706h1 {
    private static final C10923ub zzb;
    private int zze;
    private Bb zzf;
    private Rc zzg;

    public final int t() {
        return this.zze;
    }

    static {
        C10923ub c10923ub = new C10923ub();
        zzb = c10923ub;
        B0.j(C10923ub.class, c10923ub);
    }

    public static C10907tb u() {
        return (C10907tb) zzb.l();
    }

    public static C10923ub w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10923ub) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new C10923ub();
        }
        C10891sb c10891sb = null;
        if (i11 == 4) {
            return new C10907tb(c10891sb);
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

    private C10923ub() {
    }

    static /* synthetic */ void E(C10923ub c10923ub, Bb bb2) {
        bb2.getClass();
        c10923ub.zzf = bb2;
    }

    static /* synthetic */ void G(C10923ub c10923ub, Rc rc2) {
        rc2.getClass();
        c10923ub.zzg = rc2;
    }
}
