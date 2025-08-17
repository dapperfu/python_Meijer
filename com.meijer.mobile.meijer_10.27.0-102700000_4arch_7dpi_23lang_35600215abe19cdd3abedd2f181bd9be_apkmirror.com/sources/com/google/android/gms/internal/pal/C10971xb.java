package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10971xb extends B0 implements InterfaceC10706h1 {
    private static final C10971xb zzb;
    private Eb zze;
    private Uc zzf;

    static {
        C10971xb c10971xb = new C10971xb();
        zzb = c10971xb;
        B0.j(C10971xb.class, c10971xb);
    }

    public static C10955wb t() {
        return (C10955wb) zzb.l();
    }

    public static C10971xb v(AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        return (C10971xb) B0.n(zzb, abstractC10605b0, c10833p0);
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
            return new C10971xb();
        }
        C10939vb c10939vb = null;
        if (i11 == 4) {
            return new C10955wb(c10939vb);
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

    private C10971xb() {
    }

    static /* synthetic */ void A(C10971xb c10971xb, Uc uc2) {
        uc2.getClass();
        c10971xb.zzf = uc2;
    }

    static /* synthetic */ void z(C10971xb c10971xb, Eb eb2) {
        eb2.getClass();
        c10971xb.zze = eb2;
    }
}
