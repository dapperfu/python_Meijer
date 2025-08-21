package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.gd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10827gd extends B0 implements InterfaceC10831h1 {
    private static final C10827gd zzb;
    private int zze;
    private int zzf;
    private int zzg;

    public static C10827gd v() {
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
        C10827gd c10827gd = new C10827gd();
        zzb = c10827gd;
        B0.j(C10827gd.class, c10827gd);
    }

    public static C10811fd t() {
        return (C10811fd) zzb.l();
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
            return new C10827gd();
        }
        C10794ed c10794ed = null;
        if (i11 == 4) {
            return new C10811fd(c10794ed);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10827gd() {
    }
}
