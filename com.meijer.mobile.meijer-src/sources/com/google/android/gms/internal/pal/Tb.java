package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Tb extends B0 implements InterfaceC10831h1 {
    private static final Tb zzb;
    private int zze;
    private AbstractC10730b0 zzf = AbstractC10730b0.f83895b;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10730b0 y() {
        return this.zzf;
    }

    static {
        Tb tb2 = new Tb();
        zzb = tb2;
        B0.j(Tb.class, tb2);
    }

    public static Sb u() {
        return (Sb) zzb.l();
    }

    public static Tb w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (Tb) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new Tb();
        }
        Rb rb2 = null;
        if (i11 == 4) {
            return new Sb(rb2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Tb() {
    }
}
