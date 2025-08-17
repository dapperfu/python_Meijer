package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122453a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f122454b;

    public v(Function0 getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f122453a = getImpl;
        this.f122454b = LazyKt.b(new u(this));
    }
}
