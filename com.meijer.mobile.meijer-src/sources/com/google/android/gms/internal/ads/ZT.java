package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class ZT implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73015a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f73016b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f73017c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f73018d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10213yy0 f73019e;

    public ZT(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05) {
        this.f73015a = interfaceC10213yy0;
        this.f73016b = interfaceC10213yy02;
        this.f73017c = interfaceC10213yy03;
        this.f73018d = interfaceC10213yy04;
        this.f73019e = interfaceC10213yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new YT((Context) this.f73015a.zzb(), (Executor) this.f73016b.zzb(), (AbstractC8647kH) this.f73017c.zzb(), (Y50) this.f73018d.zzb(), (C9937wN) this.f73019e.zzb());
    }
}
