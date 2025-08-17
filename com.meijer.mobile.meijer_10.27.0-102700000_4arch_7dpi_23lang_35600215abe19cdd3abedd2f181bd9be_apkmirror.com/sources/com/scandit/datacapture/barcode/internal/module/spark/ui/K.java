package com.scandit.datacapture.barcode.internal.module.spark.ui;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class K implements com.scandit.datacapture.barcode.internal.module.spark.ui.toast.o {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123003a;

    public K(SparkScanViewPresenter owner) {
        Intrinsics.j(owner, "owner");
        this.f123003a = new WeakReference(owner);
    }
}
