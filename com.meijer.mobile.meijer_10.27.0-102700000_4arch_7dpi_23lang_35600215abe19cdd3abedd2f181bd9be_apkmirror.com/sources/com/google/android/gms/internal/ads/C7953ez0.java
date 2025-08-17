package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.ez0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7953ez0 {

    /* renamed from: a, reason: collision with root package name */
    final Context f73965a;

    /* renamed from: b, reason: collision with root package name */
    HC f73966b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC7300Wf0 f73967c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC7300Wf0 f73968d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC7300Wf0 f73969e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC7300Wf0 f73970f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC7300Wf0 f73971g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC9408sf0 f73972h;

    /* renamed from: i, reason: collision with root package name */
    Looper f73973i;

    /* renamed from: j, reason: collision with root package name */
    int f73974j;

    /* renamed from: k, reason: collision with root package name */
    HR f73975k;

    /* renamed from: l, reason: collision with root package name */
    int f73976l;

    /* renamed from: m, reason: collision with root package name */
    boolean f73977m;

    /* renamed from: n, reason: collision with root package name */
    LA0 f73978n;

    /* renamed from: o, reason: collision with root package name */
    long f73979o;

    /* renamed from: p, reason: collision with root package name */
    long f73980p;

    /* renamed from: q, reason: collision with root package name */
    boolean f73981q;

    /* renamed from: r, reason: collision with root package name */
    boolean f73982r;

    /* renamed from: s, reason: collision with root package name */
    String f73983s;

    /* renamed from: t, reason: collision with root package name */
    Py0 f73984t;

    public C7953ez0(final Context context, C7248Us c7248Us) {
        Xy0 xy0 = new Xy0(c7248Us);
        Yy0 yy0 = new Yy0(context);
        InterfaceC7300Wf0 interfaceC7300Wf0 = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Zy0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return new NG0(context);
            }
        };
        InterfaceC7300Wf0 interfaceC7300Wf02 = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.az0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return new Sy0();
            }
        };
        C7633bz0 c7633bz0 = new C7633bz0(context);
        InterfaceC9408sf0 interfaceC9408sf0 = new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.cz0
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return new VB0((HC) obj);
            }
        };
        context.getClass();
        this.f73965a = context;
        this.f73967c = xy0;
        this.f73968d = yy0;
        this.f73969e = interfaceC7300Wf0;
        this.f73970f = interfaceC7300Wf02;
        this.f73971g = c7633bz0;
        this.f73972h = interfaceC9408sf0;
        this.f73973i = OV.R();
        this.f73975k = HR.f67433b;
        this.f73976l = 1;
        this.f73977m = true;
        this.f73978n = LA0.f68304d;
        this.f73984t = new Py0(0.97f, 1.03f, 1000L, 1.0E-7f, OV.K(20L), OV.K(500L), 0.999f, null);
        this.f73966b = HC.f67408a;
        this.f73979o = 500L;
        this.f73980p = 2000L;
        this.f73981q = true;
        this.f73983s = "";
        this.f73974j = -1000;
    }

    static /* synthetic */ ZE0 a(Context context) {
        return new ME0(context, new C8488k0());
    }
}
