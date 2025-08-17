package com.scandit.datacapture.barcode.internal.module.spark.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f122936a;

    /* renamed from: b, reason: collision with root package name */
    public final x f122937b;

    public e(b subscribable, x listener) {
        Intrinsics.j(subscribable, "subscribable");
        Intrinsics.j(listener, "listener");
        this.f122936a = subscribable;
        this.f122937b = listener;
    }
}
