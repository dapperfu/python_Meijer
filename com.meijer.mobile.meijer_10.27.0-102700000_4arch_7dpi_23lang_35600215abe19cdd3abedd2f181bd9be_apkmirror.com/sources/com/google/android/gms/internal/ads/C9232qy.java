package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9232qy implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f77873a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f77874b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f77875c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f77876d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10088yy0 f77877e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC10088yy0 f77878f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC10088yy0 f77879g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC10088yy0 f77880h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC10088yy0 f77881i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC10088yy0 f77882j;

    public C9232qy(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05, InterfaceC10088yy0 interfaceC10088yy06, InterfaceC10088yy0 interfaceC10088yy07, InterfaceC10088yy0 interfaceC10088yy08, InterfaceC10088yy0 interfaceC10088yy09, InterfaceC10088yy0 interfaceC10088yy010) {
        this.f77873a = interfaceC10088yy0;
        this.f77874b = interfaceC10088yy02;
        this.f77875c = interfaceC10088yy03;
        this.f77876d = interfaceC10088yy04;
        this.f77877e = interfaceC10088yy05;
        this.f77878f = interfaceC10088yy06;
        this.f77879g = interfaceC10088yy07;
        this.f77880h = interfaceC10088yy08;
        this.f77881i = interfaceC10088yy09;
        this.f77882j = interfaceC10088yy010;
    }

    public static C9125py b(C10196zz c10196zz, Context context, C7435a60 c7435a60, View view, InterfaceC9008ot interfaceC9008ot, InterfaceC10089yz interfaceC10089yz, II ii2, C8413jG c8413jG, InterfaceC7738cy0 interfaceC7738cy0, Executor executor) {
        return new C9125py(c10196zz, context, c7435a60, view, interfaceC9008ot, interfaceC10089yz, ii2, c8413jG, interfaceC7738cy0, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9125py zzb() {
        return new C9125py(((JA) this.f77873a).zzb(), (Context) this.f77874b.zzb(), ((C9873wy) this.f77875c).a(), ((C9766vy) this.f77876d).a(), ((C6916Ky) this.f77877e).a(), ((C9980xy) this.f77878f).a(), ((EH) this.f77879g).a(), (C8413jG) this.f77880h.zzb(), C8272hy0.a(C9553ty0.a(this.f77881i)), (Executor) this.f77882j.zzb());
    }
}
