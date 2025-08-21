package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Ed extends B0 implements InterfaceC10831h1 {
    private static final Ed zzb;
    private C11002rd zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public final boolean A() {
        return this.zze != null;
    }

    public final int E() {
        int i10 = this.zzf;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int G() {
        int iB = Yd.b(this.zzh);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int t() {
        return this.zzg;
    }

    static {
        Ed ed2 = new Ed();
        zzb = ed2;
        B0.j(Ed.class, ed2);
    }

    public static Cd v() {
        return (Cd) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new Ed();
        }
        Ad ad2 = null;
        if (i11 == 4) {
            return new Cd(ad2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C11002rd u() {
        C11002rd c11002rd = this.zze;
        return c11002rd == null ? C11002rd.w() : c11002rd;
    }

    private Ed() {
    }

    static /* synthetic */ void y(Ed ed2, C11002rd c11002rd) {
        c11002rd.getClass();
        ed2.zze = c11002rd;
    }
}
