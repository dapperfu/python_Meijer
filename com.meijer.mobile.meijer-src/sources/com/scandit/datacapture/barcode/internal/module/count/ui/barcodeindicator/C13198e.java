package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13198e {

    /* renamed from: a, reason: collision with root package name */
    public final TrackedBarcode f122388a;

    /* renamed from: b, reason: collision with root package name */
    public final V f122389b;

    /* renamed from: c, reason: collision with root package name */
    public final float f122390c;

    public C13198e(TrackedBarcode barcode, V overlayInfo, float f10) {
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(overlayInfo, "overlayInfo");
        this.f122388a = barcode;
        this.f122389b = overlayInfo;
        this.f122390c = f10;
    }
}
