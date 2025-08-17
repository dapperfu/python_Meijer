package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Rc extends B0 implements InterfaceC10706h1 {
    private static final Rc zzb;
    private int zze;
    private Xc zzf;
    private AbstractC10605b0 zzg = AbstractC10605b0.f83055b;

    public static Rc w() {
        return zzb;
    }

    public final AbstractC10605b0 A() {
        return this.zzg;
    }

    public final int t() {
        return this.zze;
    }

    static {
        Rc rc2 = new Rc();
        zzb = rc2;
        B0.j(Rc.class, rc2);
    }

    public static Qc u() {
        return (Qc) zzb.l();
    }

    public static Rc y(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (Rc) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new Rc();
        }
        Pc pc2 = null;
        if (i11 == 4) {
            return new Qc(pc2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Xc z() {
        Xc xc2 = this.zzf;
        return xc2 == null ? Xc.w() : xc2;
    }

    private Rc() {
    }

    static /* synthetic */ void G(Rc rc2, Xc xc2) {
        xc2.getClass();
        rc2.zzf = xc2;
    }
}
