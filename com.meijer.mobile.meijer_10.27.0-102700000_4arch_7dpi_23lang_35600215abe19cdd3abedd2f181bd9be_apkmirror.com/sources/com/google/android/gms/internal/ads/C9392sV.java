package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9392sV implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f78262a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f78263b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f78264c;

    public C9392sV(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f78262a = interfaceC10088yy0;
        this.f78263b = interfaceC10088yy02;
        this.f78264c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C9285rV((Context) this.f78262a.zzb(), (Executor) this.f78263b.zzb(), (DL) this.f78264c.zzb());
    }
}
