package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.wB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9793wB implements PC, InterfaceC9688vC {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f79449a;

    public C9793wB(Context context, Z50 z50, C10065yn c10065yn) {
        this.f79449a = z50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void J(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void j(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void q(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        C10172zn c10172zn = this.f79449a.f72028d0;
        if (c10172zn == null || !c10172zn.f80471a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f79449a.f72028d0.f80472b.isEmpty()) {
            return;
        }
        arrayList.add(this.f79449a.f72028d0.f80472b);
    }
}
