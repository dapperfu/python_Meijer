package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11097xc extends B0 implements InterfaceC10831h1 {
    private static final C11097xc zzb;
    private Ac zze;

    static {
        C11097xc c11097xc = new C11097xc();
        zzb = c11097xc;
        B0.j(C11097xc.class, c11097xc);
    }

    public static C11081wc t() {
        return (C11081wc) zzb.l();
    }

    public static C11097xc v(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C11097xc) B0.n(zzb, abstractC10730b0, c10958p0);
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
            return new C11097xc();
        }
        C11065vc c11065vc = null;
        if (i11 == 4) {
            return new C11081wc(c11065vc);
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

    private C11097xc() {
    }

    static /* synthetic */ void y(C11097xc c11097xc, Ac ac2) {
        ac2.getClass();
        c11097xc.zze = ac2;
    }
}
