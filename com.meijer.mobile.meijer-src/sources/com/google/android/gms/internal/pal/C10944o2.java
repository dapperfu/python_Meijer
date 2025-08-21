package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10944o2 extends B0 implements InterfaceC10831h1 {
    private static final C10944o2 zzb;
    private int zze;
    private AbstractC10730b0 zzf;
    private AbstractC10730b0 zzg;
    private AbstractC10730b0 zzh;
    private AbstractC10730b0 zzi;

    static /* synthetic */ void E(C10944o2 c10944o2, AbstractC10730b0 abstractC10730b0) {
        c10944o2.zze |= 1;
        c10944o2.zzf = abstractC10730b0;
    }

    static /* synthetic */ void G(C10944o2 c10944o2, AbstractC10730b0 abstractC10730b0) {
        c10944o2.zze |= 2;
        c10944o2.zzg = abstractC10730b0;
    }

    static /* synthetic */ void H(C10944o2 c10944o2, AbstractC10730b0 abstractC10730b0) {
        c10944o2.zze |= 4;
        c10944o2.zzh = abstractC10730b0;
    }

    static /* synthetic */ void I(C10944o2 c10944o2, AbstractC10730b0 abstractC10730b0) {
        c10944o2.zze |= 8;
        c10944o2.zzi = abstractC10730b0;
    }

    public final AbstractC10730b0 A() {
        return this.zzh;
    }

    public final AbstractC10730b0 w() {
        return this.zzf;
    }

    public final AbstractC10730b0 y() {
        return this.zzg;
    }

    public final AbstractC10730b0 z() {
        return this.zzi;
    }

    static {
        C10944o2 c10944o2 = new C10944o2();
        zzb = c10944o2;
        B0.j(C10944o2.class, c10944o2);
    }

    public static C10928n2 t() {
        return (C10928n2) zzb.l();
    }

    public static C10944o2 v(byte[] bArr, C10958p0 c10958p0) throws zzadi {
        return (C10944o2) B0.o(zzb, bArr, c10958p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C10944o2();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C10928n2(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10944o2() {
        AbstractC10730b0 abstractC10730b0 = AbstractC10730b0.f83895b;
        this.zzf = abstractC10730b0;
        this.zzg = abstractC10730b0;
        this.zzh = abstractC10730b0;
        this.zzi = abstractC10730b0;
    }
}
