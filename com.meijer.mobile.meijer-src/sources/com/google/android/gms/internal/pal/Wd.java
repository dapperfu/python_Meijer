package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Wd extends B0 implements InterfaceC10831h1 {
    private static final Wd zzb;
    private String zze = "";
    private C11082wd zzf;

    public static Wd v() {
        return zzb;
    }

    public final String y() {
        return this.zze;
    }

    public final boolean z() {
        return this.zzf != null;
    }

    static {
        Wd wd2 = new Wd();
        zzb = wd2;
        B0.j(Wd.class, wd2);
    }

    public static Wd w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (Wd) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new Wd();
        }
        Ud ud2 = null;
        if (i11 == 4) {
            return new Vd(ud2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C11082wd t() {
        C11082wd c11082wd = this.zzf;
        return c11082wd == null ? C11082wd.v() : c11082wd;
    }

    private Wd() {
    }
}
