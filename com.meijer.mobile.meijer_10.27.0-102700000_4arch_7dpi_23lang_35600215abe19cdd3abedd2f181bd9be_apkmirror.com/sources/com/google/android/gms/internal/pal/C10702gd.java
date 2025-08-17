package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.gd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10702gd extends B0 implements InterfaceC10706h1 {
    private static final C10702gd zzb;
    private int zze;
    private int zzf;
    private int zzg;

    public static C10702gd v() {
        return zzb;
    }

    public final int w() {
        int i10 = this.zzg;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int y() {
        int i10 = this.zzf;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int z() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    static {
        C10702gd c10702gd = new C10702gd();
        zzb = c10702gd;
        B0.j(C10702gd.class, c10702gd);
    }

    public static C10686fd t() {
        return (C10686fd) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10702gd();
        }
        C10669ed c10669ed = null;
        if (i11 == 4) {
            return new C10686fd(c10669ed);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10702gd() {
    }
}
