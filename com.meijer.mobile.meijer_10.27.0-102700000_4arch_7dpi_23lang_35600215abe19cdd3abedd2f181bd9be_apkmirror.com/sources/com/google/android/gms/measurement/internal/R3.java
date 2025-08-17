package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class R3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85191a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85192b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f85193c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f85194d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f85195e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f85196f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f85197g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f85198h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85199i;

    R3(C11268x4 c11268x4, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f85191a = str;
        this.f85192b = str2;
        this.f85193c = j10;
        this.f85194d = bundle;
        this.f85195e = z10;
        this.f85196f = z11;
        this.f85197g = z12;
        this.f85198h = str3;
        Objects.requireNonNull(c11268x4);
        this.f85199i = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f85199i.t(this.f85191a, this.f85192b, this.f85193c, this.f85194d, this.f85195e, this.f85196f, this.f85197g, this.f85198h);
    }
}
