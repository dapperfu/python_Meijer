package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10972xc extends B0 implements InterfaceC10706h1 {
    private static final C10972xc zzb;
    private Ac zze;

    static {
        C10972xc c10972xc = new C10972xc();
        zzb = c10972xc;
        B0.j(C10972xc.class, c10972xc);
    }

    public static C10956wc t() {
        return (C10956wc) zzb.l();
    }

    public static C10972xc v(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10972xc) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new C10972xc();
        }
        C10940vc c10940vc = null;
        if (i11 == 4) {
            return new C10956wc(c10940vc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Ac w() {
        Ac ac2 = this.zze;
        return ac2 == null ? Ac.w() : ac2;
    }

    private C10972xc() {
    }

    static /* synthetic */ void y(C10972xc c10972xc, Ac ac2) {
        ac2.getClass();
        c10972xc.zze = ac2;
    }
}
