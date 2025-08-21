package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.ie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10860ie extends B0 implements InterfaceC10831h1 {
    private static final C10860ie zzb;
    private int zze;

    public static C10860ie u() {
        return zzb;
    }

    static {
        C10860ie c10860ie = new C10860ie();
        zzb = c10860ie;
        B0.j(C10860ie.class, c10860ie);
    }

    public static C10860ie v(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10860ie) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new C10860ie();
        }
        C10828ge c10828ge = null;
        if (i11 == 4) {
            return new C10844he(c10828ge);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10860ie() {
    }
}
