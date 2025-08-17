package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Td extends B0 implements InterfaceC10706h1 {
    private static final Td zzb;
    private int zze;
    private Wd zzf;

    public final int t() {
        return this.zze;
    }

    static {
        Td td2 = new Td();
        zzb = td2;
        B0.j(Td.class, td2);
    }

    public static Sd u() {
        return (Sd) zzb.l();
    }

    public static Td w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (Td) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new Td();
        }
        Rd rd2 = null;
        if (i11 == 4) {
            return new Sd(rd2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Wd y() {
        Wd wd2 = this.zzf;
        return wd2 == null ? Wd.v() : wd2;
    }

    private Td() {
    }

    static /* synthetic */ void A(Td td2, Wd wd2) {
        wd2.getClass();
        td2.zzf = wd2;
    }
}
