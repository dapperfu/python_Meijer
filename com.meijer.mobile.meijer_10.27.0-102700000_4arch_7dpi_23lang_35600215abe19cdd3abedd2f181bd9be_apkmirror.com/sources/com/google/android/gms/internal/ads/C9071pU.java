package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.pU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9071pU implements InterfaceC9377sH {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f77592a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10170zm f77593b;

    /* renamed from: c, reason: collision with root package name */
    private final Ec.b f77594c;

    /* renamed from: d, reason: collision with root package name */
    private C9367sC f77595d = null;

    public final void b(C9367sC c9367sC) {
        this.f77595d = c9367sC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
    public final void a(boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
        boolean zD;
        try {
            Ec.b bVar = Ec.b.BANNER;
            int iOrdinal = this.f77594c.ordinal();
            if (iOrdinal == 1) {
                zD = this.f77593b.D(com.google.android.gms.dynamic.d.F2(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zD = this.f77593b.E(com.google.android.gms.dynamic.d.F2(context));
                    }
                    throw new zzdgb("Adapter failed to show.");
                }
                zD = this.f77593b.n0(com.google.android.gms.dynamic.d.F2(context));
            }
            if (zD) {
                C9367sC c9367sC = this.f77595d;
                if (c9367sC == null) {
                    return;
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f75944E1)).booleanValue() || this.f77592a.f72019Y != 2) {
                    return;
                }
                c9367sC.zza();
                return;
            }
            throw new zzdgb("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdgb(th2);
        }
    }

    C9071pU(Z50 z50, InterfaceC10170zm interfaceC10170zm, Ec.b bVar) {
        this.f77592a = z50;
        this.f77593b = interfaceC10170zm;
        this.f77594c = bVar;
    }
}
