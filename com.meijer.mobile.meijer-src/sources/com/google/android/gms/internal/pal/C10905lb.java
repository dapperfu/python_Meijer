package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10905lb extends B0 implements InterfaceC10831h1 {
    private static final C10905lb zzb;
    private int zze;
    private AbstractC10730b0 zzf = AbstractC10730b0.f83895b;
    private C11000rb zzg;

    public final int t() {
        return this.zze;
    }

    public final AbstractC10730b0 z() {
        return this.zzf;
    }

    static {
        C10905lb c10905lb = new C10905lb();
        zzb = c10905lb;
        B0.j(C10905lb.class, c10905lb);
    }

    public static C10889kb u() {
        return (C10889kb) zzb.l();
    }

    public static C10905lb w(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C10905lb) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10905lb();
        }
        C10873jb c10873jb = null;
        if (i11 == 4) {
            return new C10889kb(c10873jb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C11000rb y() {
        C11000rb c11000rb = this.zzg;
        return c11000rb == null ? C11000rb.w() : c11000rb;
    }

    private C10905lb() {
    }

    static /* synthetic */ void G(C10905lb c10905lb, C11000rb c11000rb) {
        c11000rb.getClass();
        c10905lb.zzg = c11000rb;
    }
}
