package com.google.android.gms.internal.pal;

import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.internal.pal.be, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10744be extends B0 implements InterfaceC10831h1 {
    private static final C10744be zzb;
    private String zze = "";
    private I0 zzf = B0.q();

    public static C10744be u() {
        return zzb;
    }

    public final List v() {
        return this.zzf;
    }

    static {
        C10744be c10744be = new C10744be();
        zzb = c10744be;
        B0.j(C10744be.class, c10744be);
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", C11130zd.class});
        }
        if (i11 == 3) {
            return new C10744be();
        }
        Zd zd2 = null;
        if (i11 == 4) {
            return new C10727ae(zd2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private C10744be() {
    }
}
