package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11087x2 extends B0 implements InterfaceC10831h1 {
    private static final C11087x2 zzb;
    private int zze;
    private I0 zzf = B0.q();
    private AbstractC10730b0 zzg = AbstractC10730b0.f83895b;
    private int zzh = 1;
    private int zzi = 1;

    static /* synthetic */ void w(C11087x2 c11087x2, AbstractC10730b0 abstractC10730b0) {
        c11087x2.zze |= 1;
        c11087x2.zzg = abstractC10730b0;
    }

    static /* synthetic */ void y(C11087x2 c11087x2, int i10) {
        c11087x2.zzi = 2;
        c11087x2.zze |= 4;
    }

    static {
        C11087x2 c11087x2 = new C11087x2();
        zzb = c11087x2;
        B0.j(C11087x2.class, c11087x2);
    }

    public static C11071w2 t() {
        return (C11071w2) zzb.l();
    }

    static /* synthetic */ void v(C11087x2 c11087x2, AbstractC10730b0 abstractC10730b0) {
        I0 i02 = c11087x2.zzf;
        if (!i02.zzc()) {
            c11087x2.zzf = B0.f(i02);
        }
        c11087x2.zzf.add(abstractC10730b0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C10991r2.f84670a, "zzi", C10960p2.f84115a});
        }
        if (i11 == 3) {
            return new C11087x2();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C11071w2(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C11087x2() {
    }
}
