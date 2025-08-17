package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10202b extends K0 implements InterfaceC10250q1 {
    private static final Q0 zzb = new A2();
    private static final C10202b zzd;
    private P0 zze = K0.j();

    static {
        C10202b c10202b = new C10202b();
        zzd = c10202b;
        K0.o(C10202b.class, c10202b);
    }

    public static B2 q() {
        return (B2) zzd.g();
    }

    private final void u() {
        P0 p02 = this.zze;
        if (p02.zzc()) {
            return;
        }
        int size = p02.size();
        this.zze = p02.zzg(size == 0 ? 10 : size + size);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.K0
    protected final Object e(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return K0.l(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zze", y2.f81086a});
        }
        if (i11 == 3) {
            return new C10202b();
        }
        C10205b2 c10205b2 = null;
        if (i11 == 4) {
            return new B2(c10205b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }

    private C10202b() {
    }

    static /* synthetic */ void s(C10202b c10202b, z2 z2Var) {
        z2Var.getClass();
        c10202b.u();
        c10202b.zze.zzh(z2Var.zza());
    }

    static /* synthetic */ void t(C10202b c10202b, Iterable iterable) {
        c10202b.u();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c10202b.zze.zzh(((z2) it.next()).zza());
        }
    }
}
