package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.t2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11023t2 extends B0 implements InterfaceC10831h1 {
    private static final C11023t2 zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private AbstractC10730b0 zzh = AbstractC10730b0.f83895b;

    public static C11023t2 v() {
        return zzb;
    }

    public final long t() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }

    static {
        C11023t2 c11023t2 = new C11023t2();
        zzb = c11023t2;
        B0.j(C11023t2.class, c11023t2);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C11023t2();
        }
        C11111ya c11111ya = null;
        if (i11 == 4) {
            return new C11007s2(c11111ya);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C11023t2() {
    }
}
