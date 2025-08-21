package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.a;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.hx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8394hx {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75677a;

    /* renamed from: b, reason: collision with root package name */
    private final Rc.r0 f75678b;

    /* renamed from: c, reason: collision with root package name */
    private final C8020eT f75679c;

    /* renamed from: d, reason: collision with root package name */
    private final ZL f75680d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f75681e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f75682f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f75683g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC7335Tn f75684h;

    /* renamed from: i, reason: collision with root package name */
    InterfaceC7335Tn f75685i;

    private final com.google.common.util.concurrent.q k(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) Oc.A.c().a(C8784lf.f77114ba)) || this.f75678b.zzN()) {
                return Mj0.h(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) Oc.A.c().a(C8784lf.f77128ca), String.valueOf(random.nextInt(a.e.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (Cj0) Mj0.f((Cj0) Mj0.n(Cj0.D(this.f75679c.a()), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.bx
                    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return this.f73869a.d(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.f75682f), Throwable.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.cx
                    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return this.f74130a.e(builderBuildUpon, (Throwable) obj);
                    }
                }, this.f75681e);
            }
            builderBuildUpon.appendQueryParameter((String) Oc.A.c().a(C8784lf.f77142da), "11");
            return Mj0.h(builderBuildUpon.toString());
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(String str, final Throwable th2) throws Exception {
        this.f75681e.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.ax
            @Override // java.lang.Runnable
            public final void run() {
                this.f73528a.g(th2);
            }
        });
        return Mj0.h(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(Uri.Builder builder, final Throwable th2) throws Exception {
        this.f75681e.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.Zw
            @Override // java.lang.Runnable
            public final void run() {
                this.f73150a.h(th2);
            }
        });
        builder.appendQueryParameter((String) Oc.A.c().a(C8784lf.f77142da), "9");
        return Mj0.h(builder.toString());
    }

    final /* synthetic */ void g(Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77212ia)).booleanValue()) {
            InterfaceC7335Tn interfaceC7335TnE = C7267Rn.e(this.f75677a);
            this.f75685i = interfaceC7335TnE;
            interfaceC7335TnE.b(th2, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            InterfaceC7335Tn interfaceC7335TnC = C7267Rn.c(this.f75677a);
            this.f75684h = interfaceC7335TnC;
            interfaceC7335TnC.b(th2, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void h(Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77212ia)).booleanValue()) {
            InterfaceC7335Tn interfaceC7335TnE = C7267Rn.e(this.f75677a);
            this.f75685i = interfaceC7335TnE;
            interfaceC7335TnE.b(th2, "AttributionReporting");
        } else {
            InterfaceC7335Tn interfaceC7335TnC = C7267Rn.c(this.f75677a);
            this.f75684h = interfaceC7335TnC;
            interfaceC7335TnC.b(th2, "AttributionReportingSampled");
        }
    }

    C8394hx(Context context, Rc.r0 r0Var, C8020eT c8020eT, ZL zl2, Xj0 xj0, Xj0 xj02, ScheduledExecutorService scheduledExecutorService) {
        this.f75677a = context;
        this.f75678b = r0Var;
        this.f75679c = c8020eT;
        this.f75680d = zl2;
        this.f75681e = xj0;
        this.f75682f = xj02;
        this.f75683g = scheduledExecutorService;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) Oc.A.c().a(C8784lf.f77114ba));
    }

    public final com.google.common.util.concurrent.q b(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return Mj0.h(str);
        }
        return Mj0.f(k(str, this.f75680d.a(), random), Throwable.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.Yw
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f72702a.c(str, (Throwable) obj);
            }
        }, this.f75681e);
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() == 1) {
            Uri.Builder builderBuildUpon = builder.build().buildUpon();
            builderBuildUpon.appendQueryParameter((String) Oc.A.c().a(C8784lf.f77156ea), "1");
            builderBuildUpon.appendQueryParameter((String) Oc.A.c().a(C8784lf.f77142da), "12");
            if (str.contains((CharSequence) Oc.A.c().a(C8784lf.f77170fa))) {
                builderBuildUpon.authority((String) Oc.A.c().a(C8784lf.f77184ga));
            }
            return (Cj0) Mj0.n(Cj0.D(this.f75679c.b(builderBuildUpon.build(), inputEvent)), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.dx
                @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    String str2 = (String) Oc.A.c().a(C8784lf.f77142da);
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter(str2, "12");
                    return Mj0.h(builder2.toString());
                }
            }, this.f75682f);
        }
        builder.appendQueryParameter((String) Oc.A.c().a(C8784lf.f77142da), "10");
        return Mj0.h(builder.toString());
    }

    public final void i(String str, R90 r90, Random random, Sc.v vVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Mj0.r(Mj0.o(k(str, this.f75680d.a(), random), ((Integer) Oc.A.c().a(C8784lf.f77198ha)).intValue(), TimeUnit.MILLISECONDS, this.f75683g), new C8287gx(this, r90, str, vVar), this.f75681e);
    }
}
