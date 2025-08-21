package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.cM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7800cM implements InterfaceC9813vC {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9133ot f73998a;

    C7800cM(InterfaceC9133ot interfaceC9133ot) {
        this.f73998a = interfaceC9133ot;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void L(Context context) {
        InterfaceC9133ot interfaceC9133ot = this.f73998a;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void j(Context context) {
        InterfaceC9133ot interfaceC9133ot = this.f73998a;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void q(Context context) {
        InterfaceC9133ot interfaceC9133ot = this.f73998a;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.onPause();
        }
    }
}
