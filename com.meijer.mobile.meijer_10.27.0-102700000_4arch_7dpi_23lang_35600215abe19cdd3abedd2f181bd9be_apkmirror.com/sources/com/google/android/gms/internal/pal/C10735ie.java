package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.ie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10735ie extends B0 implements InterfaceC10706h1 {
    private static final C10735ie zzb;
    private int zze;

    public static C10735ie u() {
        return zzb;
    }

    static {
        C10735ie c10735ie = new C10735ie();
        zzb = c10735ie;
        B0.j(C10735ie.class, c10735ie);
    }

    public static C10735ie v(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10735ie) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new C10735ie();
        }
        C10703ge c10703ge = null;
        if (i11 == 4) {
            return new C10719he(c10703ge);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10735ie() {
    }
}
