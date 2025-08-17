package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.cM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7675cM implements InterfaceC9688vC {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9008ot f73158a;

    C7675cM(InterfaceC9008ot interfaceC9008ot) {
        this.f73158a = interfaceC9008ot;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void J(Context context) {
        InterfaceC9008ot interfaceC9008ot = this.f73158a;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void j(Context context) {
        InterfaceC9008ot interfaceC9008ot = this.f73158a;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void q(Context context) {
        InterfaceC9008ot interfaceC9008ot = this.f73158a;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.onPause();
        }
    }
}
