package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11096xb extends B0 implements InterfaceC10831h1 {
    private static final C11096xb zzb;
    private Eb zze;
    private Uc zzf;

    static {
        C11096xb c11096xb = new C11096xb();
        zzb = c11096xb;
        B0.j(C11096xb.class, c11096xb);
    }

    public static C11080wb t() {
        return (C11080wb) zzb.l();
    }

    public static C11096xb v(AbstractC10730b0 abstractC10730b0, C10958p0 c10958p0) throws zzadi {
        return (C11096xb) B0.n(zzb, abstractC10730b0, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new C11096xb();
        }
        C11064vb c11064vb = null;
        if (i11 == 4) {
            return new C11080wb(c11064vb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final Eb w() {
        Eb eb2 = this.zze;
        return eb2 == null ? Eb.w() : eb2;
    }

    public final Uc y() {
        Uc uc2 = this.zzf;
        return uc2 == null ? Uc.w() : uc2;
    }

    private C11096xb() {
    }

    static /* synthetic */ void A(C11096xb c11096xb, Uc uc2) {
        uc2.getClass();
        c11096xb.zzf = uc2;
    }

    static /* synthetic */ void z(C11096xb c11096xb, Eb eb2) {
        eb2.getClass();
        c11096xb.zze = eb2;
    }
}
