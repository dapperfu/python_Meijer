package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.jc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10749jc extends B0 implements InterfaceC10706h1 {
    private static final C10749jc zzb;
    private int zze;
    private int zzf;

    public final int t() {
        return this.zze;
    }

    static {
        C10749jc c10749jc = new C10749jc();
        zzb = c10749jc;
        B0.j(C10749jc.class, c10749jc);
    }

    public static C10733ic u() {
        return (C10733ic) zzb.l();
    }

    public static C10749jc w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10749jc) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C10749jc();
        }
        C10717hc c10717hc = null;
        if (i11 == 4) {
            return new C10733ic(c10717hc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10749jc() {
    }
}
