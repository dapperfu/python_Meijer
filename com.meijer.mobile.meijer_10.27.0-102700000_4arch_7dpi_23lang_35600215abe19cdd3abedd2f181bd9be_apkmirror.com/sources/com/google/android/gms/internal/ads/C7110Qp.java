package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7110Qp extends AbstractC7344Xp {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f69650b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9339ry0 f69651c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9339ry0 f69652d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9339ry0 f69653e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9339ry0 f69654f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC9339ry0 f69655g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC9339ry0 f69656h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC9339ry0 f69657i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9339ry0 f69658j;

    @Override // com.google.android.gms.internal.ads.AbstractC7344Xp
    final SharedPreferencesOnSharedPreferenceChangeListenerC6839Ip a() {
        return (SharedPreferencesOnSharedPreferenceChangeListenerC6839Ip) this.f69653e.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7344Xp
    final C6974Mp b() {
        return new C6974Mp(this.f69650b, (C6907Kp) this.f69656h.zzb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7344Xp
    final C7615bq c() {
        return (C7615bq) this.f69658j.zzb();
    }

    /* synthetic */ C7110Qp(Context context, com.google.android.gms.common.util.f fVar, Pc.r0 r0Var, C7311Wp c7311Wp, C7144Rp c7144Rp) {
        this.f69650b = fVar;
        InterfaceC8377iy0 interfaceC8377iy0A = C8484jy0.a(context);
        this.f69651c = interfaceC8377iy0A;
        InterfaceC8377iy0 interfaceC8377iy0A2 = C8484jy0.a(r0Var);
        this.f69652d = interfaceC8377iy0A2;
        this.f69653e = C8272hy0.b(new C6873Jp(interfaceC8377iy0A, interfaceC8377iy0A2));
        InterfaceC8377iy0 interfaceC8377iy0A3 = C8484jy0.a(fVar);
        this.f69654f = interfaceC8377iy0A3;
        InterfaceC8377iy0 interfaceC8377iy0A4 = C8484jy0.a(c7311Wp);
        this.f69655g = interfaceC8377iy0A4;
        InterfaceC9339ry0 interfaceC9339ry0B = C8272hy0.b(new C6941Lp(interfaceC8377iy0A3, interfaceC8377iy0A2, interfaceC8377iy0A4));
        this.f69656h = interfaceC9339ry0B;
        C7042Op c7042Op = new C7042Op(interfaceC8377iy0A3, interfaceC9339ry0B);
        this.f69657i = c7042Op;
        this.f69658j = C8272hy0.b(new C7721cq(interfaceC8377iy0A, c7042Op));
    }
}
