package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Fk0 implements InterfaceC7225Qg0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67683a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7225Qg0 f67684b;

    public Fk0(Context context) {
        Hl0 hl0 = new Hl0();
        this.f67683a = context.getApplicationContext();
        this.f67684b = hl0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7225Qg0
    public final /* bridge */ /* synthetic */ InterfaceC9430rh0 zza() {
        return new C8264gl0(this.f67683a, this.f67684b.zza());
    }
}
