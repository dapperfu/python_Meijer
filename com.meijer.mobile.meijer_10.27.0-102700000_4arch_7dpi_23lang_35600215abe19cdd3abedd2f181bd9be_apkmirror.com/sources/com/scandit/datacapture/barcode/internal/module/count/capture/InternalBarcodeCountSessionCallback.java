package com.scandit.datacapture.barcode.internal.module.count.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class InternalBarcodeCountSessionCallback {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f121280a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f121281b;

    /* renamed from: c, reason: collision with root package name */
    private final Function2 f121282c;

    public InternalBarcodeCountSessionCallback(com.scandit.datacapture.barcode.count.capture.c reset, com.scandit.datacapture.barcode.count.capture.d toJson, com.scandit.datacapture.barcode.count.capture.e getSpatialMap) {
        Intrinsics.j(reset, "reset");
        Intrinsics.j(toJson, "toJson");
        Intrinsics.j(getSpatialMap, "getSpatialMap");
        this.f121280a = reset;
        this.f121281b = toJson;
        this.f121282c = getSpatialMap;
    }

    public final Function2 a() {
        return this.f121282c;
    }

    public final Function0 b() {
        return this.f121280a;
    }

    public final Function0 c() {
        return this.f121281b;
    }
}
