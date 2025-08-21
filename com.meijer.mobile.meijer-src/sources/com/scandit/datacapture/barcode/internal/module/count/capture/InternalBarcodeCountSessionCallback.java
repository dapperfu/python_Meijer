package com.scandit.datacapture.barcode.internal.module.count.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class InternalBarcodeCountSessionCallback {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f122232a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f122233b;

    /* renamed from: c, reason: collision with root package name */
    private final Function2 f122234c;

    public InternalBarcodeCountSessionCallback(com.scandit.datacapture.barcode.count.capture.c reset, com.scandit.datacapture.barcode.count.capture.d toJson, com.scandit.datacapture.barcode.count.capture.e getSpatialMap) {
        Intrinsics.j(reset, "reset");
        Intrinsics.j(toJson, "toJson");
        Intrinsics.j(getSpatialMap, "getSpatialMap");
        this.f122232a = reset;
        this.f122233b = toJson;
        this.f122234c = getSpatialMap;
    }

    public final Function2 a() {
        return this.f122234c;
    }

    public final Function0 b() {
        return this.f122232a;
    }

    public final Function0 c() {
        return this.f122233b;
    }
}
