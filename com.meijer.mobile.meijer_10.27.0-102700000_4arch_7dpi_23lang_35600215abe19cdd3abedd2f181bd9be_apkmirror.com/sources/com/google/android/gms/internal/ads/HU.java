package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class HU implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67436a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67437b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f67438c;

    public HU(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f67436a = interfaceC10088yy0;
        this.f67437b = interfaceC10088yy02;
        this.f67438c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new GU((Context) this.f67436a.zzb(), (GH) this.f67437b.zzb(), (Executor) this.f67438c.zzb());
    }
}
