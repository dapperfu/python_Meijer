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
public final class C8269hx {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74837a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.r0 f74838b;

    /* renamed from: c, reason: collision with root package name */
    private final C7895eT f74839c;

    /* renamed from: d, reason: collision with root package name */
    private final ZL f74840d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f74841e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f74842f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f74843g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC7210Tn f74844h;

    /* renamed from: i, reason: collision with root package name */
    InterfaceC7210Tn f74845i;

    private final com.google.common.util.concurrent.q k(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) Mc.A.c().a(C8659lf.f76274ba)) || this.f74838b.zzN()) {
                return Mj0.h(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) Mc.A.c().a(C8659lf.f76288ca), String.valueOf(random.nextInt(a.e.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (Cj0) Mj0.f((Cj0) Mj0.n(Cj0.D(this.f74839c.a()), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.bx
                    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return this.f73029a.d(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.f74842f), Throwable.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.cx
                    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return this.f73290a.e(builderBuildUpon, (Throwable) obj);
                    }
                }, this.f74841e);
            }
            builderBuildUpon.appendQueryParameter((String) Mc.A.c().a(C8659lf.f76302da), "11");
            return Mj0.h(builderBuildUpon.toString());
        } catch (Exception e10) {
            return Mj0.g(e10);
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(String str, final Throwable th2) throws Exception {
        this.f74841e.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.ax
            @Override // java.lang.Runnable
            public final void run() {
                this.f72688a.g(th2);
            }
        });
        return Mj0.h(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(Uri.Builder builder, final Throwable th2) throws Exception {
        this.f74841e.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.Zw
            @Override // java.lang.Runnable
            public final void run() {
                this.f72310a.h(th2);
            }
        });
        builder.appendQueryParameter((String) Mc.A.c().a(C8659lf.f76302da), "9");
        return Mj0.h(builder.toString());
    }

    final /* synthetic */ void g(Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76372ia)).booleanValue()) {
            InterfaceC7210Tn interfaceC7210TnE = C7142Rn.e(this.f74837a);
            this.f74845i = interfaceC7210TnE;
            interfaceC7210TnE.b(th2, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            InterfaceC7210Tn interfaceC7210TnC = C7142Rn.c(this.f74837a);
            this.f74844h = interfaceC7210TnC;
            interfaceC7210TnC.b(th2, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void h(Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76372ia)).booleanValue()) {
            InterfaceC7210Tn interfaceC7210TnE = C7142Rn.e(this.f74837a);
            this.f74845i = interfaceC7210TnE;
            interfaceC7210TnE.b(th2, "AttributionReporting");
        } else {
            InterfaceC7210Tn interfaceC7210TnC = C7142Rn.c(this.f74837a);
            this.f74844h = interfaceC7210TnC;
            interfaceC7210TnC.b(th2, "AttributionReportingSampled");
        }
    }

    C8269hx(Context context, Pc.r0 r0Var, C7895eT c7895eT, ZL zl2, Xj0 xj0, Xj0 xj02, ScheduledExecutorService scheduledExecutorService) {
        this.f74837a = context;
        this.f74838b = r0Var;
        this.f74839c = c7895eT;
        this.f74840d = zl2;
        this.f74841e = xj0;
        this.f74842f = xj02;
        this.f74843g = scheduledExecutorService;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) Mc.A.c().a(C8659lf.f76274ba));
    }

    public final com.google.common.util.concurrent.q b(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return Mj0.h(str);
        }
        return Mj0.f(k(str, this.f74840d.a(), random), Throwable.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.Yw
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f71862a.c(str, (Throwable) obj);
            }
        }, this.f74841e);
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() == 1) {
            Uri.Builder builderBuildUpon = builder.build().buildUpon();
            builderBuildUpon.appendQueryParameter((String) Mc.A.c().a(C8659lf.f76316ea), "1");
            builderBuildUpon.appendQueryParameter((String) Mc.A.c().a(C8659lf.f76302da), "12");
            if (str.contains((CharSequence) Mc.A.c().a(C8659lf.f76330fa))) {
                builderBuildUpon.authority((String) Mc.A.c().a(C8659lf.f76344ga));
            }
            return (Cj0) Mj0.n(Cj0.D(this.f74839c.b(builderBuildUpon.build(), inputEvent)), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.dx
                @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    String str2 = (String) Mc.A.c().a(C8659lf.f76302da);
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter(str2, "12");
                    return Mj0.h(builder2.toString());
                }
            }, this.f74842f);
        }
        builder.appendQueryParameter((String) Mc.A.c().a(C8659lf.f76302da), "10");
        return Mj0.h(builder.toString());
    }

    public final void i(String str, R90 r90, Random random, Qc.v vVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Mj0.r(Mj0.o(k(str, this.f74840d.a(), random), ((Integer) Mc.A.c().a(C8659lf.f76358ha)).intValue(), TimeUnit.MILLISECONDS, this.f74843g), new C8162gx(this, r90, str, vVar), this.f74841e);
    }
}
