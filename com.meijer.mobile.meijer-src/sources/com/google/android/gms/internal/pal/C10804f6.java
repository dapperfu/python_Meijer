package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10804f6 extends B0 implements InterfaceC10831h1 {
    private static final C10804f6 zzb;
    private int zze;
    private C11012s7 zzf;
    private X9 zzg;

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }

    static {
        C10804f6 c10804f6 = new C10804f6();
        zzb = c10804f6;
        B0.j(C10804f6.class, c10804f6);
    }

    public static C10804f6 u(byte[] bArr, C10958p0 c10958p0) throws zzadi {
        return (C10804f6) B0.o(zzb, bArr, c10958p0);
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
            return new C10804f6();
        }
        C10803f5 c10803f5 = null;
        if (i11 == 4) {
            return new F5(c10803f5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C11012s7 v() {
        C11012s7 c11012s7 = this.zzf;
        return c11012s7 == null ? C11012s7.u() : c11012s7;
    }

    public final X9 w() {
        X9 x92 = this.zzg;
        return x92 == null ? X9.u() : x92;
    }

    private C10804f6() {
    }
}
