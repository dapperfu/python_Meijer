package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Qd extends B0 implements InterfaceC10831h1 {
    private static final Qd zzb;
    private String zze = "";

    public static Qd u() {
        return zzb;
    }

    public final String w() {
        return this.zze;
    }

    static {
        Qd qd2 = new Qd();
        zzb = qd2;
        B0.j(Qd.class, qd2);
    }

    public static Qd v(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (Qd) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new Qd();
        }
        Od od2 = null;
        if (i11 == 4) {
            return new Pd(od2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Qd() {
    }
}
