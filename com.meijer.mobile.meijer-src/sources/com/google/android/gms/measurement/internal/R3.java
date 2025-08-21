package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class R3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86031a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86032b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f86033c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f86034d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f86035e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f86036f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f86037g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f86038h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86039i;

    R3(C11393x4 c11393x4, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f86031a = str;
        this.f86032b = str2;
        this.f86033c = j10;
        this.f86034d = bundle;
        this.f86035e = z10;
        this.f86036f = z11;
        this.f86037g = z12;
        this.f86038h = str3;
        Objects.requireNonNull(c11393x4);
        this.f86039i = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f86039i.t(this.f86031a, this.f86032b, this.f86033c, this.f86034d, this.f86035e, this.f86036f, this.f86037g, this.f86038h);
    }
}
