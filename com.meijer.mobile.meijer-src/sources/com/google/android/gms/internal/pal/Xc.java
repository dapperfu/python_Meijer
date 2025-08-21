package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Xc extends B0 implements InterfaceC10831h1 {
    private static final Xc zzb;
    private int zze;
    private int zzf;

    public static Xc w() {
        return zzb;
    }

    public final int t() {
        return this.zzf;
    }

    public final int z() {
        int iB = Oc.b(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    static {
        Xc xc2 = new Xc();
        zzb = xc2;
        B0.j(Xc.class, xc2);
    }

    public static Wc u() {
        return (Wc) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new Xc();
        }
        Vc vc2 = null;
        if (i11 == 4) {
            return new Wc(vc2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private Xc() {
    }
}
