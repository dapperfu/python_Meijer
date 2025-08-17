package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7778dI implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f73390a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f73391b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f73392c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f73393d;

    public C7778dI(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f73390a = interfaceC10088yy0;
        this.f73391b = interfaceC10088yy02;
        this.f73392c = interfaceC10088yy03;
        this.f73393d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C9399sb c9399sb = (C9399sb) this.f73390a.zzb();
        Executor executor = (Executor) this.f73391b.zzb();
        Context context = (Context) this.f73392c.zzb();
        return new C7084Px(executor, new C6609Bx(context, c9399sb), (com.google.android.gms.common.util.f) this.f73393d.zzb());
    }
}
