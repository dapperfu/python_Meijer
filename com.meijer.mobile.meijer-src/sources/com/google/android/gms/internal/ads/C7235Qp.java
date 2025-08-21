package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7235Qp extends AbstractC7469Xp {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f70490b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9464ry0 f70491c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9464ry0 f70492d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9464ry0 f70493e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9464ry0 f70494f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC9464ry0 f70495g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC9464ry0 f70496h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC9464ry0 f70497i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9464ry0 f70498j;

    @Override // com.google.android.gms.internal.ads.AbstractC7469Xp
    final SharedPreferencesOnSharedPreferenceChangeListenerC6964Ip a() {
        return (SharedPreferencesOnSharedPreferenceChangeListenerC6964Ip) this.f70493e.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7469Xp
    final C7099Mp b() {
        return new C7099Mp(this.f70490b, (C7032Kp) this.f70496h.zzb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7469Xp
    final C7740bq c() {
        return (C7740bq) this.f70498j.zzb();
    }

    /* synthetic */ C7235Qp(Context context, com.google.android.gms.common.util.f fVar, Rc.r0 r0Var, C7436Wp c7436Wp, C7269Rp c7269Rp) {
        this.f70490b = fVar;
        InterfaceC8502iy0 interfaceC8502iy0A = C8609jy0.a(context);
        this.f70491c = interfaceC8502iy0A;
        InterfaceC8502iy0 interfaceC8502iy0A2 = C8609jy0.a(r0Var);
        this.f70492d = interfaceC8502iy0A2;
        this.f70493e = C8397hy0.b(new C6998Jp(interfaceC8502iy0A, interfaceC8502iy0A2));
        InterfaceC8502iy0 interfaceC8502iy0A3 = C8609jy0.a(fVar);
        this.f70494f = interfaceC8502iy0A3;
        InterfaceC8502iy0 interfaceC8502iy0A4 = C8609jy0.a(c7436Wp);
        this.f70495g = interfaceC8502iy0A4;
        InterfaceC9464ry0 interfaceC9464ry0B = C8397hy0.b(new C7066Lp(interfaceC8502iy0A3, interfaceC8502iy0A2, interfaceC8502iy0A4));
        this.f70496h = interfaceC9464ry0B;
        C7167Op c7167Op = new C7167Op(interfaceC8502iy0A3, interfaceC9464ry0B);
        this.f70497i = c7167Op;
        this.f70498j = C8397hy0.b(new C7846cq(interfaceC8502iy0A, c7167Op));
    }
}
