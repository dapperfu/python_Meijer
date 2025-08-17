package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Qb extends B0 implements InterfaceC10706h1 {
    private static final Qb zzb;
    private int zze;

    public static Qb w() {
        return zzb;
    }

    public final int t() {
        return this.zze;
    }

    static {
        Qb qb2 = new Qb();
        zzb = qb2;
        B0.j(Qb.class, qb2);
    }

    public static Pb u() {
        return (Pb) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new Qb();
        }
        Ob ob2 = null;
        if (i11 == 4) {
            return new Pb(ob2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Qb() {
    }
}
