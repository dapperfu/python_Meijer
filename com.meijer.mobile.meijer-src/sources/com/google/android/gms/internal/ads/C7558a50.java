package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.a50, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7558a50 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73192a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f73193b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f73194c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f73195d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10213yy0 f73196e;

    public C7558a50(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05, InterfaceC10213yy0 interfaceC10213yy06) {
        this.f73192a = interfaceC10213yy0;
        this.f73193b = interfaceC10213yy02;
        this.f73194c = interfaceC10213yy03;
        this.f73195d = interfaceC10213yy04;
        this.f73196e = interfaceC10213yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new Z40((Context) this.f73192a.zzb(), (Executor) this.f73193b.zzb(), (AbstractC9135ou) this.f73194c.zzb(), (C8024eX) this.f73195d.zzb(), (B50) this.f73196e.zzb(), new C9481s60());
    }
}
