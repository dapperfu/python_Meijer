package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ V f125813a = new V();

    /* renamed from: b, reason: collision with root package name */
    public static final long f125814b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f125815c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f125816d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f125817e;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.f148416d;
        f125814b = DurationKt.t(1000L, durationUnit);
        f125815c = DurationKt.t(2000L, durationUnit);
        f125816d = DurationKt.t(500L, durationUnit);
        f125817e = DurationKt.t(250L, durationUnit);
    }
}
