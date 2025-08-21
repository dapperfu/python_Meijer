package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.pU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9196pU implements InterfaceC9502sH {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f78432a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10295zm f78433b;

    /* renamed from: c, reason: collision with root package name */
    private final Gc.b f78434c;

    /* renamed from: d, reason: collision with root package name */
    private C9492sC f78435d = null;

    public final void b(C9492sC c9492sC) {
        this.f78435d = c9492sC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
    public final void a(boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
        boolean zD;
        try {
            Gc.b bVar = Gc.b.BANNER;
            int iOrdinal = this.f78434c.ordinal();
            if (iOrdinal == 1) {
                zD = this.f78433b.D(com.google.android.gms.dynamic.d.I2(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zD = this.f78433b.E(com.google.android.gms.dynamic.d.I2(context));
                    }
                    throw new zzdgb("Adapter failed to show.");
                }
                zD = this.f78433b.o0(com.google.android.gms.dynamic.d.I2(context));
            }
            if (zD) {
                C9492sC c9492sC = this.f78435d;
                if (c9492sC == null) {
                    return;
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f76784E1)).booleanValue() || this.f78432a.f72859Y != 2) {
                    return;
                }
                c9492sC.zza();
                return;
            }
            throw new zzdgb("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdgb(th2);
        }
    }

    C9196pU(Z50 z50, InterfaceC10295zm interfaceC10295zm, Gc.b bVar) {
        this.f78432a = z50;
        this.f78433b = interfaceC10295zm;
        this.f78434c = bVar;
    }
}
