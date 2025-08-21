package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Nb extends B0 implements InterfaceC10831h1 {
    private static final Nb zzb;
    private Qb zze;
    private int zzf;

    public final int t() {
        return this.zzf;
    }

    static {
        Nb nb2 = new Nb();
        zzb = nb2;
        B0.j(Nb.class, nb2);
    }

    public static Mb u() {
        return (Mb) zzb.l();
    }

    public static Nb w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (Nb) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new Nb();
        }
        Lb lb2 = null;
        if (i11 == 4) {
            return new Mb(lb2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Qb y() {
        Qb qb2 = this.zze;
        return qb2 == null ? Qb.w() : qb2;
    }

    private Nb() {
    }

    static /* synthetic */ void z(Nb nb2, Qb qb2) {
        qb2.getClass();
        nb2.zze = qb2;
    }
}
