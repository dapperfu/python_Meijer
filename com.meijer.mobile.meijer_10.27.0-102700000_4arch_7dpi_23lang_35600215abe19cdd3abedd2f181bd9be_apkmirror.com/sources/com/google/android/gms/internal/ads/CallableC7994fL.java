package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC7994fL implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final Lc.a f74080a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f74081b;

    /* renamed from: c, reason: collision with root package name */
    private final C9812wN f74082c;

    /* renamed from: d, reason: collision with root package name */
    private final C9710vS f74083d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f74084e;

    /* renamed from: f, reason: collision with root package name */
    private final M9 f74085f;

    /* renamed from: g, reason: collision with root package name */
    private final Qc.a f74086g;

    /* renamed from: h, reason: collision with root package name */
    private final R90 f74087h;

    /* renamed from: i, reason: collision with root package name */
    private final GS f74088i;

    /* renamed from: j, reason: collision with root package name */
    private final C9998y60 f74089j;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C8315iL c8315iL = new C8315iL(this);
        c8315iL.k();
        return c8315iL;
    }

    public CallableC7994fL(Context context, Executor executor, M9 m92, Qc.a aVar, Lc.a aVar2, C6673Dt c6673Dt, C9710vS c9710vS, R90 r90, C9812wN c9812wN, GS gs2, C9998y60 c9998y60) {
        this.f74081b = context;
        this.f74084e = executor;
        this.f74085f = m92;
        this.f74086g = aVar;
        this.f74080a = aVar2;
        this.f74083d = c9710vS;
        this.f74087h = r90;
        this.f74082c = c9812wN;
        this.f74088i = gs2;
        this.f74089j = c9998y60;
    }
}
