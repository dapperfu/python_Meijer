package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Bb extends B0 implements InterfaceC10706h1 {
    private static final Bb zzb;
    private int zze;
    private Hb zzf;
    private AbstractC10605b0 zzg = AbstractC10605b0.f83055b;

    public static Bb w() {
        return zzb;
    }

    public final AbstractC10605b0 A() {
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

    public static Bb y(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (Bb) B0.n(zzb, abstractC10605b0, c10833p0);
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
        C10987yb c10987yb = null;
        if (i11 == 4) {
            return new Ab(c10987yb);
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
