package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes11.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ V f124861a = new V();

    /* renamed from: b, reason: collision with root package name */
    public static final long f124862b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f124863c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f124864d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f124865e;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.f147508d;
        f124862b = DurationKt.t(1000L, durationUnit);
        f124863c = DurationKt.t(2000L, durationUnit);
        f124864d = DurationKt.t(500L, durationUnit);
        f124865e = DurationKt.t(250L, durationUnit);
    }
}
