package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Bb extends B0 implements InterfaceC10831h1 {
    private static final Bb zzb;
    private int zze;
    private Hb zzf;
    private AbstractC10730b0 zzg = AbstractC10730b0.f83895b;

    public static Bb w() {
        return zzb;
    }

    public final AbstractC10730b0 A() {
        return this.zzg;
    }

    public final int t() {
        return this.zze;
    }

    static {
        Bb bb2 = new Bb();
        zzb = bb2;
        B0.j(Bb.class, bb2);
    }

    public static Ab u() {
        return (Ab) zzb.l();
    }

    public static Bb y(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (Bb) B0.n(zzb, abstractC10730b0, c10958p0);
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
            return new Bb();
        }
        C11112yb c11112yb = null;
        if (i11 == 4) {
            return new Ab(c11112yb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Hb z() {
        Hb hb2 = this.zzf;
        return hb2 == null ? Hb.w() : hb2;
    }

    private Bb() {
    }

    static /* synthetic */ void G(Bb bb2, Hb hb2) {
        hb2.getClass();
        bb2.zzf = hb2;
    }
}
