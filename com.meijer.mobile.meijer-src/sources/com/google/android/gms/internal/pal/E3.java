package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class E3 extends B0 implements InterfaceC10831h1 {
    private static final E3 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        E3 e32 = new E3();
        zzb = e32;
        B0.j(E3.class, e32);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new E3();
        }
        C10712a c10712a = null;
        if (i11 == 4) {
            return new C10784e3(c10712a);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private E3() {
    }
}
