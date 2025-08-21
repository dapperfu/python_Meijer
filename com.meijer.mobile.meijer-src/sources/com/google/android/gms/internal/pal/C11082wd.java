package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.wd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11082wd extends B0 implements InterfaceC10831h1 {
    private static final C11082wd zzb;
    private String zze = "";
    private AbstractC10730b0 zzf = AbstractC10730b0.f83895b;
    private int zzg;

    public static C11082wd v() {
        return zzb;
    }

    public final int E() {
        int iB = Yd.b(this.zzg);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final AbstractC10730b0 w() {
        return this.zzf;
    }

    public final String y() {
        return this.zze;
    }

    static {
        C11082wd c11082wd = new C11082wd();
        zzb = c11082wd;
        B0.j(C11082wd.class, c11082wd);
    }

    public static C11066vd t() {
        return (C11066vd) zzb.l();
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
            return new C11082wd();
        }
        C11050ud c11050ud = null;
        if (i11 == 4) {
            return new C11066vd(c11050ud);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C11082wd() {
    }

    static /* synthetic */ void z(C11082wd c11082wd, String str) {
        str.getClass();
        c11082wd.zze = str;
    }
}
