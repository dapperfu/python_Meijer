package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10209d extends K0 implements InterfaceC10250q1 {
    private static final C10209d zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private w2 zzg;
    private m2 zzh;
    private u2 zzi;
    private r2 zzj;

    static {
        C10209d c10209d = new C10209d();
        zzb = c10209d;
        K0.o(C10209d.class, c10209d);
    }

    public static C10206c q() {
        return (C10206c) zzb.g();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005<\u0000\u0006<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", "zzj", C10202b.class, p2.class});
        }
        if (i11 == 3) {
            return new C10209d();
        }
        C10205b2 c10205b2 = null;
        if (i11 == 4) {
            return new C10206c(c10205b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10209d() {
    }

    static /* synthetic */ void s(C10209d c10209d, r2 r2Var) {
        r2Var.getClass();
        c10209d.zzj = r2Var;
        c10209d.zzd |= 8;
    }

    static /* synthetic */ void t(C10209d c10209d, C10202b c10202b) {
        c10202b.getClass();
        c10209d.zzf = c10202b;
        c10209d.zze = 5;
    }

    static /* synthetic */ void u(C10209d c10209d, p2 p2Var) {
        p2Var.getClass();
        c10209d.zzf = p2Var;
        c10209d.zze = 6;
    }

    static /* synthetic */ void v(C10209d c10209d, w2 w2Var) {
        w2Var.getClass();
        c10209d.zzg = w2Var;
        c10209d.zzd |= 1;
    }

    static /* synthetic */ void w(C10209d c10209d, m2 m2Var) {
        m2Var.getClass();
        c10209d.zzh = m2Var;
        c10209d.zzd |= 2;
    }

    static /* synthetic */ void x(C10209d c10209d, u2 u2Var) {
        u2Var.getClass();
        c10209d.zzi = u2Var;
        c10209d.zzd |= 4;
    }
}
