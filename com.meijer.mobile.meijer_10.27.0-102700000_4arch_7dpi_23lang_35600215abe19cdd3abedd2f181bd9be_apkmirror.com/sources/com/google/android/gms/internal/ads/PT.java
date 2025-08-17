package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class PT implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69327a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69328b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f69329c;

    public PT(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f69327a = interfaceC10088yy0;
        this.f69328b = interfaceC10088yy02;
        this.f69329c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new OT((Context) this.f69327a.zzb(), (AbstractC7153Ry) this.f69328b.zzb(), (Executor) this.f69329c.zzb());
    }
}
