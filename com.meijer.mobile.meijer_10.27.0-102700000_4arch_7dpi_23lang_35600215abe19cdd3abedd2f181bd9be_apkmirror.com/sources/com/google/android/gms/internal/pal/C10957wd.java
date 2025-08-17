package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.wd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10957wd extends B0 implements InterfaceC10706h1 {
    private static final C10957wd zzb;
    private String zze = "";
    private AbstractC10605b0 zzf = AbstractC10605b0.f83055b;
    private int zzg;

    public static C10957wd v() {
        return zzb;
    }

    public final int E() {
        int iB = Yd.b(this.zzg);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final AbstractC10605b0 w() {
        return this.zzf;
    }

    public final String y() {
        return this.zze;
    }

    static {
        C10957wd c10957wd = new C10957wd();
        zzb = c10957wd;
        B0.j(C10957wd.class, c10957wd);
    }

    public static C10941vd t() {
        return (C10941vd) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10957wd();
        }
        C10925ud c10925ud = null;
        if (i11 == 4) {
            return new C10941vd(c10925ud);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10957wd() {
    }

    static /* synthetic */ void z(C10957wd c10957wd, String str) {
        str.getClass();
        c10957wd.zze = str;
    }
}
