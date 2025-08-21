package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC8119fL implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final Nc.a f74920a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f74921b;

    /* renamed from: c, reason: collision with root package name */
    private final C9937wN f74922c;

    /* renamed from: d, reason: collision with root package name */
    private final C9835vS f74923d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f74924e;

    /* renamed from: f, reason: collision with root package name */
    private final M9 f74925f;

    /* renamed from: g, reason: collision with root package name */
    private final Sc.a f74926g;

    /* renamed from: h, reason: collision with root package name */
    private final R90 f74927h;

    /* renamed from: i, reason: collision with root package name */
    private final GS f74928i;

    /* renamed from: j, reason: collision with root package name */
    private final C10123y60 f74929j;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C8440iL c8440iL = new C8440iL(this);
        c8440iL.k();
        return c8440iL;
    }

    public CallableC8119fL(Context context, Executor executor, M9 m92, Sc.a aVar, Nc.a aVar2, C6798Dt c6798Dt, C9835vS c9835vS, R90 r90, C9937wN c9937wN, GS gs2, C10123y60 c10123y60) {
        this.f74921b = context;
        this.f74924e = executor;
        this.f74925f = m92;
        this.f74926g = aVar;
        this.f74920a = aVar2;
        this.f74923d = c9835vS;
        this.f74927h = r90;
        this.f74922c = c9937wN;
        this.f74928i = gs2;
        this.f74929j = c10123y60;
    }
}
