package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10254zJ implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AJ f81249a;

    C10254zJ(AJ aj2) {
        this.f81249a = aj2;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) list.get(0);
            if (interfaceC9133ot != null) {
                this.f81249a.b(interfaceC9133ot);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77263m5)).booleanValue()) {
                Nc.v.s().x(e10, "omid native display exp");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77263m5)).booleanValue()) {
            Nc.v.s().x(th2, "omid native display exp");
        }
    }
}
