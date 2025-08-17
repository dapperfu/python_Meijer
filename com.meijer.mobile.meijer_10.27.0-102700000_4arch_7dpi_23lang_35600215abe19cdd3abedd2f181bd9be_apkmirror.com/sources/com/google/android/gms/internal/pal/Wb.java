package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Wb extends B0 implements InterfaceC10706h1 {
    private static final Wb zzb;
    private int zze;
    private int zzf;

    public final int t() {
        return this.zze;
    }

    static {
        Wb wb2 = new Wb();
        zzb = wb2;
        B0.j(Wb.class, wb2);
    }

    public static Vb u() {
        return (Vb) zzb.l();
    }

    public static Wb w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (Wb) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new Wb();
        }
        Ub ub2 = null;
        if (i11 == 4) {
            return new Vb(ub2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Wb() {
    }
}
