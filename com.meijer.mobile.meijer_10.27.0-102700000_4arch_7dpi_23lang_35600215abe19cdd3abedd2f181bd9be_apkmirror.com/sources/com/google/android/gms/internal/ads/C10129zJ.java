package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10129zJ implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AJ f80409a;

    C10129zJ(AJ aj2) {
        this.f80409a = aj2;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) list.get(0);
            if (interfaceC9008ot != null) {
                this.f80409a.b(interfaceC9008ot);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76423m5)).booleanValue()) {
                Lc.v.s().x(e10, "omid native display exp");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76423m5)).booleanValue()) {
            Lc.v.s().x(th2, "omid native display exp");
        }
    }
}
