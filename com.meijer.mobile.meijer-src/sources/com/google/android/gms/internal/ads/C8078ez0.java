package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.ez0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8078ez0 {

    /* renamed from: a, reason: collision with root package name */
    final Context f74805a;

    /* renamed from: b, reason: collision with root package name */
    HC f74806b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC7425Wf0 f74807c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC7425Wf0 f74808d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC7425Wf0 f74809e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC7425Wf0 f74810f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC7425Wf0 f74811g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC9533sf0 f74812h;

    /* renamed from: i, reason: collision with root package name */
    Looper f74813i;

    /* renamed from: j, reason: collision with root package name */
    int f74814j;

    /* renamed from: k, reason: collision with root package name */
    HR f74815k;

    /* renamed from: l, reason: collision with root package name */
    int f74816l;

    /* renamed from: m, reason: collision with root package name */
    boolean f74817m;

    /* renamed from: n, reason: collision with root package name */
    LA0 f74818n;

    /* renamed from: o, reason: collision with root package name */
    long f74819o;

    /* renamed from: p, reason: collision with root package name */
    long f74820p;

    /* renamed from: q, reason: collision with root package name */
    boolean f74821q;

    /* renamed from: r, reason: collision with root package name */
    boolean f74822r;

    /* renamed from: s, reason: collision with root package name */
    String f74823s;

    /* renamed from: t, reason: collision with root package name */
    Py0 f74824t;

    public C8078ez0(final Context context, C7373Us c7373Us) {
        Xy0 xy0 = new Xy0(c7373Us);
        Yy0 yy0 = new Yy0(context);
        InterfaceC7425Wf0 interfaceC7425Wf0 = new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Zy0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return new NG0(context);
            }
        };
        InterfaceC7425Wf0 interfaceC7425Wf02 = new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.az0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return new Sy0();
            }
        };
        C7758bz0 c7758bz0 = new C7758bz0(context);
        InterfaceC9533sf0 interfaceC9533sf0 = new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.cz0
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return new VB0((HC) obj);
            }
        };
        context.getClass();
        this.f74805a = context;
        this.f74807c = xy0;
        this.f74808d = yy0;
        this.f74809e = interfaceC7425Wf0;
        this.f74810f = interfaceC7425Wf02;
        this.f74811g = c7758bz0;
        this.f74812h = interfaceC9533sf0;
        this.f74813i = OV.R();
        this.f74815k = HR.f68273b;
        this.f74816l = 1;
        this.f74817m = true;
        this.f74818n = LA0.f69144d;
        this.f74824t = new Py0(0.97f, 1.03f, 1000L, 1.0E-7f, OV.K(20L), OV.K(500L), 0.999f, null);
        this.f74806b = HC.f68248a;
        this.f74819o = 500L;
        this.f74820p = 2000L;
        this.f74821q = true;
        this.f74823s = "";
        this.f74814j = -1000;
    }

    static /* synthetic */ ZE0 a(Context context) {
        return new ME0(context, new C8613k0());
    }
}
