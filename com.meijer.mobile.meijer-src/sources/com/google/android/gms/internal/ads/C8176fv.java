package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.fv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8176fv implements InterfaceC9689u30 {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f75032a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9464ry0 f75033b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9464ry0 f75034c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9464ry0 f75035d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9464ry0 f75036e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9464ry0 f75037f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC9464ry0 f75038g;

    @Override // com.google.android.gms.internal.ads.InterfaceC9689u30
    public final BinderC7556a40 zza() {
        return (BinderC7556a40) this.f75038g.zzb();
    }

    /* synthetic */ C8176fv(C7643av c7643av, Context context, String str, C6902Gv c6902Gv) {
        this.f75032a = c7643av;
        InterfaceC8502iy0 interfaceC8502iy0A = C8609jy0.a(context);
        this.f75033b = interfaceC8502iy0A;
        InterfaceC8502iy0 interfaceC8502iy0A2 = C8609jy0.a(str);
        this.f75034c = interfaceC8502iy0A2;
        P40 p40 = new P40(interfaceC8502iy0A, c7643av.f73482i1, c7643av.f73485j1);
        this.f75035d = p40;
        InterfaceC9464ry0 interfaceC9464ry0B = C8397hy0.b(new T30(c7643av.f73482i1));
        this.f75036e = interfaceC9464ry0B;
        InterfaceC9464ry0 interfaceC9464ry0B2 = C8397hy0.b(new V30(interfaceC8502iy0A, c7643av.f73465d, c7643av.f73443T, p40, interfaceC9464ry0B, C9909w60.a(), c7643av.f73492m));
        this.f75037f = interfaceC9464ry0B2;
        this.f75038g = C8397hy0.b(new C7663b40(c7643av.f73443T, interfaceC8502iy0A, interfaceC8502iy0A2, interfaceC9464ry0B2, interfaceC9464ry0B, c7643av.f73492m, c7643av.f73431N));
    }
}
