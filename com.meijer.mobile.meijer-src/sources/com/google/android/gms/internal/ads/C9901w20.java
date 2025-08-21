package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.w20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9901w20 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f80241a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f80242b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f80243c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f80244d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10213yy0 f80245e;

    public C9901w20(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05, InterfaceC10213yy0 interfaceC10213yy06, InterfaceC10213yy0 interfaceC10213yy07) {
        this.f80241a = interfaceC10213yy02;
        this.f80242b = interfaceC10213yy03;
        this.f80243c = interfaceC10213yy05;
        this.f80244d = interfaceC10213yy06;
        this.f80245e = interfaceC10213yy07;
    }

    public static C9687u20 a(C9447rq c9447rq, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new C9687u20(c9447rq, context, scheduledExecutorService, executor, i10, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C9687u20(C9139ow.a(), ((C9990wu) this.f80241a).a(), (ScheduledExecutorService) this.f80242b.zzb(), U70.b(), ((C7874d30) this.f80243c).zzb().intValue(), ((C8087f30) this.f80244d).zzb().booleanValue(), ((C8301h30) this.f80245e).zzb().booleanValue());
    }
}
