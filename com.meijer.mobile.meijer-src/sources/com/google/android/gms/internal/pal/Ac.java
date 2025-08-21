package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Ac extends B0 implements InterfaceC10831h1 {
    private static final Ac zzb;
    private Kc zze;
    private C11049uc zzf;
    private int zzg;

    public static Ac w() {
        return zzb;
    }

    public final int E() {
        int i10 = this.zzg;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    static {
        Ac ac2 = new Ac();
        zzb = ac2;
        B0.j(Ac.class, ac2);
    }

    public static C11129zc u() {
        return (C11129zc) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new Ac();
        }
        C11113yc c11113yc = null;
        if (i11 == 4) {
            return new C11129zc(c11113yc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C11049uc t() {
        C11049uc c11049uc = this.zzf;
        return c11049uc == null ? C11049uc.v() : c11049uc;
    }

    public final Kc y() {
        Kc kc2 = this.zze;
        return kc2 == null ? Kc.v() : kc2;
    }

    private Ac() {
    }

    static /* synthetic */ void A(Ac ac2, C11049uc c11049uc) {
        c11049uc.getClass();
        ac2.zzf = c11049uc;
    }

    static /* synthetic */ void z(Ac ac2, Kc kc2) {
        kc2.getClass();
        ac2.zze = kc2;
    }
}
