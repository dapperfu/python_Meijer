package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.uc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11049uc extends B0 implements InterfaceC10831h1 {
    private static final C11049uc zzb;
    private C11082wd zze;

    public static C11049uc v() {
        return zzb;
    }

    static {
        C11049uc c11049uc = new C11049uc();
        zzb = c11049uc;
        B0.j(C11049uc.class, c11049uc);
    }

    public static C11033tc t() {
        return (C11033tc) zzb.l();
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
            return new C11049uc();
        }
        C11017sc c11017sc = null;
        if (i11 == 4) {
            return new C11033tc(c11017sc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C11082wd w() {
        C11082wd c11082wd = this.zze;
        return c11082wd == null ? C11082wd.v() : c11082wd;
    }

    private C11049uc() {
    }

    static /* synthetic */ void y(C11049uc c11049uc, C11082wd c11082wd) {
        c11082wd.getClass();
        c11049uc.zze = c11082wd;
    }
}
