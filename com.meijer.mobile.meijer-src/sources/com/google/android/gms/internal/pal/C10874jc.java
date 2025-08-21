package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.jc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10874jc extends B0 implements InterfaceC10831h1 {
    private static final C10874jc zzb;
    private int zze;
    private int zzf;

    public final int t() {
        return this.zze;
    }

    static {
        C10874jc c10874jc = new C10874jc();
        zzb = c10874jc;
        B0.j(C10874jc.class, c10874jc);
    }

    public static C10858ic u() {
        return (C10858ic) zzb.l();
    }

    public static C10874jc w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10874jc) B0.n(zzb, abstractC10730b0, c10958p0);
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
            return new C10874jc();
        }
        C10842hc c10842hc = null;
        if (i11 == 4) {
            return new C10858ic(c10842hc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10874jc() {
    }
}
