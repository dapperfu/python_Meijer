package com.scandit.datacapture.barcode.internal.module.spark.ui;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class K implements com.scandit.datacapture.barcode.internal.module.spark.ui.toast.o {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123955a;

    public K(SparkScanViewPresenter owner) {
        Intrinsics.j(owner, "owner");
        this.f123955a = new WeakReference(owner);
    }
}
