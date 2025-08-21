package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10912m2 extends B0 implements InterfaceC10831h1 {
    private static final C10912m2 zzb;
    private int zze;
    private AbstractC10730b0 zzf;
    private AbstractC10730b0 zzg;

    static /* synthetic */ void v(C10912m2 c10912m2, AbstractC10730b0 abstractC10730b0) {
        c10912m2.zze |= 1;
        c10912m2.zzf = abstractC10730b0;
    }

    static /* synthetic */ void w(C10912m2 c10912m2, AbstractC10730b0 abstractC10730b0) {
        c10912m2.zze |= 2;
        c10912m2.zzg = abstractC10730b0;
    }

    static {
        C10912m2 c10912m2 = new C10912m2();
        zzb = c10912m2;
        B0.j(C10912m2.class, c10912m2);
    }

    public static C10896l2 t() {
        return (C10896l2) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10912m2();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C10896l2(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10912m2() {
        AbstractC10730b0 abstractC10730b0 = AbstractC10730b0.f83895b;
        this.zzf = abstractC10730b0;
        this.zzg = abstractC10730b0;
    }
}
