package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.dc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10776dc extends B0 implements InterfaceC10831h1 {
    private static final C10776dc zzb;
    private int zze;
    private int zzf;

    public final int t() {
        return this.zze;
    }

    static {
        C10776dc c10776dc = new C10776dc();
        zzb = c10776dc;
        B0.j(C10776dc.class, c10776dc);
    }

    public static C10759cc u() {
        return (C10759cc) zzb.l();
    }

    public static C10776dc w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10776dc) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i11 == 3) {
            return new C10776dc();
        }
        C10742bc c10742bc = null;
        if (i11 == 4) {
            return new C10759cc(c10742bc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10776dc() {
    }
}
