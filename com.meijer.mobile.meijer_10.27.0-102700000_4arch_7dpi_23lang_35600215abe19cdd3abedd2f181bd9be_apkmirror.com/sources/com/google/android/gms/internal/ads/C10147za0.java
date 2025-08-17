package com.google.android.gms.internal.ads;

import Mc.InterfaceC4105c0;
import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.za0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10147za0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f80445a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.a f80446b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f80447c;

    /* renamed from: d, reason: collision with root package name */
    private final ClientApi f80448d = new ClientApi();

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6631Cl f80449e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f80450f;

    public final void b(InterfaceC6631Cl interfaceC6631Cl) {
        this.f80449e = interfaceC6631Cl;
    }

    private static W90 c() {
        return new W90(((Long) Mc.A.c().a(C8659lf.f76557w)).longValue(), 2.0d, ((Long) Mc.A.c().a(C8659lf.f76571x)).longValue(), 0.2d);
    }

    public final AbstractC10040ya0 a(Mc.J1 j12, InterfaceC4105c0 interfaceC4105c0) {
        Ec.b bVarA = Ec.b.a(j12.f19146b);
        if (bVarA == null) {
            return null;
        }
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal == 1) {
            return new Y90(this.f80448d, this.f80445a, this.f80446b.f29931c, this.f80449e, j12, interfaceC4105c0, this.f80447c, c(), this.f80450f);
        }
        if (iOrdinal == 2) {
            return new C6613Ca0(this.f80448d, this.f80445a, this.f80446b.f29931c, this.f80449e, j12, interfaceC4105c0, this.f80447c, c(), this.f80450f);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new V90(this.f80448d, this.f80445a, this.f80446b.f29931c, this.f80449e, j12, interfaceC4105c0, this.f80447c, c(), this.f80450f);
    }

    C10147za0(Context context, Qc.a aVar, ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        this.f80445a = context;
        this.f80446b = aVar;
        this.f80447c = scheduledExecutorService;
        this.f80450f = fVar;
    }
}
