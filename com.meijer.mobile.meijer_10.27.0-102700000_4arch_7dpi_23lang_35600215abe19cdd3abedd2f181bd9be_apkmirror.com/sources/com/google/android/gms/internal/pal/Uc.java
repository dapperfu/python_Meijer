package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Uc extends B0 implements InterfaceC10706h1 {
    private static final Uc zzb;
    private Xc zze;
    private int zzf;
    private int zzg;

    public static Uc w() {
        return zzb;
    }

    public final int t() {
        return this.zzf;
    }

    static {
        Uc uc2 = new Uc();
        zzb = uc2;
        B0.j(Uc.class, uc2);
    }

    public static Tc u() {
        return (Tc) zzb.l();
    }

    public static Uc y(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (Uc) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new Uc();
        }
        Sc sc2 = null;
        if (i11 == 4) {
            return new Tc(sc2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Xc z() {
        Xc xc2 = this.zze;
        return xc2 == null ? Xc.w() : xc2;
    }

    private Uc() {
    }

    static /* synthetic */ void A(Uc uc2, Xc xc2) {
        xc2.getClass();
        uc2.zze = xc2;
    }
}
