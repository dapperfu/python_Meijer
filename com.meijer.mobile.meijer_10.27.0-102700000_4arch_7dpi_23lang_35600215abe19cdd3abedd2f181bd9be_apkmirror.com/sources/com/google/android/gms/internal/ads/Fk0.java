package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Fk0 implements InterfaceC7100Qg0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66843a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7100Qg0 f66844b;

    public Fk0(Context context) {
        Hl0 hl0 = new Hl0();
        this.f66843a = context.getApplicationContext();
        this.f66844b = hl0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7100Qg0
    public final /* bridge */ /* synthetic */ InterfaceC9305rh0 zza() {
        return new C8139gl0(this.f66843a, this.f66844b.zza());
    }
}
