package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9357qy implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f78713a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f78714b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f78715c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f78716d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10213yy0 f78717e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC10213yy0 f78718f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC10213yy0 f78719g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC10213yy0 f78720h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC10213yy0 f78721i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC10213yy0 f78722j;

    public C9357qy(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05, InterfaceC10213yy0 interfaceC10213yy06, InterfaceC10213yy0 interfaceC10213yy07, InterfaceC10213yy0 interfaceC10213yy08, InterfaceC10213yy0 interfaceC10213yy09, InterfaceC10213yy0 interfaceC10213yy010) {
        this.f78713a = interfaceC10213yy0;
        this.f78714b = interfaceC10213yy02;
        this.f78715c = interfaceC10213yy03;
        this.f78716d = interfaceC10213yy04;
        this.f78717e = interfaceC10213yy05;
        this.f78718f = interfaceC10213yy06;
        this.f78719g = interfaceC10213yy07;
        this.f78720h = interfaceC10213yy08;
        this.f78721i = interfaceC10213yy09;
        this.f78722j = interfaceC10213yy010;
    }

    public static C9250py b(C10321zz c10321zz, Context context, C7560a60 c7560a60, View view, InterfaceC9133ot interfaceC9133ot, InterfaceC10214yz interfaceC10214yz, II ii2, C8538jG c8538jG, InterfaceC7863cy0 interfaceC7863cy0, Executor executor) {
        return new C9250py(c10321zz, context, c7560a60, view, interfaceC9133ot, interfaceC10214yz, ii2, c8538jG, interfaceC7863cy0, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9250py zzb() {
        return new C9250py(((JA) this.f78713a).zzb(), (Context) this.f78714b.zzb(), ((C9998wy) this.f78715c).a(), ((C9891vy) this.f78716d).a(), ((C7041Ky) this.f78717e).a(), ((C10105xy) this.f78718f).a(), ((EH) this.f78719g).a(), (C8538jG) this.f78720h.zzb(), C8397hy0.a(C9678ty0.a(this.f78721i)), (Executor) this.f78722j.zzb());
    }
}
