package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.rb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10875rb extends B0 implements InterfaceC10706h1 {
    private static final C10875rb zzb;
    private int zze;

    public static C10875rb w() {
        return zzb;
    }

    public final int t() {
        return this.zze;
    }

    static {
        C10875rb c10875rb = new C10875rb();
        zzb = c10875rb;
        B0.j(C10875rb.class, c10875rb);
    }

    public static C10860qb u() {
        return (C10860qb) zzb.l();
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
            return new C10875rb();
        }
        C10844pb c10844pb = null;
        if (i11 == 4) {
            return new C10860qb(c10844pb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10875rb() {
    }
}
