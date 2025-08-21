package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.wB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9918wB implements PC, InterfaceC9813vC {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f80289a;

    public C9918wB(Context context, Z50 z50, C10190yn c10190yn) {
        this.f80289a = z50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void L(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void j(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void q(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        C10297zn c10297zn = this.f80289a.f72868d0;
        if (c10297zn == null || !c10297zn.f81311a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f80289a.f72868d0.f81312b.isEmpty()) {
            return;
        }
        arrayList.add(this.f80289a.f72868d0.f81312b);
    }
}
