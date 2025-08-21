package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10334d extends K0 implements InterfaceC10375q1 {
    private static final C10334d zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private w2 zzg;
    private m2 zzh;
    private u2 zzi;
    private r2 zzj;

    static {
        C10334d c10334d = new C10334d();
        zzb = c10334d;
        K0.o(C10334d.class, c10334d);
    }

    public static C10331c q() {
        return (C10331c) zzb.g();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005<\u0000\u0006<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", "zzj", C10327b.class, p2.class});
        }
        if (i11 == 3) {
            return new C10334d();
        }
        C10330b2 c10330b2 = null;
        if (i11 == 4) {
            return new C10331c(c10330b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10334d() {
    }

    static /* synthetic */ void s(C10334d c10334d, r2 r2Var) {
        r2Var.getClass();
        c10334d.zzj = r2Var;
        c10334d.zzd |= 8;
    }

    static /* synthetic */ void t(C10334d c10334d, C10327b c10327b) {
        c10327b.getClass();
        c10334d.zzf = c10327b;
        c10334d.zze = 5;
    }

    static /* synthetic */ void u(C10334d c10334d, p2 p2Var) {
        p2Var.getClass();
        c10334d.zzf = p2Var;
        c10334d.zze = 6;
    }

    static /* synthetic */ void v(C10334d c10334d, w2 w2Var) {
        w2Var.getClass();
        c10334d.zzg = w2Var;
        c10334d.zzd |= 1;
    }

    static /* synthetic */ void w(C10334d c10334d, m2 m2Var) {
        m2Var.getClass();
        c10334d.zzh = m2Var;
        c10334d.zzd |= 2;
    }

    static /* synthetic */ void x(C10334d c10334d, u2 u2Var) {
        u2Var.getClass();
        c10334d.zzi = u2Var;
        c10334d.zzd |= 4;
    }
}
