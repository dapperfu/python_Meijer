package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10679f6 extends B0 implements InterfaceC10706h1 {
    private static final C10679f6 zzb;
    private int zze;
    private C10887s7 zzf;
    private X9 zzg;

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }

    static {
        C10679f6 c10679f6 = new C10679f6();
        zzb = c10679f6;
        B0.j(C10679f6.class, c10679f6);
    }

    public static C10679f6 u(byte[] bArr, C10833p0 c10833p0) throws zzadi {
        return (C10679f6) B0.o(zzb, bArr, c10833p0);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C10679f6();
        }
        C10678f5 c10678f5 = null;
        if (i11 == 4) {
            return new F5(c10678f5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C10887s7 v() {
        C10887s7 c10887s7 = this.zzf;
        return c10887s7 == null ? C10887s7.u() : c10887s7;
    }

    public final X9 w() {
        X9 x92 = this.zzg;
        return x92 == null ? X9.u() : x92;
    }

    private C10679f6() {
    }
}
