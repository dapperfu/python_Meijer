package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class PV implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69342a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69343b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f69344c;

    public PV(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f69342a = interfaceC10088yy0;
        this.f69343b = interfaceC10088yy02;
        this.f69344c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new NV((Context) this.f69342a.zzb(), (Executor) this.f69343b.zzb(), (DL) this.f69344c.zzb());
    }
}
