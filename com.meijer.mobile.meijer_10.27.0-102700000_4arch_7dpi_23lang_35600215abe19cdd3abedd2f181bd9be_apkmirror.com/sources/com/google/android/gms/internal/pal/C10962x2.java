package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10962x2 extends B0 implements InterfaceC10706h1 {
    private static final C10962x2 zzb;
    private int zze;
    private I0 zzf = B0.q();
    private AbstractC10605b0 zzg = AbstractC10605b0.f83055b;
    private int zzh = 1;
    private int zzi = 1;

    static /* synthetic */ void w(C10962x2 c10962x2, AbstractC10605b0 abstractC10605b0) {
        c10962x2.zze |= 1;
        c10962x2.zzg = abstractC10605b0;
    }

    static /* synthetic */ void y(C10962x2 c10962x2, int i10) {
        c10962x2.zzi = 2;
        c10962x2.zze |= 4;
    }

    static {
        C10962x2 c10962x2 = new C10962x2();
        zzb = c10962x2;
        B0.j(C10962x2.class, c10962x2);
    }

    public static C10946w2 t() {
        return (C10946w2) zzb.l();
    }

    static /* synthetic */ void v(C10962x2 c10962x2, AbstractC10605b0 abstractC10605b0) {
        I0 i02 = c10962x2.zzf;
        if (!i02.zzc()) {
            c10962x2.zzf = B0.f(i02);
        }
        c10962x2.zzf.add(abstractC10605b0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C10866r2.f83830a, "zzi", C10835p2.f83275a});
        }
        if (i11 == 3) {
            return new C10962x2();
        }
        C10986ya c10986ya = null;
        if (i11 == 4) {
            return new C10946w2(c10986ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10962x2() {
    }
}
