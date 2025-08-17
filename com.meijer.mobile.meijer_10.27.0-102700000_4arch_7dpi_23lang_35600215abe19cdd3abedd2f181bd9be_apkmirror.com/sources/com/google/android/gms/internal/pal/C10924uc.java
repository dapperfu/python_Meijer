package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.uc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10924uc extends B0 implements InterfaceC10706h1 {
    private static final C10924uc zzb;
    private C10957wd zze;

    public static C10924uc v() {
        return zzb;
    }

    static {
        C10924uc c10924uc = new C10924uc();
        zzb = c10924uc;
        B0.j(C10924uc.class, c10924uc);
    }

    public static C10908tc t() {
        return (C10908tc) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new C10924uc();
        }
        C10892sc c10892sc = null;
        if (i11 == 4) {
            return new C10908tc(c10892sc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10957wd w() {
        C10957wd c10957wd = this.zze;
        return c10957wd == null ? C10957wd.v() : c10957wd;
    }

    private C10924uc() {
    }

    static /* synthetic */ void y(C10924uc c10924uc, C10957wd c10957wd) {
        c10957wd.getClass();
        c10924uc.zze = c10957wd;
    }
}
