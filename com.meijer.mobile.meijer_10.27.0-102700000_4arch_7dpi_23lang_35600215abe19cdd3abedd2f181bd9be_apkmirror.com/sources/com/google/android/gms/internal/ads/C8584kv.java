package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8584kv implements InterfaceC8497k40 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75715a;

    /* renamed from: b, reason: collision with root package name */
    private final Mc.d2 f75716b;

    /* renamed from: c, reason: collision with root package name */
    private final String f75717c;

    /* renamed from: d, reason: collision with root package name */
    private final C7518av f75718d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9339ry0 f75719e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9339ry0 f75720f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC9339ry0 f75721g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC9339ry0 f75722h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC9339ry0 f75723i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9339ry0 f75724j;

    @Override // com.google.android.gms.internal.ads.InterfaceC8497k40
    public final JW zza() {
        return new JW(this.f75715a, this.f75716b, this.f75717c, (C8178h40) this.f75724j.zzb(), (C7899eX) this.f75721g.zzb(), C6912Ku.b(this.f75718d.f72619b), (C9812wN) this.f75718d.f72591N.zzb());
    }

    /* synthetic */ C8584kv(C7518av c7518av, Context context, String str, Mc.d2 d2Var, C6777Gv c6777Gv) {
        this.f75718d = c7518av;
        this.f75715a = context;
        this.f75716b = d2Var;
        this.f75717c = str;
        InterfaceC8377iy0 interfaceC8377iy0A = C8484jy0.a(context);
        this.f75719e = interfaceC8377iy0A;
        InterfaceC8377iy0 interfaceC8377iy0A2 = C8484jy0.a(d2Var);
        this.f75720f = interfaceC8377iy0A2;
        InterfaceC9339ry0 interfaceC9339ry0B = C8272hy0.b(new C8006fX(c7518av.f72591N));
        this.f75721g = interfaceC9339ry0B;
        InterfaceC9339ry0 interfaceC9339ry0B2 = C8272hy0.b(C8539kX.a());
        this.f75722h = interfaceC9339ry0B2;
        InterfaceC9339ry0 interfaceC9339ry0B3 = C8272hy0.b(FE.a());
        this.f75723i = interfaceC9339ry0B3;
        this.f75724j = C8272hy0.b(new C8285i40(interfaceC8377iy0A, c7518av.f72625d, interfaceC8377iy0A2, c7518av.f72603T, interfaceC9339ry0B, interfaceC9339ry0B2, C9784w60.a(), interfaceC9339ry0B3));
    }
}
