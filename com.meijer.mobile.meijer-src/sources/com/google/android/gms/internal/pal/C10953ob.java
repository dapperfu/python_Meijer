package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.ob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10953ob extends B0 implements InterfaceC10831h1 {
    private static final C10953ob zzb;
    private int zze;
    private C11000rb zzf;

    public final int t() {
        return this.zze;
    }

    static {
        C10953ob c10953ob = new C10953ob();
        zzb = c10953ob;
        B0.j(C10953ob.class, c10953ob);
    }

    public static C10937nb u() {
        return (C10937nb) zzb.l();
    }

    public static C10953ob w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10953ob) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C10953ob();
        }
        C10921mb c10921mb = null;
        if (i11 == 4) {
            return new C10937nb(c10921mb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C11000rb y() {
        C11000rb c11000rb = this.zzf;
        return c11000rb == null ? C11000rb.w() : c11000rb;
    }

    private C10953ob() {
    }

    static /* synthetic */ void A(C10953ob c10953ob, C11000rb c11000rb) {
        c11000rb.getClass();
        c10953ob.zzf = c11000rb;
    }
}
