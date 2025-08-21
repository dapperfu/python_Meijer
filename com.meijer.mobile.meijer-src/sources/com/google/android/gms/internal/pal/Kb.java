package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Kb extends B0 implements InterfaceC10831h1 {
    private static final Kb zzb;
    private int zze;
    private Qb zzf;
    private AbstractC10730b0 zzg = AbstractC10730b0.f83895b;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10730b0 z() {
        return this.zzg;
    }

    static {
        Kb kb2 = new Kb();
        zzb = kb2;
        B0.j(Kb.class, kb2);
    }

    public static Jb u() {
        return (Jb) zzb.l();
    }

    public static Kb w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (Kb) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new Kb();
        }
        Ib ib2 = null;
        if (i11 == 4) {
            return new Jb(ib2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Qb y() {
        Qb qb2 = this.zzf;
        return qb2 == null ? Qb.w() : qb2;
    }

    private Kb() {
    }

    static /* synthetic */ void E(Kb kb2, Qb qb2) {
        qb2.getClass();
        kb2.zzf = qb2;
    }
}
