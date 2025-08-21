package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class HU implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68276a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68277b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f68278c;

    public HU(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f68276a = interfaceC10213yy0;
        this.f68277b = interfaceC10213yy02;
        this.f68278c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new GU((Context) this.f68276a.zzb(), (GH) this.f68277b.zzb(), (Executor) this.f68278c.zzb());
    }
}
