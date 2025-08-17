package com.scandit.datacapture.core.internal.module.https.scandit;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f124696a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f124697b;

    public M(n0 trustFactory) {
        Intrinsics.j(trustFactory, "trustFactory");
        this.f124696a = LazyKt.b(new L(trustFactory));
        this.f124697b = LazyKt.b(new K(this));
    }
}
