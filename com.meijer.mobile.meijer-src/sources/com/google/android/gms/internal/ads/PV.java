package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class PV implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70182a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70183b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f70184c;

    public PV(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f70182a = interfaceC10213yy0;
        this.f70183b = interfaceC10213yy02;
        this.f70184c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new NV((Context) this.f70182a.zzb(), (Executor) this.f70183b.zzb(), (DL) this.f70184c.zzb());
    }
}
