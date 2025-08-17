package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes11.dex */
public final class Z implements W {

    /* renamed from: b, reason: collision with root package name */
    public final N f124873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124874c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f124875d;

    /* renamed from: e, reason: collision with root package name */
    public float f124876e;

    /* renamed from: f, reason: collision with root package name */
    public float f124877f;

    /* renamed from: g, reason: collision with root package name */
    public Y f124878g;

    /* renamed from: h, reason: collision with root package name */
    public long f124879h;

    /* renamed from: i, reason: collision with root package name */
    public long f124880i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124881j;

    /* renamed from: k, reason: collision with root package name */
    public long f124882k;

    public Z(O cameraInfo) {
        X timeProvider = X.f124867a;
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(timeProvider, "timeProvider");
        this.f124873b = cameraInfo;
        this.f124874c = 4;
        this.f124875d = timeProvider;
        this.f124878g = Y.f124868a;
        Duration.Companion companion = Duration.INSTANCE;
        this.f124879h = companion.c();
        this.f124880i = companion.c();
        this.f124882k = companion.c();
    }
}
