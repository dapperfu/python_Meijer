package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.s7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11012s7 extends B0 implements InterfaceC10831h1 {
    private static final C11012s7 zzb;
    private int zze;
    private int zzf = 2;

    public static C11012s7 u() {
        return zzb;
    }

    public final int v() {
        int iA = V8.a(this.zzf);
        if (iA == 0) {
            return 3;
        }
        return iA;
    }

    static {
        C11012s7 c11012s7 = new C11012s7();
        zzb = c11012s7;
        B0.j(C11012s7.class, c11012s7);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", C11045u8.f84919a});
        }
        if (i11 == 3) {
            return new C11012s7();
        }
        C10803f5 c10803f5 = null;
        if (i11 == 4) {
            return new G6(c10803f5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C11012s7() {
    }
}
