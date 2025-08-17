package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.kQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8532kQ implements NQ {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f75640h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final LP f75641a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f75642b;

    /* renamed from: c, reason: collision with root package name */
    private final C9570u60 f75643c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f75644d;

    /* renamed from: e, reason: collision with root package name */
    private final QR f75645e;

    /* renamed from: f, reason: collision with root package name */
    private final W80 f75646f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f75647g;

    C8532kQ(Context context, C9570u60 c9570u60, LP lp2, Xj0 xj0, ScheduledExecutorService scheduledExecutorService, QR qr2, W80 w80) {
        this.f75647g = context;
        this.f75643c = c9570u60;
        this.f75641a = lp2;
        this.f75642b = xj0;
        this.f75644d = scheduledExecutorService;
        this.f75645e = qr2;
        this.f75646f = w80;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final com.google.common.util.concurrent.q a(C9853wo c9853wo) {
        Context context = this.f75647g;
        com.google.common.util.concurrent.q qVarC = this.f75641a.c(c9853wo);
        K80 k80A = J80.a(context, 11);
        V80.d(qVarC, k80A);
        com.google.common.util.concurrent.q qVarN = Mj0.n(qVarC, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.hQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f74719a.c((OQ) obj);
            }
        }, this.f75642b);
        if (((Boolean) Mc.A.c().a(C8659lf.f76577x5)).booleanValue()) {
            qVarN = Mj0.f(Mj0.o(qVarN, ((Integer) Mc.A.c().a(C8659lf.f76591y5)).intValue(), TimeUnit.SECONDS, this.f75644d), TimeoutException.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.iQ
                @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return Mj0.g(new zzdvy(5));
                }
            }, C6908Kq.f68180g);
        }
        V80.a(qVarN, this.f75646f, k80A);
        Mj0.r(qVarN, new C8425jQ(this), C6908Kq.f68180g);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(OQ oq2) throws Exception {
        return Mj0.h(new C8608l60(new C8182h60(this.f75643c), C8394j60.a(new InputStreamReader(oq2.b()), oq2.a())));
    }
}
