package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7903dI implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f74230a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f74231b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f74232c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f74233d;

    public C7903dI(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f74230a = interfaceC10213yy0;
        this.f74231b = interfaceC10213yy02;
        this.f74232c = interfaceC10213yy03;
        this.f74233d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C9524sb c9524sb = (C9524sb) this.f74230a.zzb();
        Executor executor = (Executor) this.f74231b.zzb();
        Context context = (Context) this.f74232c.zzb();
        return new C7209Px(executor, new C6734Bx(context, c9524sb), (com.google.android.gms.common.util.f) this.f74233d.zzb());
    }
}
