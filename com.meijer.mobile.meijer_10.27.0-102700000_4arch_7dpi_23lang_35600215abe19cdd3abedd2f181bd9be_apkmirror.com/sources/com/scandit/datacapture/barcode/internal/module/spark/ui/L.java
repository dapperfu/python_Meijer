package com.scandit.datacapture.barcode.internal.module.spark.ui;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class L implements F {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123004a;

    public L(SparkScanViewPresenter owner) {
        Intrinsics.j(owner, "owner");
        this.f123004a = new WeakReference(owner);
    }
}
