package com.scandit.datacapture.barcode.internal.module.spark.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f123888a;

    /* renamed from: b, reason: collision with root package name */
    public final x f123889b;

    public e(b subscribable, x listener) {
        Intrinsics.j(subscribable, "subscribable");
        Intrinsics.j(listener, "listener");
        this.f123888a = subscribable;
        this.f123889b = listener;
    }
}
