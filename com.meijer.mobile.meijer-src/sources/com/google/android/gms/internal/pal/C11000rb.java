package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.rb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11000rb extends B0 implements InterfaceC10831h1 {
    private static final C11000rb zzb;
    private int zze;

    public static C11000rb w() {
        return zzb;
    }

    public final int t() {
        return this.zze;
    }

    static {
        C11000rb c11000rb = new C11000rb();
        zzb = c11000rb;
        B0.j(C11000rb.class, c11000rb);
    }

    public static C10985qb u() {
        return (C10985qb) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new C11000rb();
        }
        C10969pb c10969pb = null;
        if (i11 == 4) {
            return new C10985qb(c10969pb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C11000rb() {
    }
}
