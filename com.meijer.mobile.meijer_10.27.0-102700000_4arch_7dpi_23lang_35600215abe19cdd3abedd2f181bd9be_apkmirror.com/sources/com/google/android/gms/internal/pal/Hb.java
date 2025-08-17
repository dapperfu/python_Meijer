package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Hb extends B0 implements InterfaceC10706h1 {
    private static final Hb zzb;
    private int zze;

    public static Hb w() {
        return zzb;
    }

    public final int t() {
        return this.zze;
    }

    static {
        Hb hb2 = new Hb();
        zzb = hb2;
        B0.j(Hb.class, hb2);
    }

    public static Gb u() {
        return (Gb) zzb.l();
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
            return new Hb();
        }
        Fb fb2 = null;
        if (i11 == 4) {
            return new Gb(fb2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Hb() {
    }
}
