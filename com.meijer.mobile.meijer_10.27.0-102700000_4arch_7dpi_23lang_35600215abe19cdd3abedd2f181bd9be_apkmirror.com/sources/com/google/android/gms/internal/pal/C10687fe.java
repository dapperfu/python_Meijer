package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.fe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10687fe extends B0 implements InterfaceC10706h1 {
    private static final C10687fe zzb;
    private int zze;
    private AbstractC10605b0 zzf = AbstractC10605b0.f83055b;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10605b0 y() {
        return this.zzf;
    }

    static {
        C10687fe c10687fe = new C10687fe();
        zzb = c10687fe;
        B0.j(C10687fe.class, c10687fe);
    }

    public static C10653de u() {
        return (C10653de) zzb.l();
    }

    public static C10687fe w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10687fe) B0.n(zzb, abstractC10605b0, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C10687fe();
        }
        C10636ce c10636ce = null;
        if (i11 == 4) {
            return new C10653de(c10636ce);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10687fe() {
    }
}
