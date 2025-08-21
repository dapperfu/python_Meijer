package com.scandit.datacapture.barcode.internal.module.spark.ui;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class L implements F {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123956a;

    public L(SparkScanViewPresenter owner) {
        Intrinsics.j(owner, "owner");
        this.f123956a = new WeakReference(owner);
    }
}
