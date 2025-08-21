package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes12.dex */
public final class Z implements W {

    /* renamed from: b, reason: collision with root package name */
    public final N f125825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125826c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f125827d;

    /* renamed from: e, reason: collision with root package name */
    public float f125828e;

    /* renamed from: f, reason: collision with root package name */
    public float f125829f;

    /* renamed from: g, reason: collision with root package name */
    public Y f125830g;

    /* renamed from: h, reason: collision with root package name */
    public long f125831h;

    /* renamed from: i, reason: collision with root package name */
    public long f125832i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f125833j;

    /* renamed from: k, reason: collision with root package name */
    public long f125834k;

    public Z(O cameraInfo) {
        X timeProvider = X.f125819a;
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(timeProvider, "timeProvider");
        this.f125825b = cameraInfo;
        this.f125826c = 4;
        this.f125827d = timeProvider;
        this.f125830g = Y.f125820a;
        Duration.Companion companion = Duration.INSTANCE;
        this.f125831h = companion.c();
        this.f125832i = companion.c();
        this.f125834k = companion.c();
    }
}
