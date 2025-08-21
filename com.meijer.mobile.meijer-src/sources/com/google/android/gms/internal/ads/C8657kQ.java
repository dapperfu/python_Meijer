package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.kQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8657kQ implements NQ {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f76480h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final LP f76481a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f76482b;

    /* renamed from: c, reason: collision with root package name */
    private final C9695u60 f76483c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f76484d;

    /* renamed from: e, reason: collision with root package name */
    private final QR f76485e;

    /* renamed from: f, reason: collision with root package name */
    private final W80 f76486f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f76487g;

    C8657kQ(Context context, C9695u60 c9695u60, LP lp2, Xj0 xj0, ScheduledExecutorService scheduledExecutorService, QR qr2, W80 w80) {
        this.f76487g = context;
        this.f76483c = c9695u60;
        this.f76481a = lp2;
        this.f76482b = xj0;
        this.f76484d = scheduledExecutorService;
        this.f76485e = qr2;
        this.f76486f = w80;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final com.google.common.util.concurrent.q a(C9978wo c9978wo) {
        Context context = this.f76487g;
        com.google.common.util.concurrent.q qVarC = this.f76481a.c(c9978wo);
        K80 k80A = J80.a(context, 11);
        V80.d(qVarC, k80A);
        com.google.common.util.concurrent.q qVarN = Mj0.n(qVarC, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.hQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f75559a.c((OQ) obj);
            }
        }, this.f76482b);
        if (((Boolean) Oc.A.c().a(C8784lf.f77417x5)).booleanValue()) {
            qVarN = Mj0.f(Mj0.o(qVarN, ((Integer) Oc.A.c().a(C8784lf.f77431y5)).intValue(), TimeUnit.SECONDS, this.f76484d), TimeoutException.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.iQ
                @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return Mj0.g(new zzdvy(5));
                }
            }, C7033Kq.f69020g);
        }
        V80.a(qVarN, this.f76486f, k80A);
        Mj0.r(qVarN, new C8550jQ(this), C7033Kq.f69020g);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(OQ oq2) throws Exception {
        return Mj0.h(new C8733l60(new C8307h60(this.f76483c), C8519j60.a(new InputStreamReader(oq2.b()), oq2.a())));
    }
}
