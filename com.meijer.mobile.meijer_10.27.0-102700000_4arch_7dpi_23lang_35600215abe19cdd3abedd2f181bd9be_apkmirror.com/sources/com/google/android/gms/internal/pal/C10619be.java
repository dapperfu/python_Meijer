package com.google.android.gms.internal.pal;

import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.internal.pal.be, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10619be extends B0 implements InterfaceC10706h1 {
    private static final C10619be zzb;
    private String zze = "";
    private I0 zzf = B0.q();

    public static C10619be u() {
        return zzb;
    }

    public final List v() {
        return this.zzf;
    }

    static {
        C10619be c10619be = new C10619be();
        zzb = c10619be;
        B0.j(C10619be.class, c10619be);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", C11005zd.class});
        }
        if (i11 == 3) {
            return new C10619be();
        }
        Zd zd2 = null;
        if (i11 == 4) {
            return new C10602ae(zd2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10619be() {
    }
}
