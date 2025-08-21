package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Nd extends B0 implements InterfaceC10831h1 {
    private static final Nd zzb;
    private int zze;
    private Qd zzf;

    public final int t() {
        return this.zze;
    }

    static {
        Nd nd2 = new Nd();
        zzb = nd2;
        B0.j(Nd.class, nd2);
    }

    public static Md u() {
        return (Md) zzb.l();
    }

    public static Nd w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (Nd) B0.n(zzb, abstractC10730b0, c10958p0);
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
            return new Nd();
        }
        Ld ld2 = null;
        if (i11 == 4) {
            return new Md(ld2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Qd y() {
        Qd qd2 = this.zzf;
        return qd2 == null ? Qd.u() : qd2;
    }

    private Nd() {
    }

    static /* synthetic */ void A(Nd nd2, Qd qd2) {
        qd2.getClass();
        nd2.zzf = qd2;
    }
}
