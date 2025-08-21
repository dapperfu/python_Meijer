package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Kc extends B0 implements InterfaceC10831h1 {
    private static final Kc zzb;
    private int zze;
    private int zzf;
    private AbstractC10730b0 zzg = AbstractC10730b0.f83895b;

    public static Kc v() {
        return zzb;
    }

    public final int A() {
        int iB = Oc.b(this.zzf);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final AbstractC10730b0 w() {
        return this.zzg;
    }

    public final int z() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    static {
        Kc kc2 = new Kc();
        zzb = kc2;
        B0.j(Kc.class, kc2);
    }

    public static Jc t() {
        return (Jc) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new Kc();
        }
        Ic ic2 = null;
        if (i11 == 4) {
            return new Jc(ic2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Kc() {
    }
}
