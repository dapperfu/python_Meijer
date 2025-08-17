package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Hc extends B0 implements InterfaceC10706h1 {
    private static final Hc zzb;
    private int zze;
    private Ac zzf;
    private AbstractC10605b0 zzg;
    private AbstractC10605b0 zzh;

    static /* synthetic */ void G(Hc hc2, int i10) {
        hc2.zze = 0;
    }

    public static Hc y() {
        return zzb;
    }

    public final AbstractC10605b0 A() {
        return this.zzg;
    }

    public final AbstractC10605b0 E() {
        return this.zzh;
    }

    public final int t() {
        return this.zze;
    }

    static {
        Hc hc2 = new Hc();
        zzb = hc2;
        B0.j(Hc.class, hc2);
    }

    public static Gc v() {
        return (Gc) zzb.l();
    }

    public static Hc z(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (Hc) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new Hc();
        }
        Fc fc2 = null;
        if (i11 == 4) {
            return new Gc(fc2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Ac u() {
        Ac ac2 = this.zzf;
        return ac2 == null ? Ac.w() : ac2;
    }

    private Hc() {
        AbstractC10605b0 abstractC10605b0 = AbstractC10605b0.f83055b;
        this.zzg = abstractC10605b0;
        this.zzh = abstractC10605b0;
    }

    static /* synthetic */ void H(Hc hc2, Ac ac2) {
        ac2.getClass();
        hc2.zzf = ac2;
    }
}
