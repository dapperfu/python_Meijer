package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.w20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9776w20 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f79401a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f79402b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f79403c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f79404d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10088yy0 f79405e;

    public C9776w20(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05, InterfaceC10088yy0 interfaceC10088yy06, InterfaceC10088yy0 interfaceC10088yy07) {
        this.f79401a = interfaceC10088yy02;
        this.f79402b = interfaceC10088yy03;
        this.f79403c = interfaceC10088yy05;
        this.f79404d = interfaceC10088yy06;
        this.f79405e = interfaceC10088yy07;
    }

    public static C9562u20 a(C9322rq c9322rq, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new C9562u20(c9322rq, context, scheduledExecutorService, executor, i10, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C9562u20(C9014ow.a(), ((C9865wu) this.f79401a).a(), (ScheduledExecutorService) this.f79402b.zzb(), U70.b(), ((C7749d30) this.f79403c).zzb().intValue(), ((C7962f30) this.f79404d).zzb().booleanValue(), ((C8176h30) this.f79405e).zzb().booleanValue());
    }
}
