package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10327b extends K0 implements InterfaceC10375q1 {
    private static final Q0 zzb = new A2();
    private static final C10327b zzd;
    private P0 zze = K0.j();

    static {
        C10327b c10327b = new C10327b();
        zzd = c10327b;
        K0.o(C10327b.class, c10327b);
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
            return K0.l(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zze", y2.f81926a});
        }
        if (i11 == 3) {
            return new C10327b();
        }
        C10330b2 c10330b2 = null;
        if (i11 == 4) {
            return new B2(c10330b2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }

    private C10327b() {
    }

    static /* synthetic */ void s(C10327b c10327b, z2 z2Var) {
        z2Var.getClass();
        c10327b.u();
        c10327b.zze.zzh(z2Var.zza());
    }

    static /* synthetic */ void t(C10327b c10327b, Iterable iterable) {
        c10327b.u();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c10327b.zze.zzh(((z2) it.next()).zza());
        }
    }
}
