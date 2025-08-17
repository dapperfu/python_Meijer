package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10797mc extends B0 implements InterfaceC10706h1 {
    private static final C10797mc zzb;
    private int zze;
    private AbstractC10605b0 zzf = AbstractC10605b0.f83055b;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10605b0 y() {
        return this.zzf;
    }

    static {
        C10797mc c10797mc = new C10797mc();
        zzb = c10797mc;
        B0.j(C10797mc.class, c10797mc);
    }

    public static C10781lc u() {
        return (C10781lc) zzb.l();
    }

    public static C10797mc w(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10797mc) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new C10797mc();
        }
        C10765kc c10765kc = null;
        if (i11 == 4) {
            return new C10781lc(c10765kc);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10797mc() {
    }
}
