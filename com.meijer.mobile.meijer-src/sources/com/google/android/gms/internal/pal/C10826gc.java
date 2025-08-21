package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.gc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10826gc extends B0 implements InterfaceC10831h1 {
    private static final C10826gc zzb;
    private int zze;
    private AbstractC10730b0 zzf = AbstractC10730b0.f83895b;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10730b0 y() {
        return this.zzf;
    }

    static {
        C10826gc c10826gc = new C10826gc();
        zzb = c10826gc;
        B0.j(C10826gc.class, c10826gc);
    }

    public static C10810fc u() {
        return (C10810fc) zzb.l();
    }

    public static C10826gc w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10826gc) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C10826gc();
        }
        C10793ec c10793ec = null;
        if (i11 == 4) {
            return new C10810fc(c10793ec);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10826gc() {
    }
}
