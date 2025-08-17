package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.dc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10651dc extends B0 implements InterfaceC10706h1 {
    private static final C10651dc zzb;
    private int zze;
    private int zzf;

    public final int t() {
        return this.zze;
    }

    static {
        C10651dc c10651dc = new C10651dc();
        zzb = c10651dc;
        B0.j(C10651dc.class, c10651dc);
    }

    public static C10634cc u() {
        return (C10634cc) zzb.l();
    }

    public static C10651dc w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10651dc) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new C10651dc();
        }
        C10617bc c10617bc = null;
        if (i11 == 4) {
            return new C10634cc(c10617bc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10651dc() {
    }
}
