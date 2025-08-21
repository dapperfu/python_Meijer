package com.scandit.datacapture.core.internal.module.https.scandit;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f125648a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f125649b;

    public M(n0 trustFactory) {
        Intrinsics.j(trustFactory, "trustFactory");
        this.f125648a = LazyKt.b(new L(trustFactory));
        this.f125649b = LazyKt.b(new K(this));
    }
}
