package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8709kv implements InterfaceC8622k40 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76555a;

    /* renamed from: b, reason: collision with root package name */
    private final Oc.d2 f76556b;

    /* renamed from: c, reason: collision with root package name */
    private final String f76557c;

    /* renamed from: d, reason: collision with root package name */
    private final C7643av f76558d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9464ry0 f76559e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9464ry0 f76560f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC9464ry0 f76561g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC9464ry0 f76562h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC9464ry0 f76563i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9464ry0 f76564j;

    @Override // com.google.android.gms.internal.ads.InterfaceC8622k40
    public final JW zza() {
        return new JW(this.f76555a, this.f76556b, this.f76557c, (C8303h40) this.f76564j.zzb(), (C8024eX) this.f76561g.zzb(), C7037Ku.b(this.f76558d.f73459b), (C9937wN) this.f76558d.f73431N.zzb());
    }

    /* synthetic */ C8709kv(C7643av c7643av, Context context, String str, Oc.d2 d2Var, C6902Gv c6902Gv) {
        this.f76558d = c7643av;
        this.f76555a = context;
        this.f76556b = d2Var;
        this.f76557c = str;
        InterfaceC8502iy0 interfaceC8502iy0A = C8609jy0.a(context);
        this.f76559e = interfaceC8502iy0A;
        InterfaceC8502iy0 interfaceC8502iy0A2 = C8609jy0.a(d2Var);
        this.f76560f = interfaceC8502iy0A2;
        InterfaceC9464ry0 interfaceC9464ry0B = C8397hy0.b(new C8131fX(c7643av.f73431N));
        this.f76561g = interfaceC9464ry0B;
        InterfaceC9464ry0 interfaceC9464ry0B2 = C8397hy0.b(C8664kX.a());
        this.f76562h = interfaceC9464ry0B2;
        InterfaceC9464ry0 interfaceC9464ry0B3 = C8397hy0.b(FE.a());
        this.f76563i = interfaceC9464ry0B3;
        this.f76564j = C8397hy0.b(new C8410i40(interfaceC8502iy0A, c7643av.f73465d, interfaceC8502iy0A2, c7643av.f73443T, interfaceC9464ry0B, interfaceC9464ry0B2, C9909w60.a(), interfaceC9464ry0B3));
    }
}
