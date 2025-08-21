package com.scandit.datacapture.barcode.internal.module.spark.data;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13330j implements com.scandit.datacapture.barcode.internal.module.spark.internal.u {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123858a;

    public C13330j(SparkScanStateManager owner) {
        Intrinsics.j(owner, "owner");
        this.f123858a = new WeakReference(owner);
    }
}
