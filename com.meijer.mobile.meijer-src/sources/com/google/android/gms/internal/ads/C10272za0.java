package com.google.android.gms.internal.ads;

import Oc.InterfaceC4383c0;
import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.za0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10272za0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f81285a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f81286b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f81287c;

    /* renamed from: d, reason: collision with root package name */
    private final ClientApi f81288d = new ClientApi();

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6756Cl f81289e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f81290f;

    public final void b(InterfaceC6756Cl interfaceC6756Cl) {
        this.f81289e = interfaceC6756Cl;
    }

    private static W90 c() {
        return new W90(((Long) Oc.A.c().a(C8784lf.f77397w)).longValue(), 2.0d, ((Long) Oc.A.c().a(C8784lf.f77411x)).longValue(), 0.2d);
    }

    public final AbstractC10165ya0 a(Oc.J1 j12, InterfaceC4383c0 interfaceC4383c0) {
        Gc.b bVarA = Gc.b.a(j12.f23333b);
        if (bVarA == null) {
            return null;
        }
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal == 1) {
            return new Y90(this.f81288d, this.f81285a, this.f81286b.f34481c, this.f81289e, j12, interfaceC4383c0, this.f81287c, c(), this.f81290f);
        }
        if (iOrdinal == 2) {
            return new C6738Ca0(this.f81288d, this.f81285a, this.f81286b.f34481c, this.f81289e, j12, interfaceC4383c0, this.f81287c, c(), this.f81290f);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new V90(this.f81288d, this.f81285a, this.f81286b.f34481c, this.f81289e, j12, interfaceC4383c0, this.f81287c, c(), this.f81290f);
    }

    C10272za0(Context context, Sc.a aVar, ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        this.f81285a = context;
        this.f81286b = aVar;
        this.f81287c = scheduledExecutorService;
        this.f81290f = fVar;
    }
}
