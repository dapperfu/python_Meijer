package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123405a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f123406b;

    public v(Function0 getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f123405a = getImpl;
        this.f123406b = LazyKt.b(new u(this));
    }
}
